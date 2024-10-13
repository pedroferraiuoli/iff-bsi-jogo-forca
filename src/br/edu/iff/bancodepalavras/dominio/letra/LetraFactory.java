package br.edu.iff.bancodepalavras.dominio.letra;

public interface LetraFactory {
	/**
	 *  Obtem uma letra pelo seu codigo ASCII
	 * 
	 * @author IvanilsoDaSilva
	 * @param codigo Codigo da tabela ASCII
	 * @return Letra encoberta buscada
	 */
	 public Letra getLetra(char codigo);
	 
	 /**
	  * Obtem a letra encoberta
	  * 
	  * @author IvanilsoDaSilva
	  * @return Letra encoberta
	  */
	 public Letra getLetraEncoberta();
}
