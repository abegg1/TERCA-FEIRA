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
public class Ponto_Dia {
    private String dia;
    private String colaborador;
    private String retirada;
    private String devolucao;

    public String getDia() {
        return dia;
    }

    public String getColaborador() {
        return colaborador;
    }

    public String getRetirada() {
        return retirada;
    }

    public String getDevolucao() {
        return devolucao;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public void setRetirada(String retirada) {
        this.retirada = retirada;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

}
