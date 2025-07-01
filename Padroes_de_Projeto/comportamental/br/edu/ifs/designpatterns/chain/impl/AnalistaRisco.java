package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class AnalistaRisco extends Analisador {

	@Override
	public Emprestimo processarRequisição(RequisicaoEmprestimo requisicao) {
		// TODO Auto-generated method stub
		
		if(requisicao.getScoreCredito() < 700) {
			throw new IllegalStateException("Analista de risco: Reprovado! Score de crédito baixo.");
		}
		
		return sucessor.processarRequisição(requisicao);
	}

}
