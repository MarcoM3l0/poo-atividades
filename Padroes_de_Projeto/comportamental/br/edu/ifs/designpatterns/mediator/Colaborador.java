package br.edu.ifs.designpatterns.mediator;

public abstract class Colaborador {
	
	protected Mediador mediador;
	protected String id;
	
	public Colaborador(Mediador mediador, String id) {
		this.mediador = mediador;
		this.id = id;
	}

	public String getId() {
		return id;
	}

}
