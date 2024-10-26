package br.edu.iff.bancodepalavras.dominio.letra.imagem;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;

public class LetraImagem extends Letra {
	/**
	 * Construtor da classe LetraTexto
	 * 
	 * @param codigo Codigo ASCII da letra 
	 */
	public LetraImagem(char codigo) {
		super(codigo);
	}

	@Override
	public void exibir(Object contexto) {
		System.out.print(super.getCodigo());
	}
}
