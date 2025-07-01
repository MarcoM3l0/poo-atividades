package br.edu.ifs.designpatterns.command;


public class Televisao {
	
	private boolean ligada;
	private int canal;
	
	public Televisao(String nome) {
		// TODO Auto-generated constructor stub
		this.canal = 1;
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

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
}
