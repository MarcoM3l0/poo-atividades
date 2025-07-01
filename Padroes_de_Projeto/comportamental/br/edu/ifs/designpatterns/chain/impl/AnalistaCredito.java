package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class AnalistaCredito extends Analisador {

	@Override
	public Emprestimo processarRequisição(RequisicaoEmprestimo requisicao) {
		// TODO Auto-generated method stub
		
		if(requisicao.getValor() > (0.3 * requisicao.getRenda())) {
			throw new IllegalStateException("Analista de crédito: Reprovado! Renda insuficiente.");
		}
		
		return sucessor.processarRequisição(requisicao);
	}

}
