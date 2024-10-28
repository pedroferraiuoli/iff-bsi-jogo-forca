package br.edu.iff.jogoforca.dominio.jogador;

import br.edu.iff.dominio.ObjetoDominioImpl;

public class Jogador extends ObjetoDominioImpl {
	private String nome;
	private int pontuacao = 0;

    private Jogador(long id, String nome) {
        super(id);
        this.setNome(nome);
    }

    private Jogador(long id, String nome, int pontuacao) {
        super(id);
        this.setNome(nome);
        this.setPontuacao(pontuacao);
    }

	public static Jogador reconstituir(long id, String nome, int pontuacao) {
		return new Jogador(id, nome, pontuacao);
	}

    public static Jogador criar(long id, String nome) {
		return new Jogador(id, nome);
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
	
}
