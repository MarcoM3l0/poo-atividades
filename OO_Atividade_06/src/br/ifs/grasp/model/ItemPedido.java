package br.ifs.grasp.model;

public class ItemPedido {
	
	private int quantidade;
	private Produto produto;
	
	public ItemPedido(Produto produto, int quantidade) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public Moeda calcularSubTotal() {
		
		return getProduto().getPreco().multiplicar(quantidade);
		
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}
	

}
