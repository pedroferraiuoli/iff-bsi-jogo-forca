package br.edu.iff.bancodepalavras.dominio.palavra;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.factory.EntityFactory;

public class PalavraFactoryImpl extends EntityFactory implements PalavraFactory {
	private static PalavraFactoryImpl soleInstance = null;
	private PalavraRepository palavraRepository;
	
	private PalavraFactoryImpl(PalavraRepository palavraRepository) {
		super(palavraRepository);
		this.palavraRepository = palavraRepository;
	}
	
	public static void createSoloInstance(PalavraRepository palavraRepository) {
		if (soleInstance == null) {
            new PalavraFactoryImpl(palavraRepository);
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
	
	public PalavraRepository getPalavraRepository() {
		return this.palavraRepository;
	}

	@Override
	public Palavra getPalavra(String palavra, Tema tema) {
		return null;
	}
}
