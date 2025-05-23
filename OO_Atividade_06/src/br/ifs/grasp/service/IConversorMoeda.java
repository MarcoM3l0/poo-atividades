package br.ifs.grasp.service;

import br.ifs.grasp.model.Moeda;

public interface IConversorMoeda {
	
	public Moeda converter(Moeda valorOrigem, String codigoMoedaDestino);

}
