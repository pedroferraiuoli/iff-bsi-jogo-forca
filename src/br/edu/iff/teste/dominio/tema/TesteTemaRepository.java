package br.edu.iff.teste.dominio.tema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.bancodepalavras.dominio.tema.emmemoria.MemoriaTemaRepository;
import br.edu.iff.repository.RepositoryException;

class TesteTemaRepository {
	@Test
    public void testeSeMemoriaTemaRepositoryInsereTemaNaMemoria() throws RepositoryException {
		MemoriaTemaRepository memoriaTemaRepository = MemoriaTemaRepository.getSoleInstance();
		
		memoriaTemaRepository.inserir(Tema.criar(memoriaTemaRepository.getProximoId(), "Teste1"));
		memoriaTemaRepository.inserir(Tema.criar(memoriaTemaRepository.getProximoId(), "Teste1"));
		memoriaTemaRepository.inserir(Tema.criar(memoriaTemaRepository.getProximoId(), "Teste2"));
    	
        assertSame(memoriaTemaRepository.getTodos().length, 2, "O tamanho do array deve ser dois");
    }
	
	@Test
    public void testeSeMemoriaTemaRepositoryRetornaValorDaMemoria() throws RepositoryException {
		MemoriaTemaRepository memoriaTemaRepository = MemoriaTemaRepository.getSoleInstance();
		
		Tema tema1 = memoriaTemaRepository.getPorId(1);
		Tema[] temas2 = memoriaTemaRepository.getPorNome("Teste2");
    	
        assertSame(tema1.getNome(), "Teste1", "O nome do tema1 deve ser igual a 'Teste1'");
        assertSame(temas2.length, 1, "O tamanho do array deve ser 1");
    }
}
