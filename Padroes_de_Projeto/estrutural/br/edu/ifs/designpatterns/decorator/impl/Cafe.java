package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Cafe implements Component {

	@Override
	public double custo() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Café";
	}

}
