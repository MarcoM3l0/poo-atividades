package br.edu.ifs.designpatterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.observer.Observador;
import br.edu.ifs.designpatterns.observer.Sujeito;

public class Cliente implements Observador {
	
	private String nome;
	private List<String> pedidos = new ArrayList<>();

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void atualizar(Sujeito sujeito) {
		// TODO Auto-generated method stub
		if(sujeito instanceof Produto) {
			Produto produto = (Produto) sujeito;
			comprar(produto);
		}
	}

	public void comprar(Produto produto) {
		// TODO Auto-generated method stub
		
		produto.remover(1);
		pedidos.add(produto.getNome());
	}

	public List<String> getPedidos() {
		return pedidos;
	}

}
