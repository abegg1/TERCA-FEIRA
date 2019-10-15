/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.controller;

import br.com.ftec.chaves.controller.ConnectionFactory;
import br.com.ftec.chaves.model.Colaborador;
import br.com.ftec.chaves.model.Sala;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bernadete.abegg
 */
public class SalaDAO {
    
    public void salvar(Sala sala) throws ClassNotFoundException, SQLException {

        
        
        //criação do SQL para salvar valores da sala no banco
        //cada ? representa os valores que serão colocados para cada campo
        //em ordem.
        String sql = "INSERT INTO SALA(sala, descricao, capacidade, tipo) VALUES (?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

    
            conn =  ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, sala.getSala()); //cada pstm.set coloca valor em uma das? na ordem
            pstm.setString(2, sala.getDescricao());
            pstm.setInt(3, sala.getCapacidade());
            pstm.setString(4, sala.getTipo());
            pstm.execute(); // executa o sql

    }
     public void excluirSala(int id) throws ClassNotFoundException, SQLException {

        //criação do SQL para salvar valores da sala no banco
        //cada ? representa os valores que serão colocados para cada campo
        //em ordem.
        String sql = "delete from sala where id='"+id+"'";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

    
            conn =  ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
   
    }
    
    public Sala  buscaSalaPorSala(String sala) throws ClassNotFoundException, SQLException{
    String sql = "Select * FROM SALA"+" WHERE SALA = '"+sala+"'";
    Connection conn = null;
    PreparedStatement pstm = null;
    
    ResultSet rset = null;
    Sala sl = new Sala();
     conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rset = pstm.executeQuery();
    
    while(rset.next()){
        sl.setId(rset.getInt("id"));        
        sl.setDescricao("descricao");
        sl.setSala("sala");
        sl.setTipo("tipo");
        sl.setCapacidade(rset.getInt("capacidade"));
        
    }   
    return sl;
    
    }
    public List<Sala> listaSalas() throws ClassNotFoundException, SQLException{
        String sqli = "Select * from sala";
        Connection conn = null;
        PreparedStatement pstm = null;
    
        ResultSet rset = null;
    
        ArrayList<Sala> listaSalas = new ArrayList<Sala> ();
        
        conn =  ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sqli);
        rset = pstm.executeQuery();
        while(rset.next()){
            Sala s = new Sala();
            s.setId(rset.getInt("id"));        
            s.setDescricao(rset.getString("descricao"));
            s.setSala(rset.getString("sala"));
            s.setTipo(rset.getString("tipo"));
            s.setCapacidade(rset.getInt("capacidade"));
            listaSalas.add(s);
            
            
        }
            
        return listaSalas;
        
    }
    
}
    
