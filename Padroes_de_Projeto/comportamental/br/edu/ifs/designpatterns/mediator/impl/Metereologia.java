package br.edu.ifs.designpatterns.mediator.impl;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class Metereologia extends Colaborador {

	private boolean condicoesFavoraveis;

	public Metereologia(String id, Mediador mediador) {
		super(id, mediador);
		// TODO Auto-generated constructor stub
	}


	public String informarCondicoes() {
		
		if(isCondicoesFavoraveis())
			return super.mediador.notificar(this, "condicoesFavoraveis");
		
		return "Condições metereológicas desfavoraveis.";
		
	}


	public boolean isCondicoesFavoraveis() {
		return condicoesFavoraveis;
	}


	public void setCondicoesFavoraveis(boolean condicoesFavoraveis) {
		this.condicoesFavoraveis = condicoesFavoraveis;
	}

}
