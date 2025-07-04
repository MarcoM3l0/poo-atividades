package br.edu.ifs.designpatterns.interpreter.conditional;

import br.edu.ifs.designpatterns.interpreter.Expressao;
import br.edu.ifs.designpatterns.interpreter.ExpressaoNaoTerminal;
import br.edu.ifs.designpatterns.interpreter.relational.ExpressaoRelacional;

public class ExpressaoCondicional extends ExpressaoNaoTerminal {
	
	private Expressao expressao;
	private ExpressaoRelacional<?> relacao;
	
	public ExpressaoCondicional(ExpressaoRelacional<?> relacao, Expressao expressao) {
		super();
		this.expressao = expressao;
		this.relacao = relacao;
	}

	@Override
	public boolean interpretar() {
		// TODO Auto-generated method stub
		
		if(this.relacao.interpretar())
			return this.expressao.interpretar();
		
		return false;
	}

}
