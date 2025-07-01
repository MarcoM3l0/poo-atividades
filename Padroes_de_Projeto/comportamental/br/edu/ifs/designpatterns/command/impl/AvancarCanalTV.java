package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Televisao;

public class AvancarCanalTV implements Comando {
	
	private Televisao tv;

	public AvancarCanalTV(Televisao tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		this.tv.setCanal(this.tv.getCanal() + 1);
	}

}
