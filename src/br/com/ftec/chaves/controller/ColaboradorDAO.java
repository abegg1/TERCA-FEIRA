package br.com.ftec.chaves.controller;

import br.com.ftec.chaves.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ColaboradorDAO {
    
   public void salvar(Colaborador colaborador){
     
        String sqlInsercaoSala = "insert into colaborador(nome,cpf,senha,telefone,email) "
                + "VALUES(?,?,?,?,?);";

        Connection conexaoBancoDados = null;
        PreparedStatement parametrosInsersao = null;
        
        try {
            conexaoBancoDados = ConnectionFactory.createConnectionToMySQL();
            parametrosInsersao = conexaoBancoDados.prepareStatement(sqlInsercaoSala);
            parametrosInsersao.setString(1,colaborador.getNome());
            parametrosInsersao.setString(2,colaborador.getCpf());
            parametrosInsersao.setString(3,colaborador.getSenha());
            parametrosInsersao.setString(4,colaborador.getTelefone());
            parametrosInsersao.setString(5,colaborador.getEmail());
            parametrosInsersao.execute();   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }    
    
   public Colaborador buscarColaboradorPorCpf(String cpf){
        
        String sqlInsercaoSala = "SELECT * FROM colaborador WHERE cpf = ?";

        Colaborador colaborador = new Colaborador();
        
        Connection conexaoBancoDados = null;
        PreparedStatement parametrosInsersao = null;
        ResultSet resultado = null;
        
        try {
            conexaoBancoDados = ConnectionFactory.createConnectionToMySQL();
            parametrosInsersao = conexaoBancoDados.prepareStatement(sqlInsercaoSala);
            parametrosInsersao.setString(1,cpf);
            resultado = parametrosInsersao.executeQuery();   
            while(resultado.next()){
                colaborador.setId(resultado.getInt("id"));
                colaborador.setNome(resultado.getString("nome"));
                colaborador.setSenha(resultado.getString("senha"));
                colaborador.setCpf(resultado.getString("cpf"));
                colaborador.setEmail(resultado.getString("email"));
                colaborador.setTelefone(resultado.getString("telefone"));
            } 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        return colaborador;
    }    
     public List<Colaborador> listaColaborador() throws ClassNotFoundException, SQLException{
        String sqli = "Select * from colaborador";
        Connection conn = null;
        PreparedStatement pstm = null;
    
        ResultSet rset = null;
    
        ArrayList<Colaborador> listaColaboradores = new ArrayList<Colaborador> ();
        
        conn =  ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sqli);
        rset = pstm.executeQuery();
        while(rset.next()){
            Colaborador colaborador = new Colaborador();
            colaborador.setId(rset.getInt("id"));
                colaborador.setNome(rset.getString("nome"));
                colaborador.setSenha(rset.getString("senha"));
                colaborador.setCpf(rset.getString("cpf"));
                colaborador.setEmail(rset.getString("email"));
                colaborador.setTelefone(rset.getString("telefone"));
            listaColaboradores.add(colaborador);
        }  
        
    
            
        return listaColaboradores;
        }
}
