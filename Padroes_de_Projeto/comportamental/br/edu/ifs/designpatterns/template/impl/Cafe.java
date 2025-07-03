package br.edu.ifs.designpatterns.template.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.template.Bebida;

public class Cafe extends Bebida {

	@Override
	protected List<String> prepararIngredientes() {
		// TODO Auto-generated method stub
List<String> ingrediente = new ArrayList<>();
		
		ingrediente.add("Adicionar uma colher de café");
		
		return ingrediente;
	}

}
