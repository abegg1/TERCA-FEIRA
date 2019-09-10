/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.model;

/**
 *
 * @author bernadete.abegg
 */
public class Reserva {
    private Sala sala;
    private String turno;
    private String dia;
    private Colaborador colaborador;

    public Reserva(Sala sala, String turno, String dia, Colaborador colaborador) {
        this.sala = sala;
        this.turno = turno;
        this.dia = dia;
        this.colaborador = colaborador;
    }

    public Reserva() {
    }

    public Sala getSala() {
        return sala;
    }

    public String getTurno() {
        return turno;
    }

    public String getDia() {
        return dia;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
  
    

    
    
}
