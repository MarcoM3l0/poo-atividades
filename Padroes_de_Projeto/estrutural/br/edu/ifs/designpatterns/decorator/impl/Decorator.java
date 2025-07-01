package br.edu.ifs.designpatterns.decorator.impl;

import br.edu.ifs.designpatterns.decorator.Component;

public abstract class Decorator implements Component{
	
	protected  Component component;
	public void Decoratro(Component component) {
		this.component = component;
	}
}
