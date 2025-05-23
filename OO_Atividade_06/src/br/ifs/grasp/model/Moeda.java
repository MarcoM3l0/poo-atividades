package br.ifs.grasp.model;

import java.math.BigDecimal;

public class Moeda {
	
	private String codigo;
	private BigDecimal valor;
	
	public Moeda(String codigo, BigDecimal valor) {
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public Moeda multiplicar(int quantidade) {
		return new Moeda(this.codigo, this.valor.multiply(BigDecimal.valueOf(quantidade)));
	}
	
	public Moeda soma(Moeda itemMoeda) {
		return new Moeda(this.codigo, this.valor.add(itemMoeda.valor));
	}

	public String getCodigo() {
		return codigo;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	

}
