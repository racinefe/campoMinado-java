package curso.java.campminado.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinhoRealEsquerdaD1() {
		
		Campo vizinho = new Campo(3,2);
		
		boolean resultado = campo.adicionarVizinhos(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDireitaD1() {
		
		Campo vizinho = new Campo(3,4);
		
		boolean resultado = campo.adicionarVizinhos(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealEmCimaD1() {
		
		Campo vizinho = new Campo(2,3);
		
		boolean resultado = campo.adicionarVizinhos(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealEmBaixoD1() {
		
		Campo vizinho = new Campo(4,3);
		
		boolean resultado = campo.adicionarVizinhos(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealD2() {
		
		Campo vizinho = new Campo(2,2);
		
		boolean resultado = campo.adicionarVizinhos(vizinho);
		
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		
		Campo vizinho = new Campo(1,1);
		
		boolean resultado = campo.adicionarVizinhos(vizinho);
		
		assertFalse(resultado);
	}
}
