package br.edu.ifs.designpatterns.command;


public class Luz {
	
	private boolean ligada;
	
	public Luz(String nome) {
		// TODO Auto-generated constructor stub
	}

	public void ligar() {
		if(!ligada)
			this.ligada = !this.ligada;
	}

	public void desligar() {
		if(ligada)
			this.ligada = !this.ligada;
	}

	public boolean estaLigada() {
		// TODO Auto-generated method stub
		return this.ligada;
	}

}
