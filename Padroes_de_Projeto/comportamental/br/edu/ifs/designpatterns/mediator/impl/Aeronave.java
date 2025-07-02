package br.edu.ifs.designpatterns.mediator.impl;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class Aeronave extends Colaborador{

	public Aeronave(String id, Mediador mediador) {
		super(id, mediador);
		// TODO Auto-generated constructor stub
	}

	public String solicitarPouso() {
		return super.mediador.notificar(this, "pouso");
	}
	
	public String solicitarDecolagem() {
		return super.mediador.notificar(this, "decolagem");
	}

}
