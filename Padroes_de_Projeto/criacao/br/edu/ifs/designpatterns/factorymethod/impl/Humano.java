package br.edu.ifs.designpatterns.factorymethod.impl;

import br.edu.ifs.designpatterns.factorymethod.Personagem;

public class Humano implements Personagem{

	@Override
	public String atacar() {
		// TODO Auto-generated method stub
		return "Ataque: espada";
	}

	@Override
	public String defender() {
		// TODO Auto-generated method stub
		return "Defesa: rolar";
	}

	@Override
	public String usarMagia() {
		// TODO Auto-generated method stub
		return "Magia: raio de luz";
	}

}
