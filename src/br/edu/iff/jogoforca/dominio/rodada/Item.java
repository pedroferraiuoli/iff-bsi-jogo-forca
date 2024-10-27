package br.edu.iff.jogoforca.dominio.rodada;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.dominio.ObjetoDominioImpl;

public class Item extends ObjetoDominioImpl {
	private boolean[] posicoesDescobertas;
	private String palavraArriscada = null;
	private Palavra palavra;
	
	private Item(long id, Palavra palavra) {
		super(id);
		this.setPalavra(palavra);
		
	}
	private Item(long id, Palavra palavra, int[] posicoesDescobertas, String palavraArriscada) {
		super(id);
		this.setPalavra(palavra);
		this.setPosicoesDescobertas(posicoesDescobertas); 
		this.setPalavraArriscada(palavraArriscada);
	}
	
	private void setPalavra(Palavra palavra) {
		if(palavra == null) {
			throw new NullPointerException("A palavra não pode ser nula");
		}
		this.palavra = palavra;
	}
	
	private void setPosicoesDescobertas(int[] posicoesDescobertasInt) {
		if(posicoesDescobertasInt == null) {
			throw new NullPointerException("O vetor com as posições descobertas é nulo");
		}
		for(int i = 0; i <= posicoesDescobertasInt.length-1 ; i++) {
			this.posicoesDescobertas[posicoesDescobertasInt[i]] = true;
		}
	}
		
	private void setPalavraArriscada(String palavraArriscada) {
		if(palavraArriscada == null) {
			throw new NullPointerException("A palavra arriscada não pode ser nula");
		}
		this.palavraArriscada = palavraArriscada;
	}
	
	public boolean[] getPosicoesDescobertas() {
		return posicoesDescobertas;
	}
	
	public String getPalavraArriscada() {
		return palavraArriscada;
	}
	
	public Palavra getPalavra() {
		return palavra;
	}
	
	public Letra[] GetLetrasDescobertas() {
		Letra[] ListaLetras;
		ListaLetras = palavra.getLetras();
		
		for(int i = 0; i < palavra.getTamanho() ; i++) {
			if(posicoesDescobertas[i] == false ) {
			ListaLetras[i] = Palavra.getLetraFactory().getLetraEncoberta();

			}
		}
		return ListaLetras; // FEITO POR CAIKE
	}
}
