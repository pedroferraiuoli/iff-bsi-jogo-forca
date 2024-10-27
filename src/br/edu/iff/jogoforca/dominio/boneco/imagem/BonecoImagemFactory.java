package br.edu.iff.jogoforca.dominio.boneco.imagem;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;

public class BonecoImagemFactory implements BonecoFactory {
	private static BonecoImagemFactory soleInstance = null;
	private BonecoImagem boneco = BonecoImagem.getSoleInstance();
	
	private BonecoImagemFactory() {
		super();
	}
	
	/**
	 * Obtem uma instancia unica de BonecoTextoFactory
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de BonecoTextoFactory
	 */
	public static BonecoImagemFactory getSoleInstance() {
        if (soleInstance == null) {
        	return soleInstance = new BonecoImagemFactory();
        }
        return soleInstance;
	}
	
	@Override
	public Boneco getBoneco() {
		return boneco;
	}
}
