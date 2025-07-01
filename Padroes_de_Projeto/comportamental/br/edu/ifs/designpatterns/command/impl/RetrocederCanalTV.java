package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Televisao;

public class RetrocederCanalTV implements Comando {
	
	private Televisao tv;

	public RetrocederCanalTV(Televisao tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		
		if(!this.tv.estaLigada())
			throw new IllegalStateException("Televisão desligada");
		
		this.tv.setCanal(this.tv.getCanal() - 1);
	}

}
