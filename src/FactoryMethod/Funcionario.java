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
public class Funcionario implements UsuarioIF{
    private String tipo = "funcionario";
    private int idFuncionario;
    private String senha;
    private String nome;
    private String CPF;
    private String rua;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    
    @Override
    public void criarPessoa() {
        System.out.println("Um Funcionario foi criado...");
       
    }

    public Funcionario() {
    }

    public Funcionario(int idFuncionario, String senha, String nome, String CPF, String rua, String bairro, String cep, String cidade, String estado, String telefone, String email) {
        this.idFuncionario = idFuncionario;
        this.senha = senha;
        this.nome = nome;
        this.CPF = CPF;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getRua() {
        return rua;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean validarFuncionario(){
        return true;
        
    }

    
    
    
}
