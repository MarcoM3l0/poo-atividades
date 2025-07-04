package br.edu.ifs.designpatterns.interpreter;

import java.util.ArrayList;
import java.util.List;

public abstract class ExpressaoNaoTerminal extends Expressao {
	
	private List<Expressao> expressoes = new ArrayList<>();

	public ExpressaoNaoTerminal() {
		super();
	}

	public List<Expressao> getExpressoes() {
		return expressoes;
	}

	public void setExpressoes(List<Expressao> expressoes) {
		this.expressoes = expressoes;
	}

}
