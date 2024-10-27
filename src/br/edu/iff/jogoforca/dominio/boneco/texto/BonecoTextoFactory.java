package br.edu.iff.jogoforca.dominio.boneco.texto;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;

public class BonecoTextoFactory implements BonecoFactory {
	private static BonecoTextoFactory soleInstance = null;
	private BonecoTexto boneco = BonecoTexto.getSoleInstance();
	
	private BonecoTextoFactory() {
		super();
	}
	
	/**
	 * Obtem uma instancia unica de BonecoTextoFactory
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de BonecoTextoFactory
	 */
	public static BonecoTextoFactory getSoleInstance() {
        if (soleInstance == null) {
        	return soleInstance = new BonecoTextoFactory();
        }
        return soleInstance;
	}
	
	@Override
	public Boneco getBoneco() {
		return boneco;
	}
}
