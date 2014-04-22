package Projeto;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Projeto.Clube;
import Projeto.Contrato;
import Projeto.Jogador;

/**
 * A classe de teste ClubeTest.
 *
 * @author  (seu nome)
 * @version (um nÃºmero de versÃ£o ou data)
 */
public class ClubeTest
{
    /**
     * Construtor default para a classe de teste ClubeTest
     */
    public ClubeTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada mÃ©todo de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado apÃ³s cada mÃ©todo de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void FuncoesDaClasseCLUBE() {
        Clube clube1 = new Clube("SPOR CLUBE DO RECIFE", "1900", "Lucas Pedro Silva", "Dilma Alencar", 2300);
        assertEquals("1900", clube1.getAnoFundacao());
        assertEquals("SPOR CLUBE DO RECIFE", clube1.getNClube());
        assertEquals("Dilma Alencar", clube1.getPresidente());
        assertEquals(2300.0, clube1.getSTecnico(), 0.1);
        assertEquals("Lucas Pedro Silva", clube1.getTecnico());
        clube1.setAnoFundacao("2013");
        clube1.setNClube("Nautico Sport Clube");
        clube1.setPresidente("Ricardo Pedro da Silva");
        clube1.setSTecnico(40.000);
        clube1.setTecnico("Ricardo Fernando Lima");
        assertEquals("2013", clube1.getAnoFundacao());
        assertEquals("Nautico Sport Clube", clube1.getNClube());
        assertEquals("Ricardo Pedro da Silva", clube1.getPresidente());
        assertEquals(40.000, clube1.getSTecnico(), 0.1);
        assertEquals("Ricardo Fernando Lima", clube1.getTecnico());
        clube1.DespedirTecnico("LP - Java", 50.000);
        assertEquals(50.0, clube1.getSTecnico(), 0.1);
        assertEquals("LP - Java", clube1.getTecnico());
    }
    @Test
    public void Add_Remove_Jogadores_No_Ckube(){
    	Projeto.Clube clube1 = new Projeto.Clube("Nautico Esporte Clube", "09-09-1990", "Zizo", "Olivia Mirellis", 34.000);
    	Contrato contrato1 = new Contrato("15/02/1996", 23.000);
    	Projeto.CondicoesFisicas condicoe1 = null;
		try {
			condicoe1 = new Projeto.CondicoesFisicas(75, 1.68);
		} catch (AlturaInvalidaException e) {
			fail(e.getMessage());
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
    	Jogador jogador1 = new Jogador("Paulo", "Atacante", 10, condicoe1, contrato1);
    	try {
			clube1.addJogador(jogador1);
		} catch (JogadorExistenteException e) {
			fail(e.getMessage());
		}
    	try {
			clube1.addJogador(jogador1);
			fail("não era para executa essa linha");
		} catch (JogadorExistenteException e) {
			// é para lança uma exceção
		}
    	try {
			Jogador j = clube1.getJogador("Paulo");
			if(j.equals(jogador1)){
				// é igual não fais nada.
			}else{
				fail("O jogador é o mesmo não era para dar false");
			}
		} catch (JogadorInexistenteException e) {
			fail(e.getMessage());
		}
    	try {
			clube1.getJogador("Ana");
			fail("não era para executa essa linha");
		} catch (JogadorInexistenteException e) {
			// é para lança uma exceção
		}
    	try {
			clube1.removeJogador("Ana");
			fail("não era para executa essa linha");
    	} catch (JogadorInexistenteException e) {
    		// é para lança uma exceção
    	}
    	try {
			clube1.removeJogador("Paulo");
		} catch (JogadorInexistenteException e) {
			fail(e.getMessage());
		}
    	// verificando se o jogador foi removido
    	try {
			clube1.getJogador("Paulo");
			fail("não era para executa essa linha");
    	} catch (JogadorInexistenteException e) {
    		// é para lança uma exceção
    	}
    }
    @Test
    public void Treinador_Sai_ou_Continua_No_Time() {
        Projeto.Clube clube1 = new Projeto.Clube("Nautico Esporte Clube", "09-09-1990", "Zizo", "Olivia Mirellis", 34.000);
        assertEquals(0, clube1.getDerrotas());
        assertEquals(0, clube1.getVitorias());
        try {
			clube1.setVitorias(5);
		} catch (VitoriaInvalidaException e) {
			fail(e.getMessage());
		}
        try {
			clube1.setDerrotas(8);
		} catch (DerrotarInvalidaException e) {
			fail(e.getMessage());
		}
        clube1.TreinadorContinuaTIME();
        assertEquals("Treinador tem que ser Despedido", clube1.TreinadorContinuaTIME());
        assertTrue(5 == clube1.getVitorias());
        assertTrue(8 == clube1.getDerrotas());
        try {
			clube1.setVitorias(13);
		} catch (VitoriaInvalidaException e) {
			fail(e.getMessage());
		}
        try {
			clube1.setDerrotas(8);
		} catch (DerrotarInvalidaException e) {
			fail(e.getMessage());
		}
        assertTrue(13 == clube1.getVitorias());
        assertTrue(8 == clube1.getDerrotas());
        clube1.TreinadorContinuaTIME();
        assertEquals("TREINADOR CONTINUA NO TIME", clube1.TreinadorContinuaTIME());
        
        try {
			clube1.setVitorias(-13);
			fail("não era para execultar");
		} catch (VitoriaInvalidaException e) {
			// é para execultar....
		}
        try {
			clube1.setDerrotas(-8);
			fail("não era para execultar");
		} catch (DerrotarInvalidaException e) {
			// é para execultar...
		}
    }
    // total de linhas 64.
}


