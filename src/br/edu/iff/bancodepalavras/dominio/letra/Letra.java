package br.edu.iff.bancodepalavras.dominio.letra;

public abstract class Letra {
	private char codigo;
	
	/**
	 * Construtor da classe Letra
	 * 
	 * @author IvanilsoDaSilva
	 * @param codigo Codigo ASCII da letra 
	 */
	protected Letra(char codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Obtem o codigo ASCII da letra
	 * 
	 * @author IvanilsoDaSilva
	 * @return Codigo da letra
	 */
	public char getCodigo() {
		return this.codigo;
	}
	
	/**
	 * Exibe o caracter na tela
	 * 
	 * @author IvanilsoDaSilva
	 * @param contexto Contexto da exibicao
	 */
	public abstract void exibir(Object contexto);
	
	@Override
	/**
	 * Obtem o hashcode do objeto
	 * 
	 * @author IvanilsoDaSilva
	 * @return Hashcode do objeto
	 */
	public int hashCode() {
		return codigo;
	}
	
	@Override
	/**
	 * Retorna o objeto como String
	 * 
	 * @author IvanilsoDaSilva
	 * @return Objeto como String
	 */
	public final String toString() {
		return Character.toString(codigo);
	}
	
	@Override
	/**
	 * Verifica se os objetos são iguais
	 * 
	 * @author IvanilsoDaSilva
	 * @param o Objeto a ser comparado
	 * @return Se são iguais
	 */
	public boolean equals(Object obj) {
		return this == obj;
	}
}