package br.edu.iff.jogoforca.dominio.boneco.texto;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;
import br.edu.iff.jogoforca.dominio.boneco.BonecoFactory;

public class BonecoTextoFactory implements BonecoFactory {
	private static BonecoTextoFactory instancia = null;
	private BonecoTexto boneco = BonecoTexto.getSoleInstance();
	
	private BonecoTextoFactory() {
		super();
	}
	
	/**
	 * Cria uma instancia unica de BonecoTextoFactory (Singleton)
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de BonecoTexto
	 */
	private static BonecoTextoFactory soleInstance() {
        if (instancia == null) {
        	instancia = new BonecoTextoFactory();
        }
        return instancia;
    }
	
	/**
	 * Obtem uma instancia unica de BonecoTextoFactory
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de BonecoTextoFactory
	 */
	public static BonecoTextoFactory getSoleInstance() {
		return soleInstance();
	}
	
	@Override
	public Boneco getBoneco() {
		return boneco;
	}
}
