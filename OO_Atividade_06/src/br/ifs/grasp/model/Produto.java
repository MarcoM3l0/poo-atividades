package br.ifs.grasp.model;

public class Produto {
	
	private String nome;
	private Moeda preco;
	private int quatidade;
	private String descricao;
	
	
	public Produto(String nome, Moeda preco, int quatidade, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.quatidade = quatidade;
		this.descricao = descricao;
	}


	public String getNome() {
		return nome;
	}


	public Moeda getPreco() {
		return preco;
	}


	public int getQuatidade() {
		return quatidade;
	}


	public String getDescricao() {
		return descricao;
	}
	
	

}
