
import classes.Venda;
import java.sql.Date;
import java.text.SimpleDateFormat;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sales Macedo
 */
public class VendaTestes {
      Venda v;
    
    @Before
    public void setUp() {
        v = new Venda();
    }
    
    @Test
    public void testDataVendaVazio(){
          Date date = null;
      v.setDataVenda(date);
        assertFalse("Deveria retornar falso", v.validaDataVenda());  
    }
    /*
    @Test
    public void testDataVendaCorreta(){
        SimpleDateFormat sdf1 = new SimpleDateFormat("AAAA/DD/MM");
          Date date = null;
      v.setDataVenda(date);
        assertFalse("Deveria retornar falso", v.validaDataVenda());  
    }*/
    
    @Test
    public void testValorTotavVenda0(){
        v.setValorTotal(0);
        assertFalse("Deveria retornar falso", v.validaValorTotal());  
    }
    @Test
    public void testValorTotavVendaNegativo(){
        v.setValorTotal(-1);
        assertFalse("Deveria retornar falso", v.validaValorTotal());  
    }
    @Test
    public void testValorTotavVendaCorreto(){
        v.setValorTotal(5);
        assertTrue("Deveria retornar falso", v.validaValorTotal());  
    }
    @Test
    public void testQtdVenda0(){
        v.setQuantidade(0);
        assertFalse("Deveria retornar falso", v.validaQtd());  
    }
    @Test
    public void testQtdVendaNegativo(){
        v.setQuantidade(-1);
        assertFalse("Deveria retornar falso", v.validaQtd());  
    }
    @Test
    public void testQtdVendaCorreto(){
        v.setQuantidade(5);
        assertTrue("Deveria retornar true", v.validaQtd());  
    }
    @Test
    public void validaSementesVazio(){
        v.setSementes("");
        assertFalse("Deveria retornar falso", v.validaSementes());
    }
    @Test
    public void validaSementesCorreto(){
        v.setSementes("Morango");
        assertTrue("Deveria retornar true", v.validaSementes());
    }
    
    
}
