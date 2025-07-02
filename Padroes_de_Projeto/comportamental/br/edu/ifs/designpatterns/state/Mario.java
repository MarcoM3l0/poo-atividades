package br.edu.ifs.designpatterns.state;

import br.edu.ifs.designpatterns.state.impl.*;

public class Mario {
	
	private EstadoMario estado;
	
	public Mario() {
		this.estado = new MarioPequeno();
	}

	public String atacar() {
		
		if((this.estado instanceof MarioMorto))
			this.estado.obterAtque();
		
		return this.estado.obterAtque();
	}
	
	public void pegarCogumelo() {
		
		if((this.estado instanceof MarioMorto))
			this.estado.pegarCogumelo(this);
		
		if((this.estado instanceof MarioFogo) || (this.estado instanceof MarioVoador))
			return;
		
		if(!(this.estado instanceof MarioSuper))
			this.estado.pegarCogumelo(this);
	}
	
	public void pegarFlor() {
		
		if((this.estado instanceof MarioMorto))
			this.estado.pegarFlor(this);
		
		if(!(this.estado instanceof MarioFogo))
			this.estado.pegarFlor(this);
	}
	
	public void pegarPena() {
		
		if((this.estado instanceof MarioMorto))
			this.estado.pegarPena(this);
		
		if(!(this.estado instanceof MarioVoador))
			this.estado.pegarPena(this);
	}
	
	public void sofreDano() {
		
		if((this.estado instanceof MarioMorto))
			this.estado.sofrerDano(this);
		
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
