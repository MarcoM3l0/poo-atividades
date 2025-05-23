package br.ifs.grasp.service;

import java.util.HashMap;
import java.util.Map;

import br.ifs.grasp.model.DescontoBlackFriday;
import br.ifs.grasp.model.DescontoVinteReais;
import br.ifs.grasp.model.IEstrategiaDesconto;
import br.ifs.grasp.model.SemDesconto;

public class ServicoConfiguracaoDesconto implements IConfiguracaoDesconto {
	private Map<String, IEstrategiaDesconto> estrategias = new HashMap<>();
	
	

	public ServicoConfiguracaoDesconto() {
		estrategias.put("BLACKFRIDAY", new DescontoBlackFriday());
        estrategias.put("20REAIS", new DescontoVinteReais());
	}



	@Override
	public IEstrategiaDesconto getEstrategia(String cupomDesconto) {
		
		if(cupomDesconto == null) {
			return new SemDesconto();
		}
		
		IEstrategiaDesconto estrategiaDesconto = estrategias.get(cupomDesconto.toUpperCase());
		
		return estrategiaDesconto != null ? estrategiaDesconto : new SemDesconto(); 
	}

}
