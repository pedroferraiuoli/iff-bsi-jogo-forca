package br.edu.iff.jogoforca.dominio.jogador;

import br.edu.iff.factory.EntityFactory;

public class JogadorFactoryImpl extends EntityFactory implements JogadorFactory {
	private static JogadorFactoryImpl soleInstance = null;
	private JogadorRepository jogadorRepository;
	
	private JogadorFactoryImpl(JogadorRepository jogadorRepository) {
		super(jogadorRepository);
	}
	
	private JogadorRepository getJogadorRepository() {
		return this.jogadorRepository;
	}

	public static void createSoleInstance(JogadorRepository jogadorRepository) {
		if (soleInstance == null) {
			soleInstance = new JogadorFactoryImpl(jogadorRepository);
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
		System.out.println("8");
		Jogador Jog = Jogador.criar(this.getJogadorRepository().getProximoId(), nome);
		System.out.println(Jog.toString() + "1");
		return Jog;
	}
}
