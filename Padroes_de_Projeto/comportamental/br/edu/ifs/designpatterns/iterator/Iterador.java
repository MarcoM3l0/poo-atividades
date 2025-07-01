package br.edu.ifs.designpatterns.iterator;

public interface Iterador<G> {
	
	public G proximo();
	public boolean temProximo();
}
