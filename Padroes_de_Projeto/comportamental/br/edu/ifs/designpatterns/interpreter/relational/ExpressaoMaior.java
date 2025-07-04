package br.edu.ifs.designpatterns.interpreter.relational;

import br.edu.ifs.designpatterns.interpreter.terminal.Variavel;

public class ExpressaoMaior<T extends Comparable<? super T>> extends ExpressaoRelacional<T> {

	public ExpressaoMaior(String nome, Variavel<T> termo1, Variavel<T> termo2) {
		super(nome, termo1, termo2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean interpretar() {
		// TODO Auto-generated method stub
		return false;
	}

}
