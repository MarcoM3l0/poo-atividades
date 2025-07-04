package br.edu.ifs.designpatterns.interpreter.relational;

import br.edu.ifs.designpatterns.interpreter.ExpressaoNaoTerminal;
import br.edu.ifs.designpatterns.interpreter.terminal.Variavel;

public abstract class ExpressaoRelacional<T extends Comparable<? super T>> extends ExpressaoNaoTerminal {
	
	protected String nome;
	protected Variavel<T> termo1;
	protected Variavel<T> termo2;
	
	public ExpressaoRelacional(String nome, Variavel<T> termo1, Variavel<T> termo2) {
		super();
		this.nome = nome;
		this.termo1 = termo1;
		this.termo2 = termo2;
	}

}
