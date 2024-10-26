package br.edu.iff.jogoforca.dominio.boneco.imagem;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;

public class BonecoImagemFactory implements BonecoFactory {
	private static BonecoImagemFactory instancia = null;
	private BonecoImagem boneco = BonecoImagem.getSoleInstance();
	
	private BonecoImagemFactory() {
		super();
	}
	
	/**
	 * Cria uma instancia unica de BonecoTextoFactory (Singleton)
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de BonecoTexto
	 */
	private static BonecoImagemFactory soleInstance() {
        if (instancia == null) {
        	instancia = new BonecoImagemFactory();
        }
        return instancia;
    }
	
	/**
	 * Obtem uma instancia unica de BonecoTextoFactory
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de BonecoTextoFactory
	 */
	public static BonecoImagemFactory getSoleInstance() {
		return soleInstance();
	}
	
	@Override
	public Boneco getBoneco() {
		return boneco;
	}
}
