package br.ifs.grasp.service;

import java.math.BigDecimal;

import br.ifs.grasp.model.Moeda;

public class ServicoConversorMoeda implements IConversorMoeda {
	
	public Moeda converter(Moeda valorOrigem, String codigoMoedaDestino) {
		
		if( valorOrigem == null || valorOrigem.getValor().doubleValue() < 0) throw new IllegalArgumentException();
		if(codigoMoedaDestino == null || codigoMoedaDestino.trim() == "") throw new IllegalArgumentException();
			
					
		if("USD" == codigoMoedaDestino.toUpperCase()) {
			return new Moeda(codigoMoedaDestino, valorOrigem.getValor().multiply(BigDecimal.valueOf(0.25)));
		}
		if("EUR" == codigoMoedaDestino.toUpperCase()) {
			return new Moeda(codigoMoedaDestino, valorOrigem.getValor().multiply(BigDecimal.valueOf(0.20)));
		}
		
		return new Moeda(codigoMoedaDestino, valorOrigem.getValor().multiply(BigDecimal.ONE));
	}

}
