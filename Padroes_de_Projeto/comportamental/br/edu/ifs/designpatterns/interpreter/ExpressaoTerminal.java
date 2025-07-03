package br.edu.ifs.designpatterns.interpreter;

public abstract class ExpressaoTerminal<G> extends Expressao {
	
	private G contexto;

	public ExpressaoTerminal(G contexto) {
		super();
		this.contexto = contexto;
	}

	public G getContexto() {
		return contexto;
	}

}
