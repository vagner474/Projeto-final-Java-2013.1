package Projeto;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Projeto.Jogador;

/**
 * A classe de teste GerenciadorTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class GerenciadorTest
{
    /**
     * Construtor default para a classe de teste GerenciadorTest
     */
    public GerenciadorTest()
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
    public void Classe_Principal()
    {
        Projeto.Clube clube1 = new Projeto.Clube("Costa Marfin", "1960", "Augusto Anjos", "Lucas Feiori", 56.0000);
        Projeto.Endereco endereco1 = new Projeto.Endereco("New York", "Street Center", 506, "Center Street", "NY", "USA");
        Projeto.Contrato contrato1 = new Projeto.Contrato("17-03-2014", 56.000);
        Projeto.Contrato contrato2 = new Projeto.Contrato("20-03-2014", 36.000);
        Projeto.Contrato contrato3 = new Projeto.Contrato("21-03-2014", 46.000);
        Projeto.Contrato contrato4 = new Projeto.Contrato("22-03-2014", 50.000);
        
        Projeto.CondicoesFisicas condicoe1 = null;
		try {
			condicoe1 = new Projeto.CondicoesFisicas(80, 1.80);
		} catch (AlturaInvalidaException e) {
			fail(e.getMessage());
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
		assertFalse(condicoe1.equals(null));
        Projeto.Jogador jogador1 = new Projeto.Jogador("Maik Lins", "Zagueiro", 43, condicoe1, contrato1);
        condicoe1.calculaImc();
        condicoe1.avaliacaoFisica();
        condicoe1.estudoTEMPO();
        assertEquals("Apto para Jogar", condicoe1.getTimeBackPlay());
        assertEquals(56.0, contrato1.getValorContrato(), 0.1);
        assertEquals(null, contrato1.getEmprestarJogador());
        assertEquals(null, contrato1.getEmprestarJogador());
        assertEquals(56.0, contrato1.getValorContrato(), 0.1);
        jogador1.NovoSalario();
        assertEquals("Seu Salario recebeu um aumento de 30%", jogador1.newSalario());
        
        Projeto.Gerenciador gerencia1 = new Projeto.Gerenciador(clube1, endereco1);
        
        if(!clube1.equals(gerencia1.getClube())){
        	fail("n�o era para excuta");
        }
        if(!endereco1.equals(gerencia1.getEnd())){
        	fail("n�o era para excuta");
        }
        
        Jogador jogador2 = new Jogador("Zeck", "Meia", 18, condicoe1, contrato2);
        Jogador jogador3 = new Jogador("Cisinho", "Golero", 1, condicoe1, contrato3);
        Jogador jogador4 = new Jogador("Zidanni", "Atacante", 10, condicoe1, contrato4);
        
        try {
        	clube1.addJogador(jogador1);
			clube1.addJogador(jogador2);
			clube1.addJogador(jogador3);
			clube1.addJogador(jogador4);
		} catch (JogadorExistenteException e) {
			fail(e.getMessage());
		}
        try {
			assertTrue(gerencia1.getClube().getJogador("Zeck").getContrato().equals(contrato2));
			assertTrue(gerencia1.getClube().getJogador("Cisinho").getContrato().equals(contrato3));
			assertTrue(gerencia1.getClube().getJogador("Zidanni").getContrato().equals(contrato4));
			assertTrue(gerencia1.getClube().getJogador("Zeck").getPosicao().equalsIgnoreCase("Meia"));
		} catch (JogadorInexistenteException e) {
			fail(e.getMessage());
		}
    }
    // 40 linhas de teste.
}


