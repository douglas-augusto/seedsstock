/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author joaoramyllo
 */
public interface DaoInterface<Tipo> {
    
    public boolean salvar(Tipo objeto) throws Exception;
       
    public List<Tipo> read(String sql) throws Exception;

    public boolean alterar(Tipo objeto) throws Exception;

    public boolean excluir(int id) throws Exception;
    
    


/*public interface IDAO<Tipo> {

    public void inserir(Tipo objeto) throws Exception;

    public void alterar(Tipo objeto) throws Exception;

    public void excluir(Tipo objeto) throws Exception;

    public ArrayList<Tipo> listarTodos() throws Exception;

    public Tipo recuperar(int codigo) throws Exception;
}*/
    
}
