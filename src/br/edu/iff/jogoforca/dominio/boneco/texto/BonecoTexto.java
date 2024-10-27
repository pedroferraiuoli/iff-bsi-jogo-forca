package br.edu.iff.jogoforca.dominio.boneco.texto;

import br.edu.iff.jogoforca.dominio.boneco.Boneco;

public class BonecoTexto implements Boneco {
	private static BonecoTexto soleInstance = null;
	private String[] partes = {"cabeça", "olho esquerdo", "olho direito", "nariz", "boca", "tronco", "braço esquerdo", "braço direito", "perna esquerda", "perna direita"};
	
	private BonecoTexto () {
		super();
	}
	
	/**
	 * Obtem uma instancia unica de BonecoTexto
	 * 
	 * @author IvanilsoDaSilva
	 * @return Instancia unica de BonecoTexto
	 */
	public static BonecoTexto getSoleInstance() {
        if (soleInstance == null) {
        	soleInstance = new BonecoTexto();
        }
        return soleInstance;
	}
	
	@Override
	public Boneco getBoneco() {
		return this.getSoleInstance();
	}
	
	@Override
	public void exibir(Object contexto, int partes) {
		for (int i = 0; i < partes; i++) {
			System.out.print(this.partes[i]);
		}
	}
}
