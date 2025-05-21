package br.ifs.grasp.model;

import java.util.List;

public class Pedido {
	
	private Usuario solicitante;
	private List<ItemPedido> itens;

	public boolean adicionarItem(ItemPedido item) {}
	
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
}
