package br.edu.ifs.designpatterns.factorymethod.impl;

import br.edu.ifs.designpatterns.factorymethod.Personagem;

public class Orc implements Personagem{

	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		return "Ataque: garras";
	}

	@Override
	public String defender() {
		// TODO Auto-generated method stub
		return "Defesa: absorver";
	}

	@Override
	public String usarMagia() {
		// TODO Auto-generated method stub
		return "Magia: espirito maligno";
	}

}
