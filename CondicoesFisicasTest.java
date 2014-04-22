package Projeto;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste CondicoesFisicasTest.
 *
 * @author  (seu nome)
 * @version (um n√∫mero de vers√£o ou data)
 */
public class CondicoesFisicasTest
{
    /**
     * Construtor default para a classe de teste CondicoesFisicasTest
     */
    public CondicoesFisicasTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada m√©todo de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado ap√≥s cada m√©todo de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void AsEntradasEEalteracoes() {
        Projeto.CondicoesFisicas condicoe1 = null;
        
        try {
			condicoe1 = new Projeto.CondicoesFisicas(-75, -1.68);
			fail("n„o era para excuta");
		} catch (AlturaInvalidaException e2) {
			// È para executa esse mÈtodo
		} catch (PesoInvalidoException e2) {
			// È para executa esse mÈtodo
		}
        
		try {
			condicoe1 = new Projeto.CondicoesFisicas(75, 1.68);
		} catch (AlturaInvalidaException e) {
			fail(e.getMessage());
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
		assertFalse(condicoe1.equals(null));
        assertEquals(1.68, condicoe1.getAltura(), 0.1);
        assertEquals(75.0, condicoe1.getPeso(), 0.1);
        try {
			condicoe1.setAltura(1.90);
		} catch (AlturaInvalidaException e1) {
			fail(e1.getMessage());
		}
        try {
			condicoe1.setAltura(-1.90);
			fail("n„o È para excuta essa linha");
		} catch (AlturaInvalidaException e1) {
			
		}
        try {
			condicoe1.setPeso(90.0);
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}try {
			condicoe1.setPeso(-90.0);
			fail("… para ter lanÁado exception");
		} catch (PesoInvalidoException e) {
			
		}
        assertEquals(1.90, condicoe1.getAltura(), 0.1);
        assertEquals(90.0, condicoe1.getPeso(), 0.1);
    }

    @Test
    public void VerSaudeJogador()
    {
        Projeto.CondicoesFisicas condicoe1 = null;
		try {
			condicoe1 = new Projeto.CondicoesFisicas(65.0, 1.90);
		} catch (AlturaInvalidaException e) {
			fail(e.getMessage());
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
        condicoe1.calculaImc();
        condicoe1.avaliacaoFisica();
        assertEquals("Indisponivel para o Jogo", condicoe1.getSituacaoFisica());
        assertEquals(1.90, condicoe1.getAltura(), 0.1);
        assertEquals(65.0, condicoe1.getPeso(), 0.1);
        try {
			condicoe1.setAltura(1.79);
		} catch (AlturaInvalidaException e1) {
			fail(e1.getMessage());
		}
        try {
			condicoe1.setPeso(68.0);
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
        condicoe1.calculaImc();
        condicoe1.avaliacaoFisica();
        
        assertEquals(1.79, condicoe1.getAltura(), 0.1);
        assertEquals(68.0, condicoe1.getPeso(), 0.1);
    }
    

    @Test
    public void Analise_tempo_de_Tratamento()
    {
        Projeto.CondicoesFisicas condicoe1 = null;
		try {
			condicoe1 = new Projeto.CondicoesFisicas(80.0, 1.70);
		} catch (AlturaInvalidaException e) {
			fail(e.getMessage());
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
        condicoe1.calculaImc();
        condicoe1.avaliacaoFisica();
        assertEquals("Indisponivel para o Jogo", condicoe1.getSituacaoFisica());
        condicoe1.estudoTEMPO();
        assertEquals("Tratamento de 4 semanas", condicoe1.getTimeBackPlay());
        try {
			condicoe1.setAltura(1.70);
		} catch (AlturaInvalidaException e1) {
			fail(e1.getMessage());
		}
        try {
			condicoe1.setPeso(67.8);
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
        condicoe1.calculaImc();
        condicoe1.avaliacaoFisica();
        assertEquals(" Disponivel para o Jogo ", condicoe1.getSituacaoFisica());
        condicoe1.estudoTEMPO();
        assertEquals("Apto para Jogar", condicoe1.getTimeBackPlay());
        try {
			condicoe1.setAltura(1.80);
		} catch (AlturaInvalidaException e1) {
			fail(e1.getMessage());
		}
        try {
			condicoe1.setPeso(78);
			condicoe1.calculaImc();
	        condicoe1.avaliacaoFisica();
	        assertEquals(" Disponivel para o Jogo ", condicoe1.getSituacaoFisica());
	        condicoe1.estudoTEMPO();
	        assertEquals("Apto para Jogar", condicoe1.getTimeBackPlay());
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
    }
}
// 63 linhas de Codigo no total
