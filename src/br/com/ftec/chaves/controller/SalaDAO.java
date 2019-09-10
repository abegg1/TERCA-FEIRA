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

    
            conn =  ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, sala.getSala()); //cada pstm.set coloca valor em uma das? na ordem
            pstm.setString(2, sala.getDescricao());
            pstm.setInt(3, sala.getCapacidade());
            pstm.setString(4, sala.getTipo());
            pstm.execute(); // executa o sql

    }
    public Sala  buscaSalaPorSala(String sala) throws ClassNotFoundException, SQLException{
    String sql = "Select * FROM SALA"+" WHERE SALA = "+sala;
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
    
}