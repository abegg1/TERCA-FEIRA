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
public class Colaborador {
   private String nome;
   private String cpf;
   private String senha; 
   private String telefone;
   private String email;
   private int id;

    public Colaborador() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Colaborador(String nome, String cpf, String senha, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
   
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  nome;
    }

    

}
