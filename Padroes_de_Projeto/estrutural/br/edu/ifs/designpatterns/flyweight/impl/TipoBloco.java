package br.edu.ifs.designpatterns.flyweight.impl;

import br.edu.ifs.designpatterns.flyweight.Flyweight;

public class TipoBloco implements Flyweight{
	
	private String nome;
	private boolean quebravel;
	private boolean inflamavel;
	private boolean empilhavel;
	
	public TipoBloco(String nome, boolean quebravel, boolean inflamavel, boolean empilhavel) {
		this.nome = nome;
		this.quebravel = quebravel;
		this.inflamavel = inflamavel;
		this.empilhavel = empilhavel;
	}
	
	@Override
	public String mostrar() {
		return this.toString();
	}

	@Override
	public String toString() {
		
		String quebravelStr = quebravel ? ", quebrável" : ", inquebrável";
		String inflamavelStr = inflamavel ? ", inflamável" : ", inflamável";
		String empilhavelStr = empilhavel ? ", empilhável" : ", não empilhável";
		
		return nome + quebravelStr + inflamavelStr + empilhavelStr;
	}

	
}
