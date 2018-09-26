/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author ramyllo
 */
public class Semente {
        private int idsemente;
	private  String nome;
	private  String especie;
	private  int quant;
	private  String raridade;
	private  int dia_col;
	private  int mes_col;
	private  int ano_col;
	private  int dia_val;
	private  int mes_val;
	private  int ano_val;
	private  float preco_compra;
	private  float preco_venda;
	private  String origem;
	private  String fornecedor;
	private  String condicoes_plantil;
	private  String observacoes;
	
	
	public int getIdsemente() {
		return idsemente;
	}
	public void setIdsemente(int idsemente) {
		this.idsemente = idsemente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	public String getRaridade() {
		return raridade;
	}
	public void setRaridade(String raridade) {
		this.raridade = raridade;
	}
	public int getDia_col() {
		return dia_col;
	}
	public void setDia_col(int dia_col) {
		this.dia_col = dia_col;
	}
	public int getMes_col() {
		return mes_col;
	}
	public void setMes_col(int mes_col) {
		this.mes_col = mes_col;
	}
	public int getAno_col() {
		return ano_col;
	}
	public void setAno_col(int ano_col) {
		this.ano_col = ano_col;
	}
	public int getDia_val() {
		return dia_val;
	}
	public void setDia_val(int dia_val) {
		this.dia_val = dia_val;
	}
	public int getMes_val() {
		return mes_val;
	}
	public void setMes_val(int mes_val) {
		this.mes_val = mes_val;
	}
	public int getAno_val() {
		return ano_val;
	}
	public void setAno_val(int ano_val) {
		this.ano_val = ano_val;
	}
	public float getPreco_compra() {
		return preco_compra;
	}
	public void setPreco_compra(float preco_compra) {
		this.preco_compra = preco_compra;
	}
	public float getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getCondicoes_plantil() {
		return condicoes_plantil;
	}
	public void setCondicoes_plantil(String condicoes_plantil) {
		this.condicoes_plantil = condicoes_plantil;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
        
        public boolean validarSemente(){
        return validaNomeSemente() && validaPrecoCompra() && validaPrecoVenda() && validaQtdSemente();
    }
    
    public boolean validaNomeSemente(){
        if(nome.length()<4 || nome.length()>20){
            //JOptionPane.showMessageDialog(null, "O nome da semente deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }         
        return true;
    }
    
    public boolean validaEspecieSemente(){
        if(especie.length()<4 || especie.length()>20){
            //JOptionPane.showMessageDialog(null, "O nome da semente deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }         
        return true;
    }
    
    public boolean validaPrecoCompra(){
        if(preco_compra <= 0){
            //JOptionPane.showMessageDialog(null, "O preço de compra deve ser maior que 0!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean validaPrecoVenda(){
        if(preco_venda <= 0 || preco_venda <= preco_compra){
            //JOptionPane.showMessageDialog(null, "O preço de venda deve ser maior que o preço de compra!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean validaRaridade(){
        if(raridade != "A"  && raridade != "B" && raridade != "C" && raridade != "D"){
            //JOptionPane.showMessageDialog(null, "O preço de venda deve ser maior que o preço de compra!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean validaQtdSemente(){
        if(quant < 0){
            //JOptionPane.showMessageDialog(null, "A quantidade de produtos deve ser maior ou igual à 0", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
        
    public boolean validaDiaColSemente(){
        if(dia_col < 1 || dia_col > 31){
            //JOptionPane.showMessageDialog(null, "A quantidade de produtos deve ser maior ou igual à 0", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean validaMesColSemente(){
        if(mes_col < 1 || mes_col > 12){
            //JOptionPane.showMessageDialog(null, "A quantidade de produtos deve ser maior ou igual à 0", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean validaAnoColSemente(){
        if(ano_col < 1 || ano_col > 2018){
            //JOptionPane.showMessageDialog(null, "A quantidade de produtos deve ser maior ou igual à 0", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean validaDiaValSemente(){
        if(dia_val < 1 || dia_val > 31){
            //JOptionPane.showMessageDialog(null, "A quantidade de produtos deve ser maior ou igual à 0", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean validaMesValSemente(){
        if(mes_val < 1 || mes_val > 12){
            //JOptionPane.showMessageDialog(null, "A quantidade de produtos deve ser maior ou igual à 0", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean validaAnoValSemente(){
        if(ano_val < ano_col ){
            //JOptionPane.showMessageDialog(null, "A quantidade de produtos deve ser maior ou igual à 0", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
	
}
