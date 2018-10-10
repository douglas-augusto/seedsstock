
import classes.Fornecedor;
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
public class FornecedorTestes {
    
    Fornecedor s;
    
    @Before
    public void setUp() {
        s = new Fornecedor();
    }
    
    @Test
    public void testNomeFornecedorVazio() {
        s.setNome("");
        assertFalse("Deveria retornar falso", s.validaNomeFornecedor());
    }
    
    @Test
    public void testNomeFornecedorMenorQue4() {
        s.setNome("cer");
        assertFalse("Deveria retornar falso", s.validaNomeFornecedor());
    }
    
    @Test
    public void testNomeFornecedorMaiorQue20() {
        s.setNome("eyrueirudyriduridosieudysueiduf ");
        assertFalse("Deveria retornar falso", s.validaNomeFornecedor());
    }
    @Test
    public void testCnpjFornecedorVazio() {
        s.setNome("");
        assertFalse("Deveria retornar falso", s.validaNomeFornecedor());
    }
    @Test
    public void testCnpjFornecedorMenorQue4() {
        s.setCnpj("cer");
        assertFalse("Deveria retornar falso", s.validaCnpjFornecedor());
    }
    
    @Test
    public void testCnpjFornecedorMaiorQue20() {
        s.setCnpj("eyrueirudyriduridosieudysueiduf ");
        assertFalse("Deveria retornar falso", s.validaCnpjFornecedor());
    }
    
    @Test
    public void testNomeFornecedorValidoLetrasNumerosCaracEspeciais() {
        s.setNome("kyrtyrtyrty(#)");
        assertFalse("Deveria retornar FALSE", s.validaNomeFornecedor());
    }
    @Test
    public void testRuajFornecedorVazio() {
        s.setRua("");
        assertFalse("Deveria retornar falso", s.validaRuaFornecedor());
    }
    @Test
    public void testRuaFornecedorMenorQue4() {
        s.setRua("cer");
        assertFalse("Deveria retornar falso", s.validaRuaFornecedor());
    }
    
    @Test
    public void testRuaFornecedorMaiorQue20() {
        s.setRua("eyrueirudyriduridosieudysueiduf ");
        assertFalse("Deveria retornar falso", s.validaRuaFornecedor());
    }
    @Test
    public void testBairroFornecedorVazio() {
        s.setBairro("");
        assertFalse("Deveria retornar falso", s.validaBairroFornecedor());
    }
    @Test
    public void testBairroFornecedorMenorQue4() {
        s.setBairro("cer");
        assertFalse("Deveria retornar falso", s.validaBairroFornecedor());
    }
    
    @Test
    public void testBairroFornecedorMaiorQue20() {
        s.setBairro("eyrueirudyriduridosieudysueiduf ");
        assertFalse("Deveria retornar falso", s.validaBairroFornecedor());
    }
    @Test
    public void testCidadeFornecedorVazio() {
        s.setCidade("");
        assertFalse("Deveria retornar falso", s.validaCidadeFornecedor());
    }
    @Test
    public void testCidadeFornecedorMenorQue4() {
        s.setCidade("cer");
        assertFalse("Deveria retornar falso", s.validaCidadeFornecedor());
    }
    
    @Test
    public void testCidadeFornecedorMaiorQue20() {
        s.setCidade("eyrueirudyriduridosieudysueiduf ");
        assertFalse("Deveria retornar falso", s.validaCidadeFornecedor());
    }
    @Test
    public void testEstadoFornecedorVazio() {
        s.setEstado("");
        assertFalse("Deveria retornar falso", s.validaEstadoFornecedor());
    }
    @Test
    public void testEstadoFornecedorMenorQue2() {
        s.setEstado("c");
        assertFalse("Deveria retornar falso", s.validaEstadoFornecedor());
    }
    
    @Test
    public void testEstadoFornecedorMaiorQue20() {
        s.setEstado("eyrueirudyriduridosieudysueiduf ");
        assertFalse("Deveria retornar falso", s.validaEstadoFornecedor());
    }
    @Test
    public void testEmailFornecedorVazio() {
        s.setEmail("");
        assertFalse("Deveria retornar falso", s.validaEmailFornecedor());
    }
    @Test
    public void testEmailFornecedorErrado1() {
        s.setEmail("cer");
        assertFalse("Deveria retornar falso", s.validaEmailFornecedor());
    }
    
    @Test
    public void testEmailFornecedorErrado2() {
        s.setEmail("eyrueirudyriduridosieudysueiduf@asd");
        assertFalse("Deveria retornar falso", s.validaEmailFornecedor());
    }
    @Test
    public void testEmailFornecedorErrado3() {
        s.setEmail("eyrueirudyriduridosieudysueiduf.asd");
        assertFalse("Deveria retornar falso", s.validaEmailFornecedor());
    }
    @Test
    public void testObsFornecedorVazio() {
        s.setObs("");
        assertFalse("Deveria retornar falso", s.validaObsFornecedor());
    }
    @Test
    public void testObsFornecedorMenorQue4() {
        s.setObs("cer");
        assertFalse("Deveria retornar falso", s.validaObsFornecedor());
    }
    
    @Test
    public void testObsFornecedorMaiorQue45() {
        s.setObs("eyrueirudyriduridosieudysueidufadssskasdmasdkmassdmkadkmsklmdffdgnjfsdfnasdnfasjfsdjjkasfksdfjasfjaksfdjkasjfasdfsaddfjasfsdafjlasd");
        assertFalse("Deveria retornar falso", s.validaObsFornecedor());
    }
    
}
