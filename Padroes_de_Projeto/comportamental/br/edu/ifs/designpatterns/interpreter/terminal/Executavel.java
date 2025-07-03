package br.edu.ifs.designpatterns.interpreter.terminal;

import br.edu.ifs.designpatterns.command.Comando;
import br.edu.ifs.designpatterns.interpreter.ExpressaoTerminal;

public class Executavel extends ExpressaoTerminal<Comando> {

	private Comando comando;
	
	public Executavel(Comando contexto) {
		super(contexto);
		// TODO Auto-generated constructor stub
		this.comando = contexto;
	}

	@Override
	public boolean interpretar() {
		// TODO Auto-generated method stub
		try {
			this.comando.executar();
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
