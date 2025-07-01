package br.edu.ifs.designpatterns.command;

public class ControleRemoto {
	
	protected Comando comando;

	public void pressionarBotao() {
		// TODO Auto-generated method stub
		if(this.comando == null) {
			throw new IllegalStateException("Comando não definido");
		}
		
		this.comando.executar();
	} 
	
	public void definirComando(Comando comando) {
		this.comando = comando;
	}

}
