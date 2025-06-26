package br.edu.ifs.designpatterns.abstractfactory.implA;

import br.edu.ifs.designpatterns.abstractfactory.Botao;
import br.edu.ifs.designpatterns.abstractfactory.FabricaInterfaceGrafica;
import br.edu.ifs.designpatterns.abstractfactory.Janela;
import br.edu.ifs.designpatterns.abstractfactory.Menu;

public class TemaClaro implements FabricaInterfaceGrafica{

	@Override
	public Janela criarJanela() {
		// TODO Auto-generated method stub
		return new JanelaClara();
	}

	@Override
	public Botao criarBotao() {
		// TODO Auto-generated method stub
		return new BotaoClaro();
	}

	@Override
	public Menu criarMenu() {
		// TODO Auto-generated method stub
		return new MenuClaro();
	}

}
