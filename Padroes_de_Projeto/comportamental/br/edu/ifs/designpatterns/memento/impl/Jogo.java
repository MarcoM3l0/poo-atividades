package br.edu.ifs.designpatterns.memento.impl;

public class Jogo {
	
	private int saude = 100;
	private int vidas = 3;
	
	public Memento salvar() {
		return new Memento(this.saude, this.vidas);
	}

	public void causarDano(int dano) {
		// TODO Auto-generated method stub
		
		this.saude -= dano;
		
		if(this.saude <= 0) {
			if(this.vidas == 1)
				throw new IllegalStateException("Fim de Jogo");
			
			this.saude = 100;
			this.vidas--;
		}
	}
	
	public void restaurar(Memento momento) {
		this.saude = momento.getSaude();
		this.vidas = momento.getVida();
	}

	@Override
	public String toString() {
		return "{saúde: " + saude + ", vidas: " + vidas + "}";
	}

}
