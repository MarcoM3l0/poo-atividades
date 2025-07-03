package br.edu.ifs.designpatterns.visitor.impl;

import br.edu.ifs.designpatterns.visitor.Taxador;

public class TaxadorIsencao implements Taxador {

	@Override
	public double visitar(Alimento alimento) {
		// TODO Auto-generated method stub
		return alimento.getCusto();
	}

	@Override
	public double visitar(Cerveja cerveja) {
		// TODO Auto-generated method stub
		return cerveja.getCusto() * 2.5;
	}

	@Override
	public double visitar(Cigarro cigarro) {
		// TODO Auto-generated method stub
		return cigarro.getCusto() * 1.15;
	}

	@Override
	public double visitar(Vinho vinho) {
		// TODO Auto-generated method stub
		return vinho.getCusto() * 1.2;
	}

}
