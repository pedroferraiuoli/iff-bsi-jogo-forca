package br.edu.iff.bancodepalavras.dominio.letra;

public abstract class Letra {
	private char codigo;
	
	protected Letra(char codigo) {
		this.codigo = codigo;
	}
	
	public char getCodigo() {
		return this.codigo;
	}
	
	public boolean equals(Object o) {
		return this == o;
	}
	
	public int hashcode() {
		return codigo;
	}
	
	public final String toString() {
		return Character.toString(codigo);
	}
	
	public abstract void exibir(Object contexto);
}