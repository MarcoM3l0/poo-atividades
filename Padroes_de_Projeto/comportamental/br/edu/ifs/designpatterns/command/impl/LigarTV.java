package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Televisao;

public class LigarTV implements Comando{
	
	private Televisao tv;

	public LigarTV(Televisao tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		this.tv.ligar();
	}

	@Override
	public String toString() {
		return "ligar " + this.tv.getNome();
	}

}
