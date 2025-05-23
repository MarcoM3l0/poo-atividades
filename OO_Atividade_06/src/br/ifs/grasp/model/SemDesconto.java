package br.ifs.grasp.model;

public class SemDesconto implements IEstrategiaDesconto {

	@Override
	public Moeda aplicar(Moeda total, Pedido pedido) {
		return total;
	}

}
