package br.edu.ifs.designpatterns.iterator;

public interface Agregador<G> {

	public Iterador<G> criarIterador();
	
}
