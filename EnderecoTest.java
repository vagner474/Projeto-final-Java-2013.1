package Projeto;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Projeto.Endereco;

/**
 * A classe de teste EnderecoTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class EnderecoTest
{
    /**
     * Construtor default para a classe de teste EnderecoTest
     */
    public EnderecoTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    

    @Test
    public void TesteEndereco()
    {
        Endereco endereco1 = new Endereco("Cabo", "Rua 17", 12, "Guarapes", "PB", "Brasil");
        assertEquals("Guarapes", endereco1.getBairro());
        assertEquals("Cabo", endereco1.getCidade());
        assertEquals(12, endereco1.getNum());
        assertEquals("Brasil", endereco1.getPais());
        assertEquals("Rua 17", endereco1.getRua());
        assertEquals("Brasil", endereco1.getPais());
        assertEquals("Rua 17", endereco1.getRua());
        assertEquals("PB", endereco1.getUf());
        endereco1.setBairro("Cabo Branco");
        endereco1.setCidade("João Pessoa");
        endereco1.setNum(200);
        endereco1.setPais("BR");
        endereco1.setRua("Marcos II");
        endereco1.setUf("Paraíba");
        assertEquals("Cabo Branco", endereco1.getBairro());
        assertEquals("João Pessoa", endereco1.getCidade());
        assertEquals(200, endereco1.getNum());
        assertEquals("BR", endereco1.getPais());
        assertEquals("Marcos II", endereco1.getRua());
        assertEquals("Paraíba", endereco1.getUf());
        endereco1.cancelarENDERECO();
        assertEquals(null, endereco1.getBairro());
        assertEquals(null, endereco1.getCidade());
        assertEquals(0, endereco1.getNum());
        assertEquals(null, endereco1.getPais());
        assertEquals(null, endereco1.getRua());
        assertEquals(null, endereco1.getUf());
    }

    @Test
    public void Cancelar_O_Endereco()
    {
        Projeto.Endereco endereco1 = new Projeto.Endereco("Macaparana", "Rua Manoel Texeira", 300, "São Carlos", "MG", "Brasil");
        assertEquals("São Carlos", endereco1.getBairro());
        assertEquals("Macaparana", endereco1.getCidade());
        assertEquals(300, endereco1.getNum());
        assertEquals("Brasil", endereco1.getPais());
        assertEquals("Rua Manoel Texeira", endereco1.getRua());
        assertEquals("MG", endereco1.getUf());
        endereco1.cancelarENDERECO();
        assertEquals(null, endereco1.getBairro());
        assertEquals(null, endereco1.getCidade());
        assertEquals(0, endereco1.getNum());
        assertEquals(null, endereco1.getRua());
        assertEquals(null, endereco1.getUf());
    }
    // 41 linhas de Còdigo
}



