package Projeto;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Projeto.Contrato;
import Projeto.Jogador;

/**
 * A classe de teste JogadorTest.
 *
 * @author  (seu nome)
 * @version (um n√∫mero de vers√£o ou data)
 */
public class JogadorTest
{
    /**
     * Construtor default para a classe de teste JogadorTest
     */
    public JogadorTest()
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
    public void setANDget()
    {
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
        assertEquals("Paulo", jogador1.getNome());
        assertEquals(10, jogador1.getNumCam());
        assertEquals("Atacante", jogador1.getPosicao());
        jogador1.setNome("Pedro");
        try {
			jogador1.setNumCam(9);
		} catch (NumCamisaInvalidoException e1) {
			fail(e1.getMessage());
		}
        try {
			jogador1.setNumCam(-1);
			fail("n„o era para excuta essa linha");
		} catch (NumCamisaInvalidoException e1) {
			
		}
        assertEquals("Pedro", jogador1.getNome());
        assertEquals(9, jogador1.getNumCam());
        assertEquals("Atacante", jogador1.getPosicao());
        try {
			jogador1.setSalario(5000);
		} catch (SalarioInvalidoException e) {
			fail(e.getMessage());
		}
        jogador1.NovoSalario();
        jogador1.saberAumento();
        assertEquals(5000.0, jogador1.getSalario(), 0.1);
        
        try {
			jogador1.setSalario(-50000);
			fail("n„o era para excuta essa linha");
		} catch (SalarioInvalidoException e) {
			// È para lanÁa a exceÁ„o
		}
    }

    

    @Test
    public void saberAUMENTO()
    {
    	Contrato contrato1 = new Contrato("15/02/1996", 23.000);
    	Projeto.CondicoesFisicas condicoe1 = null;
		try {
			condicoe1 = new Projeto.CondicoesFisicas(75, 1.68);
		} catch (AlturaInvalidaException e) {
			fail(e.getMessage());
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
    	Jogador jogador1 = new Jogador("Zeck", "Meia", 18, condicoe1, contrato1);
        jogador1.NovoSalario();
        try {
			jogador1.setSalario(2000);
		} catch (SalarioInvalidoException e) {
			fail(e.getMessage());
		}
        jogador1.NovoSalario();
        assertEquals(2000, jogador1.getSalario(), 0.1);
        jogador1.saberAumento();
    }

   

    @Test
    public void DireitoDEimagem()
    {
    	Contrato contrato1 = new Contrato("15/02/1996", 23.000);
    	Projeto.CondicoesFisicas condicoe1 = null;
		try {
			condicoe1 = new Projeto.CondicoesFisicas(75, 1.68);
		} catch (AlturaInvalidaException e) {
			fail(e.getMessage());
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
    	Jogador jogador2 = new Jogador("Cisinho", "Golero", 1, condicoe1, contrato1);
    	
        try {
			jogador2.setSalario(14000);
		} catch (SalarioInvalidoException e) {
			fail(e.getMessage());
		}
        jogador2.NovoSalario();
        assertEquals(14000, jogador2.getSalario(), 0.1);
        
        jogador2.saberAumento();
        jogador2.DireitoDeImagem();
        assertEquals("Jogador tem direito de imagem", jogador2.getImagem());
    }

   
    @Test
    public void Saber_Aumento_Salario()
    {
    	Contrato contrato1 = new Contrato("15/02/1996", 23.000);
    	Projeto.CondicoesFisicas condicoe1 = null;
		try {
			condicoe1 = new Projeto.CondicoesFisicas(75, 1.68);
		} catch (AlturaInvalidaException e) {
			fail(e.getMessage());
		} catch (PesoInvalidoException e) {
			fail(e.getMessage());
		}
    	Jogador jogador1 = new Jogador("Zidanni", "Atacante", 10, condicoe1, contrato1);
        assertEquals(0.0, jogador1.getSalario(), 0.1);
        try {
			jogador1.setSalario(3500);
		} catch (SalarioInvalidoException e) {
			fail(e.getMessage());
		}
        jogador1.NovoSalario();
        assertEquals("Seu Salario recebeu um aumento de 20%", jogador1.newSalario());
        try {
			jogador1.setSalario(4600);
		} catch (SalarioInvalidoException e) {
			fail(e.getMessage());
		}
        assertEquals(4600.0, jogador1.getSalario(), 0.1);
        jogador1.NovoSalario();
        assertEquals("Seu Salario recebeu um aumento de 20%", jogador1.newSalario());
        try {
			jogador1.setSalario(4000000);
		} catch (SalarioInvalidoException e) {
			fail(e.getMessage());
		}
        assertEquals(4000000, jogador1.getSalario(), 0.1);
        jogador1.NovoSalario();
        assertEquals("Seu Salario recebeu um aumento de 30%", jogador1.newSalario());
    }
    //Esta class teste tem 70 linhas de testes
}







