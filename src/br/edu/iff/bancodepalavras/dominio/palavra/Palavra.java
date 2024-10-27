package br.edu.iff.bancodepalavras.dominio.palavra;

import java.util.ArrayList;
import java.util.List;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactory;
import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.dominio.ObjetoDominioImpl;

public class Palavra extends ObjetoDominioImpl {
	private static LetraFactory letraFactory = null;
	private Tema tema;
	private Letra[] letras;
	
	private Palavra(long id, String palavra, Tema tema) {
		super(id);
		
		if (letraFactory == null) {
			throw new IllegalStateException("Atributo letraFactory indefinido");
		}
		
		letras =  new Letra[palavra.length()];
		for (int i = 0; i<palavra.length();i++) {
			letras[i] = letraFactory.getLetra(palavra.charAt(i));
		}
		
		this.tema = tema; 
	}
	
	public static Palavra reconstituir(long id, String palavra, Tema tema) {
		return new Palavra(id, palavra, tema);
	}
	
	public static Palavra criar(long id, String palavra, Tema tema) {
		return new Palavra(id, palavra, tema);
	}
	
	public void setLetraFactory(LetraFactory letraFactory) {
		Palavra.letraFactory = letraFactory;
	}

	public static LetraFactory getLetraFactory() {
		return letraFactory;
	}
	
	public Tema getTema() {
		return this.tema; 
	}
	
	public int getTamanho() {
		return letras.length;
	}
	
	public Letra[] getLetras() {
		return null;
	}
	
	public void exibir(boolean[] posicoes) {
		for (int i = 0; i < posicoes.length; i++) {
			if (posicoes[i]) {
				System.out.print(letras[i]);
			}
			System.out.println(Palavra.letraFactory.getLetraEncoberta());
		}
	}
	
	public boolean comparar(String palavra) {
		return this.toString() == palavra;
	}
	
	public int[] tentar(char codigo) {
		List<Integer> posicoes = new ArrayList<>();
		
		for (int i=0;i<letras.length;i++) {
			if (letras[i].getCodigo() == codigo) {
				posicoes.add(i);
			}
		}
		
		return posicoes.stream().mapToInt(Integer::intValue).toArray();
	}
	
	@Override
	public String toString() {
		String palavra = "";
		for (Letra letra : letras) {
			palavra = palavra + letra;
		}
		return palavra;
	}
}
