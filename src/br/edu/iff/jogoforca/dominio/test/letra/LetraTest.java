package br.edu.iff.jogoforca.dominio.test.letra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.imagem.LetraImagemFactory;
import br.edu.iff.bancodepalavras.dominio.letra.texto.LetraTextoFactory;

class LetraTest {
    @Test
    public void testeSeLetraTextoFactoryInstanciadaRetornaMesmaInstancia() {
    	LetraTextoFactory letraTextoFactory1 = LetraTextoFactory.getSoleInstance();
		LetraTextoFactory letraTextoFactory2 = LetraTextoFactory.getSoleInstance();

        assertSame(letraTextoFactory1, letraTextoFactory2, "As instâncias devem ser as mesmas");
    }
    
    @Test
    public void testeSeLetraTextoInstanciadaDoFactoryRetornaMesmaInstancia() {
    	LetraTextoFactory letraTextoFactory = LetraTextoFactory.getSoleInstance();
    	
    	Letra letra1 = letraTextoFactory.criarLetra('A');
    	Letra letra2 = letraTextoFactory.criarLetra('A');

        assertSame(letra1, letra2, "As instâncias devem ser as mesmas");
    }
    
    @Test
    public void testeSeLetraImagemFactoryInstanciadaRetornaMesmaInstancia() {
    	LetraImagemFactory letraImagemFactory1 = LetraImagemFactory.getSoleInstance();
    	LetraImagemFactory letraImagemFactory2 = LetraImagemFactory.getSoleInstance();

        assertSame(letraImagemFactory1, letraImagemFactory2, "As instâncias devem ser as mesmas");
    }
    
    @Test
    public void testeSeLetraImagemInstanciadaDoFactoryRetornaMesmaInstancia() {
    	LetraImagemFactory letraImagemFactory = LetraImagemFactory.getSoleInstance();
    	
    	Letra letra1 = letraImagemFactory.criarLetra('A');
    	Letra letra2 = letraImagemFactory.criarLetra('A');

        assertSame(letra1, letra2, "As instâncias devem ser as mesmas");
    }
}
