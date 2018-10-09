
import classes.Semente;
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
 * @author Douglas
 */
public class SementeTestes {
    
    Semente s;
    
    @Before
    public void setUp() {
        s = new Semente();
    }
    
    @Test
    public void testNomeSementeVazio() {
        s.setNome("");
        assertFalse("Deveria retornar falso", s.validaNomeSemente());
    }
    
    @Test
    public void testNomeSementeMenorQue4() {
        s.setNome("cer");
        assertFalse("Deveria retornar falso", s.validaNomeSemente());
    }
    
    @Test
    public void testNomeSementeMaiorQue20() {
        s.setNome("eyrueirudyriduridosieudysueiduf ");
        assertFalse("Deveria retornar falso", s.validaNomeSemente());
    }
    
    @Test
    public void testNomeEspecieMenorQue4() {
        s.setEspecie("cer");
        assertFalse("Deveria retornar falso", s.validaEspecieSemente());
    }
    
    @Test
    public void testNomeEspecieMaiorQue20() {
        s.setEspecie("eyrueirudyriduridosieudysueiduf ");
        assertFalse("Deveria retornar falso", s.validaEspecieSemente());
    }
    
    @Test
    public void testNomeSementeValidoLetrasNumerosCaracEspeciais() {
        s.setNome("kyrtyrtyrty(#)");
        assertFalse("Deveria retornar FALSE", s.validaNomeSemente());
    }
    
    @Test
    public void testPrecoDeCompraIgualA0() {
        s.setPreco_compra(0);
        assertFalse("Deveria retornar falso", s.validaPrecoCompra());
    }
    
    @Test
    public void testPrecoDeCompraValido() {
        s.setPreco_compra(1);
        assertTrue("Deveria retornar true", s.validaPrecoCompra());
    }
    
    @Test
    public void testPrecoDeVendaMenorQuePrecoDeCompra(){
        s.setPreco_compra(10);
        s.setPreco_venda(9);
        assertFalse("Deveria retornar falso", s.validaPrecoVenda());
    }
    
    @Test
    public void testPrecoDeVendaMaiorQuePrecoDeCompra(){
        s.setPreco_compra(9);
        s.setPreco_venda(10);
        assertTrue("Deveria retornar true", s.validaPrecoVenda());
    }    
    
     @Test
    public void testPrecoDeVendaMenorQue1(){
        s.setPreco_venda(0);
        assertFalse("Deveria retornar false", s.validaPrecoVenda());
    }   
    
    @Test
    public void testQuantidadeMenorQue0(){
        s.setQuant(-1);
        assertFalse("Deveria retornar false", s.validaQtdSemente());
    } 
    
    @Test
    public void testQuantidadeMaiorIgual0(){
        s.setQuant(0);
        assertTrue("Deveria retornar false", s.validaQtdSemente());
    }
    
    @Test
    public void testAnoColheita(){
        s.setAno_val(2000);
        s.setAno_col(1900);
        assertTrue("Deveria retornar false", s.validaAnoValSemente());
    }
    
    @Test
    public void testDiaColValido(){
        s.setDia_col(32);
        assertFalse("Deveria retornar false", s.validaData());
    }
    
    @Test
    public void testDiaValValido(){
        s.setDia_val(32);
        assertFalse("Deveria retornar false", s.validaData());
    }
    
    @Test
    public void testMesColValido(){
        s.setMes_col(13);
        assertFalse("Deveria retornar false", s.validaData());
    }
    
    @Test
    public void testMesValValido(){
        s.setMes_col(13);
        assertFalse("Deveria retornar false", s.validaData());
    }
    
    @Test
    public void testAnoColValido(){
        s.setAno_col(0);
        assertFalse("Deveria retornar false", s.validaData());
    }
    
    @Test
    public void testAnoValValido(){
        s.setAno_val(0);
        assertFalse("Deveria retornar false", s.validaData());
    }
}
