/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author Renan
 */
public class Admin implements UsuarioIF{
    private String tipo = "admin";
    private int idAdmin;
    private String senha;
    private String nome;
    private String CPF;    
    private String email;
    
    @Override
    public void criarPessoa() {
        System.out.println("Um Admin foi criado...");
    }

    public Admin(int idAdmin, String senha, String nome, String CPF, String email) {
        this.idAdmin = idAdmin;
        this.senha = senha;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
    }

    public Admin() {
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

   
    
    
}
