package br.edu.ifs.designpatterns.state.impl;

import br.edu.ifs.designpatterns.state.EstadoMario;
import br.edu.ifs.designpatterns.state.Mario;

public class MarioMorto implements EstadoMario {

	@Override
	public void pegarCogumelo(Mario mario) {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public void pegarFlor(Mario mario) {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
		
	}

	@Override
	public void pegarPena(Mario mario) {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
		
	}

	@Override
	public void sofrerDano(Mario mario) {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
		
	}

	@Override
	public String obterAtque() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("Mario está sem vida!");
	}

	@Override
	public String obterEstado() {
		// TODO Auto-generated method stub
		return "Mario morto";
	}

}
