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
public class PessoaFactory {
    public UsuarioIF gerarPessoa(String tipo){
        if (tipo == "" || tipo == null){
            return null;
        }
        if(tipo.toUpperCase().equals("ADMIN")){
            return new Admin();
        } else if (tipo.toUpperCase().equals("FUNCIONARIO")){
            return new Funcionario();
        }
        
        return null;
    }
}
