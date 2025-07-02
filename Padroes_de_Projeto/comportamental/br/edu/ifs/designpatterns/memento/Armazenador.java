package br.edu.ifs.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.memento.impl.Memento;

public class Armazenador {
	
	private List<Memento> mementos = new ArrayList<>();
	private List<String> mementosHistorico = new ArrayList<>();

	public void armazenar(Memento salvar) {
		// TODO Auto-generated method stub
		mementos.add(salvar);
	}

	public Memento recuperar() {
		// TODO Auto-generated method stub
		
		if(mementos.size() == 0)
			throw new IllegalStateException("Histórico vazio");
		
		Memento recuperar = mementos.get(mementos.size() - 1);
		mementos.remove(recuperar);
		mementosHistorico.add(recuperar.toString());
		
		return recuperar;
	}
	
	public String recuperarHistorico() {
		return mementosHistorico.toString();
	}

}
