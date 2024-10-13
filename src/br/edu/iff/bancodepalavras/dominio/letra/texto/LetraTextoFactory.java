package br.edu.iff.bancodepalavras.dominio.letra.texto;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactoryImpl;

public class LetraTextoFactory extends LetraFactoryImpl {
	private LetraTextoFactory instancia = null;
	
	/**
	 * O construtor e privado para apenas a proprica classe criar uma instancia unica de si (Singleton)
	 * 
	 * @author IvanilsoDaSilva
	 */
	private LetraTextoFactory() {
		super();
	}
	
	/**
	 * Cria uma instancia unica de LetraTextoFactory (Singleton)
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de LetraTextoFactory
	 */
	private LetraTextoFactory soleInstance() {
        if (instancia == null) {
        	instancia = new LetraTextoFactory();
        }
        return instancia;
    }
	
	/**
	 * Obtem uma instancia unica de LetraTextoFactory
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de LetraTextoFactory
	 */
	public LetraTextoFactory getSoleInstance() {
		return soleInstance();
	}
	
	@Override
	protected Letra criarLetra(char codigo) {
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
        Letra novaLetra = new LetraTexto(codigo);
        pool[index] = novaLetra;
        return novaLetra;
	}
}
