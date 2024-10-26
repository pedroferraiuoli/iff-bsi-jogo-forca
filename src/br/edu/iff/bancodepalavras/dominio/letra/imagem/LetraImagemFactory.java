package br.edu.iff.bancodepalavras.dominio.letra.imagem;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactoryImpl;

public class LetraImagemFactory extends LetraFactoryImpl {
	private static LetraImagemFactory instancia = null;
	
	/**
	 * O construtor e privado para apenas a proprica classe criar uma instancia unica de si (Singleton)
	 * 
	 * @author IvanilsoDaSilva
	 */
	private LetraImagemFactory() {
		super();
		this.encoberta = new LetraImagem('_');
	}
	
	/**
	 * Cria uma instancia unica de LetraTextoFactory (Singleton)
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de LetraTextoFactory
	 */
	private static LetraImagemFactory soleInstance() {
        if (instancia == null) {
        	instancia = new LetraImagemFactory();
        }
        return instancia;
    }
	
	/**
	 * Obtem uma instancia unica de LetraTextoFactory
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de LetraTextoFactory
	 */
	public static LetraImagemFactory getSoleInstance() {
		return soleInstance();
	}
	
	@Override
	public Letra criarLetra(char codigo) {
        int index = Character.toUpperCase(codigo) - 'A'; // Índice correspondente no array

        // Verifica se o código está dentro do intervalo A-Z
        if (index < 0 || index >= pool.length) {
            throw new IllegalArgumentException("Código inválido. Apenas letras de A a Z são suportadas.");
        }

        // Se a letra já estiver no pool, retorna a instância existente
        if (pool[index] != null) {
            return pool[index];
        }

        // Cria uma nova letra, armazena no pool e retorna a instância
        Letra novaLetra = new LetraImagem(codigo);
        pool[index] = novaLetra;
        return novaLetra;
	}
}
