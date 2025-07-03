package br.edu.ifs.designpatterns.visitor.impl;

import br.edu.ifs.designpatterns.visitor.Taxador;

public class TaxadorFederal implements Taxador {

	@Override
	public double visitar(Alimento alimento) {
		// TODO Auto-generated method stub
		return alimento.getCusto() * 1.11;
	}

	@Override
	public double visitar(Cerveja cerveja) {
		// TODO Auto-generated method stub
		return cerveja.getCusto() * 1.46;
	}

	@Override
	public double visitar(Cigarro cigarro) {
		// TODO Auto-generated method stub
		return cigarro.getCusto() * 2.5;
	}

	@Override
	public double visitar(Vinho vinho) {
		// TODO Auto-generated method stub
		return vinho.getCusto() * 1.6;
	}

}
