package br.edu.ifs.designpatterns.visitor;

public abstract class Mercadoria {
	
	private double custo;

	public Mercadoria(double custo) {
		super();
		this.custo = custo;
	}

	public double getCusto() {
		return custo;
	}

	public abstract double aceitar(Taxador taxador);

}
