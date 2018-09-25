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
        
        /*
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
        */

        SementeDAO sd = new SementeDAO();

        //fail("O caso de teste é um protótipo.");
        if(sd.salvar(s)){
            System.out.println("Teste passou!");
        }else{
            fail("Teste Não passou.");
        }
        
        //sd.excluir(s.getIdsemente());
    }
    @Test
    public void testExcluirSemente() throws ClassNotFoundException, SQLException{
        /*Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setIdsemente(sd.selecionaUltimo());
        if(sd.excluir(s.getIdsemente())){
            System.out.println("Teste passou!");
        }else{
            fail("O caso de teste é um protótipo.");
        }*/
        Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        if(sd.excluir(s.getIdsemente())){
            System.out.println("Teste passou!");
        }else{
            fail("Teste Não passou.");
        }
    }
    
}
