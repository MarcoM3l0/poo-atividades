package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Leite extends Decorator {

	public Leite(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double custo() {
		// TODO Auto-generated method stub
		return super.component.custo() + 0.5;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return super.component.getDescricao() + ", com leite";
	}

}
