package br.edu.iff.jogoforca.dominio.jogador;

import br.edu.iff.factory.EntityFactory;

public class JogadorFactoryImpl extends EntityFactory implements JogadorFactory {
	private static JogadorFactoryImpl soleInstance = null;
	private JogadorRepository repository;
	
	private JogadorFactoryImpl(JogadorRepository repository) {
		super(repository);
	}
	
	private JogadorRepository getJogadorRepository() {
		return this.repository;
	}

	public static void createSoloInstance(JogadorRepository repository) {
		if (soleInstance == null) {
            new JogadorFactoryImpl(repository);
        }
	}
	
	public static JogadorFactoryImpl getSoleInstance() {
		if (soleInstance == null) {
            throw new IllegalStateException("A instância não foi criada. Chame createSoloInstance primeiro.");
        }
        return soleInstance;
	}

	@Override
	public Jogador getJogador(String nome) {
		return Jogador.criar(this.getJogadorRepository().getProximoId(), nome);
	}
}
