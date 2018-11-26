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
public class DemoFactoryMethod {
    public static void main (String[] args){
        
        Admin adm = new Admin();
        Funcionario f = new Funcionario();
        
        PessoaFactory tipopessoa = new PessoaFactory();
        String tipo = adm.getTipo();
        String tipo2 = f.getTipo();
        
        UsuarioIF pessoa = tipopessoa.gerarPessoa(tipo);
        pessoa.criarPessoa();
        
        pessoa = tipopessoa.gerarPessoa(tipo2);
        pessoa.criarPessoa();
       
        
    }
}
