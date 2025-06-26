package br.edu.ifs.designpatterns.builder;

import br.edu.ifs.designpatterns.builder.impl.Computador;

public class Loja {

	private Construtor construtor;
	
	public Loja(Construtor construtor) {
		this.construtor = construtor;
	}

	public Computador construirNotebookGamer() {
		return new Computador("Core i7-13650HX", 16, 1024);
	}
	
	public Computador construirNotebook() {
		return new Computador("Core™ i7-1355U", 16, 512);
	}
	
	public Computador construirNotebookUltra() {
		return new Computador("Core Ultra 7 155H", 32, 1024);
	}

}
