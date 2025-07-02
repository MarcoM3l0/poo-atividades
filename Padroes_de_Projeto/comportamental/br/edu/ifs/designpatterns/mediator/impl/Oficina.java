package br.edu.ifs.designpatterns.mediator.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class Oficina extends Colaborador {
	
	public Oficina(String id, Mediador mediador) {
		super(id, mediador);
		// TODO Auto-generated constructor stub
		super.mediador.notificar(this, id);
	}

	private List<Aeronave> manutencao = new ArrayList<>();

	public boolean necessitaManutencao(Aeronave aeronave) {
		return manutencao.contains(aeronave);
	}

	public void adicionar(Aeronave aeronave) {
		// TODO Auto-generated method stub
		if(!manutencao.contains(aeronave))
			manutencao.add(aeronave);
	}

}
