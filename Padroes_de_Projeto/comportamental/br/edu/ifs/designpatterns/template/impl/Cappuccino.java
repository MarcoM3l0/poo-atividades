package br.edu.ifs.designpatterns.template.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.template.Bebida;

public class Cappuccino extends Bebida {

	@Override
	protected List<String> prepararIngredientes() {
		// TODO Auto-generated method stub
		List<String> ingredientes = new ArrayList<>();
		
		ingredientes.add("Adicionar uma colher de café");
		ingredientes.add("Adicionar uma colher de leite em pó");
		ingredientes.add("Adicionar uma colher de chocolate em pó");
		
		return ingredientes;
	}

}
