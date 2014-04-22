package Projeto;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Projeto.Contrato;

/**
 * A classe de teste ContratoTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class ContratoTest
{
    /**
     * Construtor default para a classe de teste ContratoTest
     */
    public ContratoTest()
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
    public void TESTEClassContrato(){
    	Contrato contrato1 = new Contrato("15/02/1996", 23.000);
        assertEquals("15/02/1996", contrato1.getDataContrato());
        assertEquals(23.0, contrato1.getValorContrato(), 0.1);
        contrato1.setDataContrato("30-10-1996");
        contrato1.setValorContrato(22.000);
        assertEquals("30-10-1996", contrato1.getDataContrato());
        assertEquals(22.0, contrato1.getValorContrato(), 0.1);
        contrato1.renovarContrato("20-05-95", 4500.0);
        assertEquals("20-05-95", contrato1.getDataContrato());
        assertEquals(4500.0, contrato1.getValorContrato(), 0.1);
        contrato1.cancelarContrato();
        assertEquals("Cancelado", contrato1.getDataContrato());
        assertEquals(0.0, contrato1.getValorContrato(), 0.1);
    }

    @Test
    public void Cancelando_O_Contrato()
    {
        Projeto.Contrato contrato1 = new Projeto.Contrato("17-03-2014", 23.000);
        assertEquals("17-03-2014", contrato1.getDataContrato());
        assertEquals(23.000, contrato1.getValorContrato(), 0.1);
        contrato1.cancelarContrato();
        assertEquals("Cancelado", contrato1.getDataContrato());
        assertEquals("Cancelado", contrato1.getDataContrato());
    }

    

    @Test
    public void Emprestar_O_Jogador()
    {
        Projeto.Contrato contrato1 = new Projeto.Contrato("17-03-2014", 15.000);
        assertEquals("17-03-2014", contrato1.getDataContrato());
        assertEquals(15.000, contrato1.getValorContrato(), 0.1);
        contrato1.emprestarJogador();
        assertEquals("Jogador esta Emprestado", contrato1.getEmprestarJogador());
        assertEquals(150000.0, contrato1.getValorContrato(), 0.1);
        contrato1.cancelarContrato();
        contrato1.cancelarContrato();
        contrato1.emprestarJogador();
        assertEquals("Contrato Cancelado", contrato1.getEmprestarJogador());
        assertEquals(0.0, contrato1.getValorContrato(), 0.1);
        assertEquals("Cancelado", contrato1.getDataContrato());
    }
    // 31 linhas de códigos
}





