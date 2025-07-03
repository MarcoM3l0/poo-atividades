package br.edu.ifs.designpatterns.state.impl;

import br.edu.ifs.designpatterns.state.EstadoMario;
import br.edu.ifs.designpatterns.state.Mario;

public class MarioPequeno implements EstadoMario {

	@Override
	public void pegarCogumelo(Mario mario) {
		// TODO Auto-generated method stub
		mario.setEstado(new MarioSuper());
	}

	@Override
	public void pegarFlor(Mario mario) {
		// TODO Auto-generated method stub
		mario.setEstado(new MarioFogo());
	}

	@Override
	public void pegarPena(Mario mario) {
		// TODO Auto-generated method stub
		mario.setEstado(new MarioVoador());
	}

	@Override
	public void sofrerDano(Mario mario) {
		// TODO Auto-generated method stub
		mario.setEstado(new MarioMorto());
	}

	@Override
	public String obterAtque() {
		// TODO Auto-generated method stub
		return "Salto";
	}

	@Override
	public String obterEstado() {
		// TODO Auto-generated method stub
		return "Mario pequeno";
	}

}
