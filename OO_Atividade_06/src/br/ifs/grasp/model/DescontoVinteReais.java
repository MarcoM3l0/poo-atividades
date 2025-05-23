package br.ifs.grasp.model;

import java.math.BigDecimal;

public class DescontoVinteReais implements IEstrategiaDesconto {

	@Override
	public Moeda aplicar(Moeda total, Pedido pedido) {
		
		BigDecimal desconto = BigDecimal.valueOf(20);
		BigDecimal valorDescontado = total.getValor().subtract(desconto).max(BigDecimal.ZERO);
		
		
		return new Moeda(total.getCodigo(), valorDescontado);
		
	}

}
