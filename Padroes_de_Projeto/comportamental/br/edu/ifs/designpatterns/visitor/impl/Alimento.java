package br.edu.ifs.designpatterns.visitor.impl;

import br.edu.ifs.designpatterns.visitor.Mercadoria;
import br.edu.ifs.designpatterns.visitor.Taxador;

public class Alimento extends Mercadoria {

	public Alimento(double custo) {
		super(custo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double aceitar(Taxador taxador) {
		// TODO Auto-generated method stub
		return taxador.visitar(this);
	}

}
