package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public class Creme extends Decorator {

	public Creme(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double custo() {
		// TODO Auto-generated method stub
		return super.component.custo() + 1;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return super.component.getDescricao() + ", com creme";
	}

}
