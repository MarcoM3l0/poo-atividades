package br.edu.ifs.designpatterns.chain.impl;

import br.edu.ifs.designpatterns.chain.Analisador;

public class Gerente extends Analisador {

	@Override
	public Emprestimo processarRequisição(RequisicaoEmprestimo requisicao) {
		// TODO Auto-generated method stub
		return new Emprestimo(requisicao.getValor());
	}

}
