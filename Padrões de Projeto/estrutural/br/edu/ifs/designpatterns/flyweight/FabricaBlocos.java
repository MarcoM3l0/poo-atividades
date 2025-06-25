package br.edu.ifs.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifs.designpatterns.flyweight.impl.TipoBloco;

public class FabricaBlocos {
	
	private static  Map<String, TipoBloco> mapaBlocos = new HashMap<String, TipoBloco>();

	public static TipoBloco obterTipo(String nome, boolean quebravel, boolean inflamavel, boolean empilhavel) {
		
		if(!mapaBlocos.containsKey(nome)) {
			mapaBlocos.put(nome, new TipoBloco(nome, quebravel, inflamavel, empilhavel));
		}
		
		return mapaBlocos.get(nome);
	}

}
