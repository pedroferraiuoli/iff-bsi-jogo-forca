package br.edu.iff.jogoforca.dominio.rodada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
	public Letra[] getLetrasEncobertas() {
		List<Letra> letrasEncobertas = new ArrayList<Letra>();
		for (int i = 0; i < palavra.getTamanho(); i++) {
			if (posicoesDescobertas[i] == false) {
				letrasEncobertas.add(this.palavra.getLetra(i));
			}
		}
		return letrasEncobertas.toArray(new Letra[letrasEncobertas.size()]);
	}

	public Letra[] getLetrasDescobertas() {
		List<Letra> letrasDescobertas = new ArrayList<Letra>();
		for (int i = 0; i < palavra.getTamanho(); i++) {
			if (posicoesDescobertas[i] == true) {
				letrasDescobertas.add(this.palavra.getLetra(i));
			}
		}
		return letrasDescobertas.toArray(new Letra[letrasDescobertas.size()]);
	}

	public int qtdeLetrasEncobertas() {
		int aux = 0;
		for (int i = 0; i < this.palavra.getTamanho(); i++) {
			if (posicoesDescobertas[i] == false) {
				aux++;
			}
		}
		return aux;
	}

	public int calcularPontosLetrasEncobertas(int valorPorLetraEncoberta) {
		int valor = 0;
		for (int i = 0; i < this.palavra.getTamanho(); i++) {
			if (posicoesDescobertas[i] == false) {
				valor += valorPorLetraEncoberta;
			}
		}
		return valor;
	}

	public boolean descobriu() {
		if (this.acertou() || this.qtdeLetrasEncobertas() == 0) {
			return true;
		}
		return false;
	}
	
	public Palavra getPalavra() {
		return palavra;
	}
	
	boolean tentar(char codigo) {
		boolean achou = false;
		for (int i = 0; i < palavra.getLetras().length; i++) {
			if (palavra.getLetras()[i].getCodigo() == Character.toUpperCase(codigo)) {
				posicoesDescobertas[i] = true;
				achou = true;
			}
		}
		return achou;
	}
	
	void arriscar(String palavra) {
		this.setPalavraArriscada(palavra);
	}
	
	public boolean arriscou() {
		return palavraArriscada != null;
	}
	
	public boolean acertou() {
		return this.palavra.toString() == palavraArriscada;
	}
	
}
