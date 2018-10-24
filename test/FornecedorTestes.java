
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
    public void testNomeFornecedorCorreto1() {
        s.setNome("Distribuidor Acênto");
        assertTrue("Deveria retornar true", s.validaNomeFornecedor());
    }
    @Test
    public void testNomeFornecedorCorreto2() {
        s.setNome("Distribuidor AcÒnto");
        assertTrue("Deveria retornar true", s.validaNomeFornecedor());
    }
    
    @Test
    public void testNomeFornecedorMenorQue4() {
        s.setNome("cer");
        assertFalse("Deveria retornar falso", s.validaNomeFornecedor());
    }
    
    @Test
    public void testNomeFornecedorMaiorQue40() {
        s.setNome("eyrueirudyriduridosieudysdsfsfsfsfsfsfsfsfsfdsfdsfgddddddddddddddddddddddddddddddddddddueiduf ");
        assertFalse("Deveria retornar falso", s.validaNomeFornecedor());
    }
    @Test
    public void testNomeFornecedorValidoLetrasNumerosCaracEspeciais() {
        s.setNome("kyrtyrtyrty(#)");
        assertFalse("Deveria retornar FALSE", s.validaNomeFornecedor());
    }
    @Test
    public void testCnpjFornecedorVazio() {
        s.setCnpj("");
        assertFalse("Deveria retornar falso", s.validaCnpjFornecedor());
    }
    @Test
    public void testCnpjFornecedorCorreto() {
        s.setCnpj("10.685.547/0001-21");
        assertTrue("Deveria retornar true", s.validaCnpjFornecedor());
    }
    @Test
    public void testCnpjFornecedorMenorQue18() {
        s.setCnpj("059652");
        assertFalse("Deveria retornar falso", s.validaCnpjFornecedor());
    }
    
    @Test
    public void testCnpjFornecedorMaiorQue18() {
        s.setCnpj("888888888888888888888888888888888888888888888888888888");
        assertFalse("Deveria retornar falso", s.validaCnpjFornecedor());
    }
    
    @Test
    public void testRuaFornecedorVazio() {
        s.setRua("");
        assertFalse("Deveria retornar falso", s.validaRuaFornecedor());
    }
    @Test
    public void testRuaFornecedorCorreta1() {
        s.setRua("testata Á");
        assertTrue("Deveria retornar true", s.validaRuaFornecedor());
    }
    @Test
    public void testRuaFornecedorCorreta2() {
        s.setRua("Monsenhor Hipólito");
        assertTrue("Deveria retornar true", s.validaRuaFornecedor());
    }
    @Test
    public void testRuaFornecedorMenorQue4() {
        s.setRua("cer");
        assertFalse("Deveria retornar falso", s.validaRuaFornecedor());
    }
    
    @Test
    public void testRuaFornecedorMaiorQue30() {
        s.setRua("eyrueirudyriduridosieudysueid dfdsfsdfsfdsdf sdfsfsdfdsfuf ");
        assertFalse("Deveria retornar falso", s.validaRuaFornecedor());
    }
    @Test
    public void testBairroFornecedorVazio() {
        s.setBairro("");
        assertFalse("Deveria retornar falso", s.validaBairroFornecedor());
    }
    @Test
    public void testBairroFornecedorCorreto1() {
        s.setBairro("Exposição");
        assertTrue("Deveria retornar true", s.validaBairroFornecedor());
    }
    @Test
    public void testBairroFornecedorCorreto2() {
        s.setBairro("Junco");
        assertTrue("Deveria retornar true", s.validaBairroFornecedor());
    }
    @Test
    public void testBairroFornecedorMenorQue4() {
        s.setBairro("cer");
        assertFalse("Deveria retornar falso", s.validaBairroFornecedor());
    }
    
    @Test
    public void testBairroFornecedorMaiorQue30() {
        s.setBairro("eyrueirudyriduridosieu fghfghgfhfghgfhfghfghfhfgghfghfdysueiduf ");
        assertFalse("Deveria retornar falso", s.validaBairroFornecedor());
    }
    @Test
    public void testCidadeFornecedorVazio() {
        s.setCidade("");
        assertFalse("Deveria retornar falso", s.validaCidadeFornecedor());
    }
    @Test
    public void testCidadeFornecedorCorreto1() {
        s.setCidade("Acauã");
        assertTrue("Deveria retornar true", s.validaCidadeFornecedor());
    }
    @Test
    public void testCidadeFornecedorCorreto2() {
        s.setCidade("Conceição do Canindé");
        assertTrue("Deveria retornar true", s.validaCidadeFornecedor());
    }
    @Test
    public void testCidadeFornecedorMenorQue4() {
        s.setCidade("cer");
        assertFalse("Deveria retornar falso", s.validaCidadeFornecedor());
    }
    
    @Test
    public void testCidadeFornecedorMaiorQue30() {
        s.setCidade("eyrueirudyriduridosieudysu eidufasdadasdadasdadffsdfdfgdgdfgdfg");
        assertFalse("Deveria retornar falso", s.validaCidadeFornecedor());
    }
    @Test
    public void testEstadoFornecedorVazio() {
        s.setEstado("");
        assertFalse("Deveria retornar falso", s.validaEstadoFornecedor());
    }
    @Test
    public void testEstadoFornecedorCorreto1() {
        s.setEstado("PI");
        assertTrue("Deveria retornar true", s.validaEstadoFornecedor());
    }
    @Test
    public void testEstadoFornecedorCorreto2() {
        s.setEstado("PIAUÍ");
        assertTrue("Deveria retornar true", s.validaEstadoFornecedor());
    }
    @Test
    public void testEstadoFornecedorCorreto3() {
        s.setEstado("Piauí");
        assertTrue("Deveria retornar true", s.validaEstadoFornecedor());
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
    public void testEmailFornecedorCorreto() {
        s.setEmail("sebastiao_sales@hotmail.com");
        assertTrue("Deveria retornar true", s.validaEmailFornecedor());
    }
    @Test
    public void testEmailFornecedorErrado1() {
        s.setEmail("cer");
        assertFalse("Deveria retornar falso", s.validaEmailFornecedor());
    }
    
    @Test
    public void testEmailFornecedorErrado2() {
        s.setEmail("f@asd");
        assertFalse("Deveria retornar falso", s.validaEmailFornecedor());
    }
    @Test
    public void testEmailFornecedorErrado3() {
        s.setEmail("eyrueirudyriduridosieudysueiduf.asdsssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        assertFalse("Deveria retornar falso", s.validaEmailFornecedor());
    }
    @Test
    public void testObsFornecedorVazio() {
        s.setObs("");
        assertFalse("Deveria retornar falso", s.validaObsFornecedor());
    }
    @Test
    public void testObsFornecedorValido() {
        s.setObs("Testeeeeeeeeeeeeeeeeeeeeeeeeeee eeeeo Ç!.");
        assertTrue("Deveria retornar true", s.validaObsFornecedor());
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
    
    @Test
    public void testCepFornecedorMenor() {
        s.setCep("1234567");
        assertFalse("Deveria retornar falso", s.validaCepFornecedor());
    }
    @Test
    public void testCepFornecedorMaior() {
        s.setCep("12345678910");
        assertFalse("Deveria retornar falso", s.validaCepFornecedor());
    }
    @Test
    public void testCepFornecedorVazio() {
        s.setCep("");
        assertFalse("Deveria retornar falso", s.validaCepFornecedor());
    }
    @Test
    public void testCepFornecedor() {
        s.setCep("64605095");
        assertTrue("Deveria retornar true", s.validaCepFornecedor());
    }
    @Test
    public void testCepFornecedorIfem() {
        s.setCep("64605-095");
        assertFalse("Deveria retornar false", s.validaCepFornecedor());
    }
    @Test
    public void testTelFornecedorCorreto() {
        s.setTelefone("8934225656");
        assertTrue("Deveria retornar true", s.validaTelefoneFornecedor());
    }
    @Test
    public void testTelFornecedorVazio() {
        s.setTelefone("");
        assertFalse("Deveria retornar false", s.validaTelefoneFornecedor());
    }
    @Test
    public void testTelFornecedorMaior() {
        s.setTelefone("89898989898");
        assertFalse("Deveria retornar false", s.validaTelefoneFornecedor());
    }
    @Test
    public void testTelFornecedorMenor() {
        s.setTelefone("898989898");
        assertFalse("Deveria retornar false", s.validaTelefoneFornecedor());
    }
     @Test
    public void testCelFornecedorCorreto() {
        s.setCelular("89994500175");
        assertTrue("Deveria retornar true", s.validaCelularFornecedor());
    }
    @Test
    public void testCelFornecedorVazio() {
        s.setCelular("");
        assertFalse("Deveria retornar false", s.validaCelularFornecedor());
    }
    @Test
    public void testCelFornecedorMaior() {
        s.setCelular("898989898988888");
        assertFalse("Deveria retornar false", s.validaCelularFornecedor());
    }
    @Test
    public void testCelFornecedorMenor() {
        s.setCelular("898989898");
        assertFalse("Deveria retornar false", s.validaCelularFornecedor());
    }
}
