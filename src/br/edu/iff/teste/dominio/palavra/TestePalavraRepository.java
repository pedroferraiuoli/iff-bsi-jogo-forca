package br.edu.iff.teste.dominio.palavra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.bancodepalavras.dominio.palavra.emmemoria.MemoriaPalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.bancodepalavras.dominio.tema.emmemoria.MemoriaTemaRepository;
import br.edu.iff.repository.RepositoryException;

class TestePalavraRepository {
	@Test
    public void testeSeMemoriaPalavraRepositoryInsereTemaNaMemoria() throws RepositoryException {
		MemoriaPalavraRepository memoriaPalavraRepository = MemoriaPalavraRepository.getSoleInstance();
		
		memoriaPalavraRepository.inserir(Palavra.criar(memoriaPalavraRepository.getProximoId(), "Palavra1", Tema.criar(1, "Tema1")));
		memoriaPalavraRepository.inserir(Palavra.criar(memoriaPalavraRepository.getProximoId(), "Palavra1", Tema.criar(2, "Tema1")));
		memoriaPalavraRepository.inserir(Palavra.criar(memoriaPalavraRepository.getProximoId(), "Palavra2", Tema.criar(3, "Tema2")));
    	
        assertSame(memoriaPalavraRepository.getTodas().length, 2, "O tamanho do array deve ser dois");
    }
	
//	@Test
//    public void testeSeMemoriaPalavraRepositoryRetornaValorDaMemoria() throws RepositoryException {
//		MemoriaPalavraRepository memoriaPalavraRepository = MemoriaPalavraRepository.getSoleInstance();
//		
////		Palavra palavra1 = memoriaPalavraRepository.ge;
//		Palavra[] palavras2 = memoriaPalavraRepository.getPorTema(Tema.criar(1, "Tema1"));
//		
//		System.out.println(palavras2.length);
//    	
////        assertSame(palavra1.getId(), 1, "O nome do tema1 deve ser igual a 'Teste1'");
//        assertSame(palavras2.length, 1, "O tamanho do array deve ser 1");
//    }
}
