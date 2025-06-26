package br.edu.ifs.designpatterns.factorymethod;

import br.edu.ifs.designpatterns.factorymethod.impl.Anao;
import br.edu.ifs.designpatterns.factorymethod.impl.Elfo;
import br.edu.ifs.designpatterns.factorymethod.impl.Humano;
import br.edu.ifs.designpatterns.factorymethod.impl.Orc;

public class FabricaPersonagens {

	public static Personagem criarPersonagem(String personagem) {
		
		Personagem personagemCriado = switch (personagem) {
			case "Anao" -> new Anao();
			case "Elfo" ->  new Elfo();
			case "Orc" ->  new Orc();
			case "Humano" ->  new Humano();
			default -> throw new IllegalArgumentException("Personagem não encontrado!");
		};

		
		return personagemCriado;
	}

}
