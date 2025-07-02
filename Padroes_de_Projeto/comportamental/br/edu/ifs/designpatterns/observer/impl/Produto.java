package br.edu.ifs.designpatterns.observer.impl;

import br.edu.ifs.designpatterns.observer.Sujeito;

public class Produto extends Sujeito {
	
	private String nome;
	private int quantidade;
	
	public Produto(String nome) {
		super();
		this.nome = nome;
	}
	
	public void adicionar(int quantidade) {
		if(quantidade <= 0)
			return;
		
		this.quantidade = quantidade;
		
		if(estaDisponivel())
			super.notificar();
	}
	
	public void remover(int quantidade) {
		if(quantidade <= 0)
			return;
		
		if(this.quantidade < quantidade)
			throw new IllegalStateException("Produto indisponível");
		
		this.quantidade -= quantidade;
	}
	
	public boolean estaDisponivel() {
		return this.quantidade > 0;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
