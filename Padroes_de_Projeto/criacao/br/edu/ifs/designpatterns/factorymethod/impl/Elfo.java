package br.edu.ifs.designpatterns.factorymethod.impl;

import br.edu.ifs.designpatterns.factorymethod.Personagem;

public class Elfo implements Personagem {

	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		return "Ataque: arco e flecha";
	}

	@Override
	public String defender() {
		// TODO Auto-generated method stub
		return "Defesa: esquiva";
	}

	@Override
	public String usarMagia() {
		// TODO Auto-generated method stub
		return "Magia: cura";
	}

}
