package br.ifs.grasp.model;

public interface IEstrategiaDesconto {
	
	public Moeda aplicar(Moeda total, Pedido pedido);
	
}
