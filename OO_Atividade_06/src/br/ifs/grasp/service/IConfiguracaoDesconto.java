package br.ifs.grasp.service;

import br.ifs.grasp.model.IEstrategiaDesconto;

public interface IConfiguracaoDesconto {
	
	public IEstrategiaDesconto getEstrategia(String cupomDesconto);
}
