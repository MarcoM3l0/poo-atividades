package br.edu.ifs.designpatterns.interpreter.relational;

import br.edu.ifs.designpatterns.interpreter.terminal.Variavel;

public class ExpressaoMaior<T extends Comparable<? super T>> extends ExpressaoRelacional<T> {

	public ExpressaoMaior(Variavel<T> termo1, Variavel<T> termo2) {
		super(termo1.getNome()  + " maior do que " + termo2.getValor().toString(),
				termo1, termo2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean interpretar() {
		// TODO Auto-generated method stub
		return super.termo1.getValor().compareTo(super.termo2.getValor()) > 0;
	}

}
