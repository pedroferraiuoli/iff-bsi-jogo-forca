package br.edu.iff.bancodepalavras.dominio.palavra;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.factory.EntityFactory;
import br.edu.iff.repository.Repository;

public class PalavraFactoryImpl extends EntityFactory implements PalavraFactory {
	private static PalavraFactoryImpl soleInstance = null;
	
	private PalavraFactoryImpl(Repository repository) {
		super(repository);
	}
	
	public static void createSoloInstance(Repository repository) {
		if (soleInstance == null) {
            new PalavraFactoryImpl(repository);
        }
	}
	
	/**
	 * Obtem uma instancia unica de PalavraFactoryImpl
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de PalavraFactoryImpl
	 */
	public static PalavraFactoryImpl getSoleInstance() {
		if (soleInstance == null) {
            throw new IllegalStateException("A instância não foi criada. Chame createSoloInstance primeiro.");
        }
        return soleInstance;
	}

	@Override
	public Palavra getPalavra(String palavra, Tema tema) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
