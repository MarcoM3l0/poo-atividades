package br.edu.ifs.designpatterns.composite.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.composite.Componente;

public class Combo extends Componente {
	
	private List<Componente> componentes = new ArrayList<>();

	public Combo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPreco() {
		// TODO Auto-generated method stub
		
		double valorTotal = 0;
		
		for(Componente componente : componentes) {
			valorTotal += componente.calcularPreco();
		}
		
		return valorTotal;
	}

	public void adicionar(Componente item) {
		// TODO Auto-generated method stub
		componentes.add(item);
	}
	
	public void remover(Componente item) {
		componentes.remove(item);
	}
	
	public Componente obter(int index) {
		return componentes.get(index);
	}

}
