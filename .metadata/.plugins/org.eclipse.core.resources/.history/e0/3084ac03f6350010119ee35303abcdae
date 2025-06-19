package br.ifs.grasp.model;

public class ItemPedido {
	
	private int quantidade;
	private Produto produto;
	
	public ItemPedido(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public double calcularSubTotal() {
		
		return getProduto().getPreco() * getQuantidade();
		
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}
	

}
