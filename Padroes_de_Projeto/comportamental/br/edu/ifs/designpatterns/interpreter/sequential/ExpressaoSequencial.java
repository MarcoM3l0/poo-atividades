package br.edu.ifs.designpatterns.interpreter.sequential;

import br.edu.ifs.designpatterns.interpreter.Expressao;
import br.edu.ifs.designpatterns.interpreter.ExpressaoNaoTerminal;
import br.edu.ifs.designpatterns.interpreter.terminal.Executavel;

public class ExpressaoSequencial extends ExpressaoNaoTerminal {

	public ExpressaoSequencial() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean interpretar() {
		// TODO Auto-generated method stub
		
		
		for(Expressao e : super.expressoes) {
			if(!e.interpretar())
				return  false;
		}
		
		return true;
	}

	public void addExpressao(Executavel executavel) {
		// TODO Auto-generated method stub
		super.expressoes.add(executavel);
	}

}
