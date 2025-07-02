package br.edu.ifs.designpatterns.state;

import br.edu.ifs.designpatterns.state.impl.*;

public class Mario {
	
	private EstadoMario estado;
	
	public Mario() {
		this.estado = new MarioPequeno();
	}

	public String atacar() {
		
		return this.estado.obterAtque();
	}
	
	public void pegarCogumelo() {
		
		this.estado.pegarCogumelo(this);
	}
	
	public void pegarFlor() {
		this.estado.pegarFlor(this);
	}
	
	public void pegarPena() {
		
		this.estado.pegarPena(this);
	}
	
	public void sofreDano() {
		
		this.estado.sofrerDano(this);
	}

	public String obterEstado() {
		// TODO Auto-generated method stub
		return this.estado.obterEstado();
	}

	public void setEstado(EstadoMario estado) {
		this.estado = estado;
	}

	
}
