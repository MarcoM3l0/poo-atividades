package br.edu.ifs.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Sujeito {
	
	private List<Observador> observadores = new ArrayList<>();
	
	public void inscrever(Observador observador) {
		observadores.add(observador);
	}
	
	public void remover(Observador observador) {
		observadores.remove(observador);
	}
	
	public void notificar() {
		for(Observador observador : new ArrayList<>(observadores))
			observador.atualizar(this);
	}

}
