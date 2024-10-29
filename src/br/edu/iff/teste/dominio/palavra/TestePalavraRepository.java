package br.edu.iff.teste.dominio.palavra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.bancodepalavras.dominio.palavra.emmemoria.MemoriaPalavraRepository;
import br.edu.iff.repository.RepositoryException;

class TestePalavraRepository {
//	@Test
//    public void testeSeMemoriaPalavraRepositoryInsereTemaNaMemoria() throws RepositoryException {
//		MemoriaPalavraRepository memoriaPalavraRepository = MemoriaPalavraRepository.getSoleInstance();
//		
//		memoriaPalavraRepository.inserir(Palavra.criar(memoriaPalavraRepository.getProximoId(), "Teste1"));
//		memoriaPalavraRepository.inserir(Palavra.criar(memoriaPalavraRepository.getProximoId(), "Teste2"));
//    	
//        assertSame(memoriaPalavraRepository.getTodos().length, 2, "O tamanho do array deve ser dois");
//    }
//	
//	@Test
//    public void testeSeMemoriaPalavraRepositoryRetornaValorDaMemoria() throws RepositoryException {
//		MemoriaPalavraRepository memoriaPalavraRepository = MemoriaPalavraRepository.getSoleInstance();
//		
//		Tema tema1 = memoriaPalavraRepository.getPorId(1);
//		Tema[] temas2 = memoriaPalavraRepository.getPorNome("Teste2");
//    	
//        assertSame(tema1.getNome(), "Teste1", "O nome do tema1 deve ser igual a 'Teste1'");
//        assertSame(temas2.length, 1, "O tamanho do array deve ser 1");
//    }
}
