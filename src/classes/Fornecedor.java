/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.regex.Pattern;

/**
 *
 * @author ramyllo
 */
public class Fornecedor {
    private int idfornecedor;
    private String nome;
    private String cnpj;
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
    private String telefone;
    private String celular;
    private String email;
    private String obs;

    public int getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(int idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    ///////////////////////////////////////
    
    public boolean validarFornecedor(){
        return validaNomeFornecedor() && validaCnpjFornecedor()&& validaRuaFornecedor()&& validaCidadeFornecedor() && validaEstadoFornecedor() && validaEmailFornecedor() && validaObsFornecedor();
    }
    
    public boolean validaNomeFornecedor(){
        if(nome.length()<4 || nome.length()>20){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ]").matcher(nome).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do cliente deve ter apenas letras");
            return false;
        }
        return true;
    }
     public boolean validaCnpjFornecedor(){
        if(cnpj.length()<4 || cnpj.length()>20){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ]").matcher(cnpj).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do cliente deve ter apenas letras");
            return false;
        }
        return true;
    }
    
    public boolean validaRuaFornecedor(){
        if(rua.length()<4 || rua.length()>20){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ]").matcher(rua).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
        
    public boolean validaCidadeFornecedor(){
        if(cidade.length()<4 || cidade.length()>20){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ]").matcher(cidade).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
    public boolean validaBairroFornecedor(){
        if(bairro.length()<4 || bairro.length()>20){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ]").matcher(bairro).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
    public boolean validaEstadoFornecedor(){
        if(estado.length()<2 || estado.length()>20){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ]").matcher(estado).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
    
    /*
    TELEFONE
    
    CELULAR
    */
    /*
    public boolean validaCepFornecedor(){
        if(cep.length()!=9){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ]").matcher(rua).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }*/
    
    public boolean validaEmailFornecedor(){
        if(email.length()<4 || email.length()>20){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$").matcher(email).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
    
    public boolean validaObsFornecedor(){
        if(obs.length()<4 || obs.length()>45){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ]").matcher(obs).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
    
	
}

