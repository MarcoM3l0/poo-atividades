package br.edu.ifs.designpatterns.mediator;

import br.edu.ifs.designpatterns.mediator.impl.ControladorTrafego;

public abstract class Colaborador {
	
	protected Mediador mediador() {
		
		Mediador mediador = new ControladorTrafego();
		
		return mediador;
		
	}

}
