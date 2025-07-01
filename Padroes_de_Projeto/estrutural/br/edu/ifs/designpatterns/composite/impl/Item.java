package br.edu.ifs.designpatterns.composite.impl;

import br.edu.ifs.designpatterns.composite.Componente;

public class Item extends Componente {

	private double valor;
	
	public Item(String nome, double valor) {
		super(nome);
		// TODO Auto-generated method stub
		this.valor = valor;
	}

	@Override
	public double calcularPreco() {
		// TODO Auto-generated method stub
		return this.valor;
	}

	

}
