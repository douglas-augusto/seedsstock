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
        return validaNomeFornecedor() && validaCnpjFornecedor()&& validaRuaFornecedor()&& validaCelularFornecedor() && validaTelefoneFornecedor() && validaCidadeFornecedor() && validaBairroFornecedor() && validaEstadoFornecedor() && validaCepFornecedor() && validaEmailFornecedor() && validaObsFornecedor();
    }
    
    public boolean validaNomeFornecedor(){
        if(nome.length()<4 || nome.length()>40){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ´~`^ÇçÁáàÀÃãÂâÉéÈèÊêÌìÍíÎîÒòÓóÔôÕõÙùÛû]").matcher(nome).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do cliente deve ter apenas letras");
            return false;
        }
        return true;
    }
     public boolean validaCnpjFornecedor(){
        if(cnpj.length()<18 || cnpj.length()>18){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})").matcher(cnpj).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do cliente deve ter apenas letras");
            return false;
        }
        return true;
    }
    
    public boolean validaRuaFornecedor(){
        if(rua.length()<4 || rua.length()>30){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ´~`^ÇçÁáàÀÃãÂâÉéÈèÊêÌìÍíÎîÒòÓóÔôÕõÙùÛû]").matcher(rua).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
        
    public boolean validaCidadeFornecedor(){
        if(cidade.length()<4 || cidade.length()>30){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ´~`^ÇçÁáàÀÃãÂâÉéÈèÊêÌìÍíÎîÒòÓóÔôÕõÙùÛû]").matcher(cidade).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
    public boolean validaBairroFornecedor(){
        if(bairro.length()<4 || bairro.length()>30){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z ´~`^ÇçÁáàÀÃãÂâÉéÈèÊêÌìÍíÎîÒòÓóÔôÕõÙùÛû]").matcher(bairro).find()) {
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
        if (Pattern.compile("[^a-zA-Z ´~`^ÇçÁáàÀÃãÂâÉéÈèÊêÌìÍíÎîÒòÓóÔôÕõÙùÛû]").matcher(estado).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
    
    public boolean validaTelefoneFornecedor(){
        if(telefone.length()!=10){
            //JOptionPane.showMessageDialog(null, "O cep do Fornecedor deve conter 8 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("^\\d{2}-\\d{4}-\\d{4}$").matcher(telefone).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        if (Pattern.compile("[^0-9]").matcher(telefone).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras"); "^\\d{5}\\-?\\d{3}$" ^[0-9]{5}-[0-9]{3}
            return false;
        }
        return true;
    }
    public boolean validaCelularFornecedor(){
        if(celular.length()!=11){
            //JOptionPane.showMessageDialog(null, "O cep do Fornecedor deve conter 8 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("^\\d{2}-\\d{5}-\\d{4}$").matcher(celular).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        if (Pattern.compile("[^0-9]").matcher(celular).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras"); "^\\d{5}\\-?\\d{3}$" ^[0-9]{5}-[0-9]{3}
            return false;
        }
        return true;
    }
    public boolean validaCepFornecedor(){
        if(cep.length()!=8){
            //JOptionPane.showMessageDialog(null, "O cep do Fornecedor deve conter 8 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^0-9]").matcher(cep).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras"); "^\\d{5}\\-?\\d{3}$" ^[0-9]{5}-[0-9]{3}
            return false;
        }
        return true;
    }
    
    public boolean validaEmailFornecedor(){
        if(email.length()<10 || email.length()>45){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("/^[^0-9][A-z0-9_]+([.][A-z0-9_]+)*[@][A-z0-9_]+([.][A-z0-9_]+)*[.][A-z]{2,4}$/").matcher(email).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
            //^[\\p{L}\\p{N}\\._%+-]+@[\\p{L}\\p{N}\\.\\-]+\\.[\\p{L}]{2,}$
        }
        return true;
    }
    
    public boolean validaObsFornecedor(){
        if(obs.length()<4 || obs.length()>45){
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("[^a-zA-Z0-9 !.;,:´`~^ÇçÁáàÀÃãÂâÉéÈèÊêÌìÍíÎîÒòÓóÔôÕõÙùÛû?]").matcher(obs).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do Fornecedor deve ter apenas letras");
            return false;
        }
        return true;
    }
    
	
}

