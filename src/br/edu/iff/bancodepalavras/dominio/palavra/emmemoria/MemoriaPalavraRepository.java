package br.edu.iff.bancodepalavras.dominio.palavra.emmemoria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import br.edu.iff.bancodepalavras.dominio.palavra.Palavra;
import br.edu.iff.bancodepalavras.dominio.palavra.PalavraRepository;
import br.edu.iff.bancodepalavras.dominio.tema.Tema;
import br.edu.iff.repository.RepositoryException;

public class MemoriaPalavraRepository implements PalavraRepository {
	private static MemoriaPalavraRepository soloInstance = null;
	private HashSet<Palavra> pool = new HashSet<Palavra>();

	private HashSet<Palavra> getPool(){
		return this.pool;
	}

	@Override
	public long getProximoId() {
		return this.getPool().size()+1;
	}

	@Override
	public Palavra getPorId(long id) {
		Palavra[] novoArray = pool.toArray(new Palavra[0]);
	    
	    for (Palavra palavra : novoArray) {
	        if (palavra.getId() == id) {
	            return palavra;
	        }
	    }
	    
	    return null;
	}

	@Override
	public Palavra[] getPorTema(Tema tema) {
		List<Palavra> palavrasEncontradas = new ArrayList<>();
	    
	    for (Palavra palavra : pool) {
	        if (palavra.getTema().equals(tema)) {
	        	palavrasEncontradas.add(palavra);
	        }
	    }
	    
	    return palavrasEncontradas.toArray(new Palavra[0]);
	}

	@Override
	public Palavra[] getTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Palavra getPalavra(String palavra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserir(Palavra palavra) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Palavra palavra) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Palavra palavra) throws RepositoryException {
		// TODO Auto-generated method stub
		
	}
}
