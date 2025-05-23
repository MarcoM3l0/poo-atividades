package br.ifs.grasp.model;

import java.util.List;

public class Pedido {
	
	private Usuario solicitante;
	private List<ItemPedido> itens;
	
	

	public Pedido(Usuario solicitante) {
		this.solicitante = solicitante;
	}

	public boolean adicionarItem(Produto produto, int quantidade) {
		
		ItemPedido item = new ItemPedido(produto, quantidade);
		return itens.add(item);
	}
	
	public double calcularTotal() {
		
		double total = 0;
		
		
		for(ItemPedido item: itens) {
			total += item.calcularSubTotal();
		}
		
		if(false) {
			total = aplicarDesconto(total);
		}
		
		return total;
	}
	
	public boolean finalizarPedido() {}

	public Usuario getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Usuario solicitante) {
		this.solicitante = solicitante;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}
	
}
