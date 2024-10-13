package br.edu.iff.bancodepalavras.dominio.letra;

public abstract class LetraFactoryImpl implements LetraFactory {
	protected Letra[] pool = new Letra[26];
	private Letra[] encoberta = new Letra[1];
	
	protected LetraFactoryImpl() {}
	
	@Override
	/**
	 * Obtem uma letra
	 * 
	 * @param codigo Codigo da letra a ser buscado
	 * @return Letra buscada
	 */
	public final Letra getLetra(char codigo) {
		return pool[codigo];
	}
	
	@Override
	/**
	 * Obtem a letra encoberta
	 * 
	 * @return Letra encoberta
	 */
	public final Letra getLetraEncoberta() {
		return encoberta[0];
	}
	
	/**
	 * Cria uma letra
	 * 
	 * É um metodo abstrado para ser implementado pelas classes que herdam (Factory)
	 * 
	 * @param codigo Codigo da letra a ser criado
	 * @return Letra criada
	 */
	protected abstract Letra criarLetra(char codigo);
}
