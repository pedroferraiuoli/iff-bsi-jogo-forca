package br.edu.iff.test.dominio.boneco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.iff.bancodepalavras.dominio.letra.texto.LetraTextoFactory;
import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;
import br.edu.iff.jogoforca.dominio.boneco.imagem.BonecoImagemFactory;
import br.edu.iff.jogoforca.dominio.boneco.texto.BonecoTexto;
import br.edu.iff.jogoforca.dominio.boneco.texto.BonecoTextoFactory;

class BonecoTest {
	@Test // Recriar esse teste apos implementacao correta dos factorys
    public void testeSeBonecoTextoFactoryInstanciadaRetornaMesmaInstancia() {
		BonecoTextoFactory bonecoTextoFactory1 = BonecoTextoFactory.getSoleInstance();
    	BonecoTextoFactory bonecoTextoFactory2 = BonecoTextoFactory.getSoleInstance();
    	
        assertSame(bonecoTextoFactory1, bonecoTextoFactory2, "As instâncias devem ser as mesmas");
    }
	
    @Test
    public void testeSeBonecoTextoInstanciadaDoFactoryRetornaMesmaInstancia() {
    	BonecoTextoFactory bonecoTextoFactory = BonecoTextoFactory.getSoleInstance();
    	
    	Boneco boneco1 = bonecoTextoFactory.getBoneco();
    	Boneco boneco2 = bonecoTextoFactory.getBoneco();
    	
        assertSame(boneco1, boneco2, "As instâncias devem ser as mesmas");
    }
    
	@Test // Recriar esse teste apos implementacao correta dos factorys
    public void testeSeBonecoImagemFactoryInstanciadaRetornaMesmaInstancia() {
		BonecoImagemFactory bonecoImagemFactory1 = BonecoImagemFactory.getSoleInstance();
		BonecoImagemFactory bonecoImagemFactory2 = BonecoImagemFactory.getSoleInstance();
    	
        assertSame(bonecoImagemFactory1, bonecoImagemFactory2, "As instâncias devem ser as mesmas");
    }
	
    @Test
    public void testeSeBonecoImagemInstanciadaDoFactoryRetornaMesmaInstancia() {
    	BonecoImagemFactory bonecoImagemFactory = BonecoImagemFactory.getSoleInstance();
    	
    	Boneco boneco1 = bonecoImagemFactory.getBoneco();
    	Boneco boneco2 = bonecoImagemFactory.getBoneco();
    	
        assertSame(boneco1, boneco2, "As instâncias devem ser as mesmas");
    }
}
