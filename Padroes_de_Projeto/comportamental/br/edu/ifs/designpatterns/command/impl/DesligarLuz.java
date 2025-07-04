package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Luz;

public class DesligarLuz implements Comando {
	
	private Luz luz;

	public DesligarLuz(Luz luz) {
		// TODO Auto-generated constructor stub
		this.luz = luz;
	}

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		this.luz.desligar();
	}

	@Override
	public String toString() {
		return "desligar " + this.luz.getNome();
	}

}
