package br.edu.ifs.designpatterns.proxy.impl;

public class Permissao {
	
	private boolean escrita;
	private boolean leitura;
	
	
	
	public Permissao(boolean escrita, boolean leitura) {
		this.escrita = escrita;
		this.leitura = leitura;
	}

	public boolean podeLer() {
		return this.leitura;
	}
	
	public boolean podeEscrever() {
		return this.escrita;
	}

}
