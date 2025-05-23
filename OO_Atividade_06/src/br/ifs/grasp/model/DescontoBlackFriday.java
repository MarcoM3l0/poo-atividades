package br.ifs.grasp.model;

public class DescontoBlackFriday implements IEstrategiaDesconto {

	@Override
	public double aplicar(double total, Pedido pedido) {
		return total * 0.8;
	}

}
