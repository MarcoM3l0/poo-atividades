package br.edu.ifs.designpatterns.factorymethod.impl;

import br.edu.ifs.designpatterns.factorymethod.Personagem;

public class Anao implements Personagem {

	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		return "Ataque: machado";
	}

	@Override
	public String defender() {
		// TODO Auto-generated method stub
		return "Defesa: escudo";
	}

	@Override
	public String usarMagia() {
		// TODO Auto-generated method stub
		return "Magia: resistência";
	}

}
