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
        if(sd.salvar(s)){
            assertTrue("Deve retornar TRUE", true);
            //fazer alterações colocando o valida
            System.out.println("Teste CADASTRAR passou!");
        }else{
            System.out.println("Teste CADASTRAR NAO passou!");
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
            System.out.println("Teste EXCLUIR passou!");
        }else{
            System.out.println("Teste EXCLUIR NAO passou!");
        }
    }
    @Test
    public void testAlterarSemente() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", true);
            System.out.println("Teste ALTERAR passou!");
        }else{
            System.out.println("Teste ALTERAR NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementeNome() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setNome("abcde");
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaNomeSemente());
            System.out.println("Teste ALTERAR NOME passou!");
        }else{
            System.out.println("Teste ALTERAR NOME NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementeOrigem() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setOrigem("CIDADE");
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaOrigemSemente());
            System.out.println("Teste ALTERAR ORIGEM passou!");
        }else{
            System.out.println("Teste ALTERAR ORIGEM NAO passou!");
        } 
    }
    /*
    @Test
    public void testAlterarSementeOrigemComCaractere() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setOrigem("@CIDADE");
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaOrigemSemente());
            System.out.println("Teste ALTERAR ORIGEM passou!");
        }else{
            System.out.println("Teste ALTERAR ORIGEM NAO passou!");
        } 
    }*/
    @Test
    public void testAlterarSementeEspecie() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setEspecie("abcde");
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaEspecieSemente());
            System.out.println("Teste ALTERAR ESPECIE passou!");
        }else{
            System.out.println("Teste ALTERAR ESPECIE NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementeQtd() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setQuant(1);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaQtdSemente());
            System.out.println("Teste ALTERAR QTD passou!");
        }else{
            System.out.println("Teste ALTERAR QTD NAO passou!");
        } 
    }
     @Test
    public void testAlterarSementeRaridade() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setRaridade("B");
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaRaridade());
            System.out.println("Teste ALTERAR RARIDADE passou!");
        }else{
            System.out.println("Teste ALTERAR RARIDADE NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementeRaridadeCaractere() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setRaridade("@");
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaRaridade());
            System.out.println("Teste ALTERAR RARIDADE NAO passou!");
        }else{
            System.out.println("Teste ALTERAR RARIDADE passou!");
        } 
    }
    @Test
    public void testAlterarSementeRaridadeOutraLetra() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setRaridade("G");
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaRaridade());
            System.out.println("Teste ALTERAR RARIDADE NAO passou!");
        }else{
            System.out.println("Teste ALTERAR RARIDADE passou!");
        } 
    }
     @Test
    public void testAlterarSementeDiaColheita() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setDia_col(04);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaDiaColSemente());
            System.out.println("Teste ALTERAR DIA COLHEITA passou!");
        }else{
            System.out.println("Teste ALTERAR DIA COLHEITA NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementeDiaColheitaMenor() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setDia_col(00);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaDiaColSemente());
            System.out.println("Teste ALTERAR DIA COLHEITA NAO passou!");
        }else{
            System.out.println("Teste ALTERAR DIA COLHEITA passou!");
        } 
    }
    @Test
    public void testAlterarSementeDiaColheitaMaior() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setDia_col(100);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaDiaColSemente());
            System.out.println("Teste ALTERAR DIA COLHEITA NAO passou!");
        }else{
            System.out.println("Teste ALTERAR DIA COLHEITA passou!");
        } 
    }
     @Test
    public void testAlterarSementeMesColheita() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setMes_col(02);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaMesColSemente());
            System.out.println("Teste ALTERAR MES COLHEITA passou!");
        }else{
            System.out.println("Teste ALTERAR MES COLHEITA NAO passou!");
        } 
    }
     @Test
    public void testAlterarSementeMesColheitaMenor() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setMes_col(0);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaMesColSemente());
            System.out.println("Teste ALTERAR MES COLHEITA NAO passou!");
        }else{
            System.out.println("Teste ALTERAR MES COLHEITA passou!");
        } 
    }
     @Test
    public void testAlterarSementeMesColheitaMaior() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setMes_col(20);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaMesColSemente());
            System.out.println("Teste ALTERAR MES COLHEITA NAO passou!");
        }else{
            System.out.println("Teste ALTERAR MES COLHEITA passou!");
        } 
    }
    @Test
    public void testAlterarSementeAnoColheita() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setAno_col(2000);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaAnoColSemente());
            System.out.println("Teste ALTERAR ANO COLHEITA passou!");
        }else{
            System.out.println("Teste ALTERAR ANO COLHEITA NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementeAnoColheitaMenor() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setAno_col(000);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaAnoColSemente());
            System.out.println("Teste ALTERAR ANO COLHEITA NAO passou!");
        }else{
            System.out.println("Teste ALTERAR ANO COLHEITA passou!");
        } 
    }
    @Test
    public void testAlterarSementeAnoColheitaMaior() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setAno_col(3000);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaAnoColSemente());
            System.out.println("Teste ALTERAR ANO COLHEITA NAO passou!");
        }else{
            System.out.println("Teste ALTERAR ANO COLHEITA passou!");
        } 
    }
    @Test
    public void testAlterarSementeDiaValidade() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setDia_val(04);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaDiaValSemente());
            System.out.println("Teste ALTERAR DIA VALIDADE passou!");
        }else{
            System.out.println("Teste ALTERAR DIA VALIDADE NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementeDiaValidadeMenor() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setDia_val(0);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaDiaValSemente());
            System.out.println("Teste ALTERAR DIA VALIDADE NAO passou!");
        }else{
            System.out.println("Teste ALTERAR DIA VALIDADE passou!");
        } 
    }
    @Test
    public void testAlterarSementeDiaValidadeMaior() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setDia_val(40);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaDiaValSemente());
            System.out.println("Teste ALTERAR DIA VALIDADE NAO passou!");
        }else{
            System.out.println("Teste ALTERAR DIA VALIDADE passou!");
        } 
    }
     @Test
    public void testAlterarSementeMesValidade() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setMes_val(02);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaMesValSemente());
            System.out.println("Teste ALTERAR MES VALIDADE passou!");
        }else{
            System.out.println("Teste ALTERAR MES VALIDADE NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementeMesValidadeMenor() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setMes_val(0);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaMesValSemente());
            System.out.println("Teste ALTERAR MES VALIDADE NAO passou!");
        }else{
            System.out.println("Teste ALTERAR MES VALIDADE passou!");
        } 
    }
    @Test
    public void testAlterarSementeMesValidadeMaior() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setMes_val(15);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaMesValSemente());
            System.out.println("Teste ALTERAR MES VALIDADE NAO passou!");
        }else{
            System.out.println("Teste ALTERAR MES VALIDADE passou!");
        } 
    }
    @Test
    public void testAlterarSementeAnoValidade() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        //////atencao aqui
        s.setAno_col(1999);
        s.setAno_val(2000);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaAnoValSemente());
            System.out.println("Teste ALTERAR ANO VALIDADE passou!");
        }else{
            System.out.println("Teste ALTERAR ANO VALIDADE NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementeAnoValidadeMenor() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        //////atencao aqui
        s.setAno_col(1999);
        s.setAno_val(1998);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaAnoValSemente());
            System.out.println("Teste ALTERAR ANO VALIDADE NAO passou!");
        }else{
            System.out.println("Teste ALTERAR ANO VALIDADE passou!");
        } 
    }
    @Test
    public void testAlterarSementePrecoCompra() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setPreco_compra(2000);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaPrecoCompra());
            System.out.println("Teste ALTERAR PRECO COMPRA passou!");
        }else{
            System.out.println("Teste ALTERAR PRECO COMPRA NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementePrecoCompraZero() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setPreco_compra(000);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar False", s.validaPrecoCompra());
            System.out.println("Teste ALTERAR PRECO COMPRA NAO passou!");
        }else{
            System.out.println("Teste ALTERAR PRECO COMPRA passou!");
        } 
    }
    @Test
    public void testAlterarSementePrecoVenda() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setPreco_compra(2000);
        s.setPreco_venda(2001);
        if(sd.Alterar(s)){
            assertTrue("Deve retornar TRUE", s.validaPrecoVenda());
            System.out.println("Teste ALTERAR PRECO COMPRA passou!");
        }else{
            System.out.println("Teste ALTERAR PRECO COMPRA NAO passou!");
        } 
    }
    @Test
    public void testAlterarSementePrecoVendaMenor() throws ClassNotFoundException, SQLException{
       Semente s = new Semente();
        SementeDAO sd = new SementeDAO();
        s.setPreco_compra(2000);
        s.setPreco_venda(1999);
        if(sd.Alterar(s)){
            assertFalse("Deve retornar FALSE", s.validaPrecoVenda());
            System.out.println("Teste ALTERAR PRECO COMPRA NAO passou!");
        }else{
            System.out.println("Teste ALTERAR PRECO COMPRA passou!");
        } 
    }
    
    
}
