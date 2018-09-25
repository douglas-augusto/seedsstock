/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import classes.Semente;
import DAO.SementeDAO;
import com.sun.org.apache.xpath.internal.operations.Equals;
import conection.MakeConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sales Macedo
 */
public class SementeDAOTest {
    
    public SementeDAOTest() {
    }

    @Test
    public void testCadastraSemente() throws ClassNotFoundException, SQLException {
        Semente s = new Semente();
        
        
        s.setNome("teste");
        s.setEspecie("Teste");
        s.setQuant(1);
        s.setRaridade("A");
        s.setDia_col(10);
        s.setMes_col(10);
        s.setAno_col(1010);
        s.setDia_val(11);
        s.setMes_val(11);
        s.setAno_val(1111);
        s.setPreco_compra(15);
        s.setPreco_venda(16);
        

        SementeDAO sd = new SementeDAO();

        //fail("O caso de teste é um protótipo.");
        if(sd.salvar(s)){
            assertTrue("Deve retornar TRUE", true);
            System.out.println("Teste passou!");
        }else{
            fail("Teste Não passou.");
        }
        
        //sd.excluir(s.getIdsemente());
    
        }
    @Test
    public void testExcluirSemente() throws ClassNotFoundException, SQLException{
        
        /*Connection con = MakeConnection.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        rs = stmt.executeQuery();*/

        
        Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        if(sd.excluir(sd.getLastId())){
            assertTrue("Deve retornar TRUE", true);
            System.out.println("Teste passou!");
        }else{
            fail("Teste Não passou.");
        }
    }
    @Test
    public void testAlterarSemente() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", true);
            System.out.println("Teste passou!");
        }else{
            fail("Teste Não passou.");
        } 
    }
    @Test
    public void testAlterarSementeNome() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();;
        s.setNome("abc");
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", true);
            System.out.println("Teste passou!");
        }else{
            fail("Teste Não passou.");
        } 
    }
    @Test
    public void testAlterarSementeEspecie() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();;
        s.setEspecie("abc");
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", true);
            System.out.println("Teste passou!");
        }else{
            fail("Teste Não passou.");
        } 
    }
    @Test
    public void testAlterarSementeQtd() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();;
        s.setQuant(1);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", true);
            System.out.println("Teste passou!");
        }else{
            fail("Teste Não passou.");
        } 
    }
    public void testAlterarSementeRaridade() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();;
        s.setRaridade("D");
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", true);
            System.out.println("Teste passou!");
        }else{
            fail("Teste Não passou.");
        } 
    }
    
}
