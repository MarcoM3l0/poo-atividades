package br.edu.ifs.designpatterns.strategy;

public class Ingresso {
	
	private double valor;
	private EstrategiaDesconto estrategia;
	
	public Ingresso(double valor, EstrategiaDesconto estrategia) {
		super();
		this.valor = valor;
		this.estrategia = estrategia;
	}

	public double calcularValor() {
		return this.valor * this.estrategia.calcularDesconto();
	}

}
