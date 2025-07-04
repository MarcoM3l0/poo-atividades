package br.edu.ifs.designpatterns.command.impl;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.command.Luz;

public class LigarLuz implements Comando{
	
	private Luz luz;

	public LigarLuz(Luz luz) {
		// TODO Auto-generated constructor stub
		this.luz = luz;
	}

	@Override
	public void executar() {
		// TODO Auto-generated method stub
		this.luz.ligar();
	}

	@Override
	public String toString() {
		return "ligar " + this.luz.getNome();
	}

}
