package br.edu.iff.jogoforca.dominio.rodada.sorteio;

import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.TemaRepository;
import br.edu.iff.jogoforca.dominio.jogador.Jogador;
import br.edu.iff.jogoforca.dominio.rodada.Rodada;
import br.edu.iff.jogoforca.dominio.rodada.RodadaFactoryImpl;
import br.edu.iff.jogoforca.dominio.rodada.RodadaRepository;

public class RodadaSorteioFactory extends RodadaFactoryImpl {
	private static RodadaSorteioFactory soleInstance = null;
	
	private RodadaSorteioFactory(RodadaRepository rodadaRepository, TemaRepository temaRepository, PalavraRepository palavraRepository) {
		super(rodadaRepository, temaRepository, palavraRepository);
	}

	public static void createSoloInstance(RodadaRepository rodadaRepository, TemaRepository temaRepository, PalavraRepository palavraRepository) {
		if (soleInstance == null) {
            new RodadaSorteioFactory(rodadaRepository, temaRepository, palavraRepository);
        }
	}
	
	public static RodadaSorteioFactory getSoleInstance() {
		if (soleInstance == null) {
            throw new IllegalStateException("A instância não foi criada. Chame createSoloInstance primeiro.");
        }
        return soleInstance;
	}

	@Override
	public Rodada getRodada(Jogador jogador) {
		return Rodada.criar(
				this.getRodadaRepository().getProximoId(),
				this.getPalavraRepository().getPorTema(this.getTemaRepository().getPorId(0)), //adicionar para pegar o array de palavras e o tema aleatorio
				jogador
		);
	}
	
}
