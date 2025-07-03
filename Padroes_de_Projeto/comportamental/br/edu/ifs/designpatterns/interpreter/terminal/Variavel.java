package br.edu.ifs.designpatterns.interpreter.terminal;

import br.edu.ifs.designpatterns.interpreter.ExpressaoTerminal;

public class Variavel<G extends Comparable<? super G>> extends ExpressaoTerminal<G> {
	
	private String nome;

	public Variavel( String nome, G contexto) {
		super(contexto);
		this.nome = nome;
	}

	public Variavel(G contexto) {
		super(contexto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean interpretar() {
		// TODO Auto-generated method stub
		return super.getContexto() != null;
	}
	
	 public G getValor() {
        return super.getContexto();
    }

	public String getNome() {
		return nome;
	}
}
