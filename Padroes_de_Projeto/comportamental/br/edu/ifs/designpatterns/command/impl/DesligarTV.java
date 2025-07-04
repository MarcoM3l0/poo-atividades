package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Televisao;

public class DesligarTV implements Comando {
	
	private Televisao tv;

	public DesligarTV(Televisao tv) {
		this.tv = tv;
	}

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		this.tv.desligar();
	}

	@Override
	public String toString() {
		return "desligar " + this.tv.getNome();
	}

}
