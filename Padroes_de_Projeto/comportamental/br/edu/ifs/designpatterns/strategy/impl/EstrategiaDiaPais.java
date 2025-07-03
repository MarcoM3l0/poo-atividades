package br.edu.ifs.designpatterns.strategy.impl;

import br.edu.ifs.designpatterns.strategy.EstrategiaDesconto;

public class EstrategiaDiaPais implements EstrategiaDesconto {

	@Override
	public double calcularDesconto() {
		// TODO Auto-generated method stub
		return 0.6;
	}

}
