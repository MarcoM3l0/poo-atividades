package br.edu.ifs.designpatterns.interpreter.terminal;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.interpreter.ExpressaoTerminal;

public class Executavel extends ExpressaoTerminal<Object> {
	
	private Comando comando;

	public Executavel(Object obj) {
		// TODO Auto-generated constructor stub
		this.comando = (Comando) obj;
	}

	@Override
	public boolean interpretar() {
		// TODO Auto-generated method stub
		return comando.executar();
	}


}
