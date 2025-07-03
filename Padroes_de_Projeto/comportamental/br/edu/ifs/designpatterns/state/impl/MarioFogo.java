package br.edu.ifs.designpatterns.state.impl;

import br.edu.ifs.designpatterns.state.EstadoMario;
import br.edu.ifs.designpatterns.state.Mario;

public class MarioFogo implements EstadoMario {

	@Override
	public void pegarCogumelo(Mario mario) {
		// TODO Auto-generated method stub
		mario.setEstado(this);
	}

	@Override
	public void pegarFlor(Mario mario) {
		// TODO Auto-generated method stub
		mario.setEstado(this);
	}

	@Override
	public void pegarPena(Mario mario) {
		// TODO Auto-generated method stub
		mario.setEstado(new MarioVoador());
	}

	@Override
	public void sofrerDano(Mario mario) {
		// TODO Auto-generated method stub
		mario.setEstado(new MarioSuper());
	}

	@Override
	public String obterAtque() {
		// TODO Auto-generated method stub
		return "Bola de fogo";
	}

	@Override
	public String obterEstado() {
		// TODO Auto-generated method stub
		return "Mario de fogo";
	}

}
