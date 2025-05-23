package br.ifs.grasp.service;

import br.ifs.grasp.model.Pedido;
import br.ifs.grasp.model.Relatorio;

public class ServicoRelatorio implements IRelatorio {

	public Relatorio gerarRelatorio(Pedido pedido) {
		
		return new Relatorio(pedido);
		
	}
	
}
