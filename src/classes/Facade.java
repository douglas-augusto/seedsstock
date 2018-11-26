/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import DAO.AdminDAO;
import DAO.FornecedorDAO;
import DAO.FuncionarioDAO;
import DAO.SementeDAO;
import FactoryMethod.Admin;
import FactoryMethod.Funcionario;
import java.sql.SQLException;

/**
 *
 * @author Renan
 */
public class Facade {
    Fornecedor f;
    Semente s;
    Admin a;
    FuncionarioDAO fu;
    SementeDAO semDAO;
    FornecedorDAO forDAO;
    AdminDAO adao;
    
    
    public Facade(){
        f = new Fornecedor();
        s = new Semente();
        a = new Admin();
        fu = new FuncionarioDAO();
        semDAO = new SementeDAO();
        forDAO = new FornecedorDAO();
        adao = new AdminDAO();
        
    }
    
    public void facadeSalvarSementeDAO(Semente s) throws ClassNotFoundException, SQLException{
        semDAO.salvar(s);
        System.out.println("Semente salva no Banco");
    }
    
    public void facadeValidaSemente(){
        System.out.println("Validando semente");
        s.validarSemente();
    }
    
    public void facadeValidaFornecedor(){
        System.out.println("Validando fornecedor...");
        f.validarFornecedor();
    }
    
    public void facadeCriaFornecedor(Fornecedor f) throws ClassNotFoundException, SQLException{
        forDAO.salvar(f);
    }
    
    public void facadeAlteraFornecedorDAO(Fornecedor f) throws ClassNotFoundException, SQLException{
        forDAO.alterar(f);
        System.out.println("Fornecedor alterado no banco.");
    }
    
    
    public void facadeCriaFuncionario(Funcionario f) throws ClassNotFoundException{
        fu.create(f);
    }
    
    
    public void facadeCriarUsuarioAdmin() throws ClassNotFoundException{
        System.out.println("Criando adm");
        adao.create(a);
    }
    
   
    
}
