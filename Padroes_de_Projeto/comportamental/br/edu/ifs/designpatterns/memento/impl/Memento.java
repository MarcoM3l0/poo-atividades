package br.edu.ifs.designpatterns.memento.impl;

public class Memento {
	
	private int saude;
	private int vidas;
	
	public Memento(int saude, int vida) {
		super();
		this.saude = saude;
		this.vidas = vida;
	}
	
	public int getSaude() {
		return saude;
	}
	public int getVida() {
		return vidas;
	}

}
