package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Acucar extends Decorator {

	public Acucar(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double custo() {
		// TODO Auto-generated method stub
		return super.component.custo() + 0.3;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return super.component.getDescricao() + ", com açúcar";
	}

}
