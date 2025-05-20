package br.ifs.grasp.model;

import java.util.List;

public class Pedido {
	
	private Usuario solicitante;
	private List<ItemPedido> itens;

	public boolean adicionarItem(ItemPedido item) {}
	
	public double calcularTotal() {}
	
	public boolean finalizarPedido() {}
}
