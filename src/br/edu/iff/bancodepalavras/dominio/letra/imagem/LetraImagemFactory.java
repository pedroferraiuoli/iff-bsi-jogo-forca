package br.edu.iff.bancodepalavras.dominio.letra.imagem;

import br.edu.iff.bancodepalavras.dominio.letra.Letra;
import br.edu.iff.bancodepalavras.dominio.letra.LetraFactoryImpl;

public class LetraImagemFactory extends LetraFactoryImpl {
	private static LetraImagemFactory soleInstance = null;
	
	/**
	 * O construtor e privado para apenas a proprica classe criar uma instancia unica de si (Singleton)
	 * 
	 * @author IvanilsoDaSilva
	 */
	private LetraImagemFactory() {
		super();
		this.encoberta = new LetraImagem('_');
	}
	
	private void setEncoberta(LetraImagem letra) {
		if (letra.getCodigo() < 26 - 'A' || letra.getCodigo() > 0 - 'A') {
			throw new IllegalArgumentException("A letra coberta não pode ser um caracter entre A e Z");
		}
		this.encoberta = letra;
	}
	
	/**
	 * Obtem uma instancia unica de LetraImagemFactory
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de LetraImagemFactory
	 */
	public static LetraImagemFactory getSoleInstance() {
        if (soleInstance == null) {
        	return soleInstance = new LetraImagemFactory();
        }
        return soleInstance;
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
