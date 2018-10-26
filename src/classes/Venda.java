/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.regex.Pattern;

/**
 *
 * @author Douglas
 */
public class Venda {
    
    private int idVenda;
    private String dataVenda;
    private float valorTotal;
    private int quantidade;
    private String sementes;

    public Venda() {
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSementes() {
        return sementes;
    }

    public void setSementes(String sementes) {
        this.sementes = sementes;
    }
    
    public boolean validaVenda(){
    return ValidaDataVenda() && ValidaValorTotal() && ValidaQtd();
    }
    

    public boolean ValidaDataVenda(){
        if(dataVenda.length()<8 || dataVenda.length()>8){
            //JOptionPane.showMessageDialog(null, "O nome da semente deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }       
        if (Pattern.compile("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)\\d{2,2}").matcher(dataVenda).find()) {
            //JOptionPane.showMessageDialog(null, "O nome do cliente deve ter apenas letras0 "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}$"
            return false;
        }
        return true;    
    }
    public boolean ValidaValorTotal(){
        if(valorTotal <= 0){
            //JOptionPane.showMessageDialog(null, "O preço de venda deve ser maior que o preço de compra!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }    
  
    public boolean ValidaQtd(){
         if(quantidade <= 0){
            //JOptionPane.showMessageDialog(null, "O preço de venda deve ser maior que o preço de compra!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;    
    }
    /*
    public boolean ValidaSementesVenda(){
     if(sementes ){
            //JOptionPane.showMessageDialog(null, "O preço de venda deve ser maior que o preço de compra!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }*/

    
}
