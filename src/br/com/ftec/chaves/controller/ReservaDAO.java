/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.controller;

import br.com.ftec.chaves.model.Colaborador;
import br.com.ftec.chaves.model.Reserva;
import br.com.ftec.chaves.model.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bernadete.abegg
 */
public class ReservaDAO {
    
    
    
    public void salvar(Reserva reserva) throws ClassNotFoundException, SQLException {

        //criação do SQL para salvar valores da sala no banco
        //cada ? representa os valores que serão colocados para cada campo
        //em ordem.
        String sql = "insert into reserva(id_sala, id_colaborador, turno, dia)"
                + " VALUES(?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

    
            conn =  ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, reserva.getSala().getId()); //cada pstm.set coloca valor em uma das? na ordem
            pstm.setInt(2, reserva.getColaborador().getId());
            pstm.setString(3, reserva.getTurno());
            pstm.setString(4,reserva.getDia());
            pstm.execute(); // executa o sql

    
    
    
}
     public List<Reserva> listaReserva() throws ClassNotFoundException, SQLException{
        String sqli = "Select * from reserva";
        Connection conn = null;
        PreparedStatement pstm = null;
    
        ResultSet rset = null;
    
        ArrayList<Reserva> listaReservas = new ArrayList<Reserva> ();
        
        conn =  ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sqli);
        rset = pstm.executeQuery();
        while(rset.next()){
            Reserva reserva = new Reserva();
            Colaborador c = new Colaborador();
            Sala s = new Sala();
            c.setId(rset.getInt("id_colaborador"));
            reserva.setColaborador(c);
                s.setId(rset.getInt("id_sala"));
                reserva.setSala(s);
                reserva.setDia(rset.getString("dia"));
                reserva.setTurno(rset.getString("turno"));
                
            listaReservas.add(reserva);
        }  
        
    
            
        return listaReservas;
        }
}


    

