package br.edu.ifs.designpatterns.factorymethod;

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
