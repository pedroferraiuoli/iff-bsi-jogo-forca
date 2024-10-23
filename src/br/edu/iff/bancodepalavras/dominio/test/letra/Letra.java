package br.edu.iff.bancodepalavras.dominio.test.letra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.iff.bancodepalavras.dominio.letra.texto.LetraTextoFactory;

class Letra {
    @Test
    public void testeSeLetraTextoFactoryInstanciadaRetornaMesmaInstancia() {
    	LetraTextoFactory factory1 = LetraTextoFactory.getSoleInstance();
		LetraTextoFactory factory2 = LetraTextoFactory.getSoleInstance();

        assertSame(factory1, factory2, "As instâncias devem ser as mesmas");
    }
    
    @Test
    public void testeSeLetraTextoInstanciadaDoFactoryRetornaMesmaInstancia() {
    	LetraTextoFactory factory1 = LetraTextoFactory.getSoleInstance();

        assertSame(factory1.criarLetra('A'), factory1.criarLetra('A'), "As instâncias devem ser as mesmas");
    }
}
