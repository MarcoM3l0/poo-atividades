package br.edu.ifs.designpatterns.factorymethod;

import br.edu.ifs.designpatterns.factorymethod.impl.Anao;
import br.edu.ifs.designpatterns.factorymethod.impl.Elfo;
import br.edu.ifs.designpatterns.factorymethod.impl.Humano;
import br.edu.ifs.designpatterns.factorymethod.impl.Orc;

public class FabricaPersonagens {

	public static Personagem criarPersonagem(String personagem) {
		
		Personagem personagemCriado = switch (personagem) {
			case "anão" -> new Anao();
			case "elfo" ->  new Elfo();
			case "orc" ->  new Orc();
			case "humano" ->  new Humano();
			default -> throw new IllegalArgumentException("Personagem não encontrado!");
		};

		
		return personagemCriado;
	}

}
