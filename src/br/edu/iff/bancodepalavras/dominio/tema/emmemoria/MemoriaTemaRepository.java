package br.edu.iff.bancodepalavras.dominio.tema.emmemoria;

import java.util.List;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;

public class MemoriaTemaRepository {
	private static MemoriaTemaRepository soleInstance;
	private List<Tema> pool = null;
	
	private MemoriaTemaRepository() {}
	
	/**
	 * Obtem uma instancia unica de MemoriaRepositoryFactory
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de MemoriaRepositoryFactory
	 */
	public static MemoriaTemaRepository getSoleInstance() {
        if (soleInstance == null) {
        	soleInstance = new MemoriaTemaRepository();
			return soleInstance;
        }
        return soleInstance;
	}
}
