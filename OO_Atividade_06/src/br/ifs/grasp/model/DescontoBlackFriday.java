package br.ifs.grasp.model;

import java.math.BigDecimal;

public class DescontoBlackFriday implements IEstrategiaDesconto {

	@Override
	public Moeda aplicar(Moeda total, Pedido pedido) {
		return new Moeda(total.getCodigo(), total.getValor().multiply(BigDecimal.valueOf(0.8)));
	}

}
