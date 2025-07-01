package br.edu.ifs.designpatterns.iterator.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifs.designpatterns.iterator.Agregador;
import br.edu.ifs.designpatterns.iterator.Iterador;

public class PlaylistArtistas implements Agregador<Musica>{
	
	private Map<String, List<Musica>> musicas = new HashMap<>();
	private IteradorArtistas iteradorArtistas;

	public void adicionar(Musica musica) {
		// TODO Auto-generated method stub
		musicas
			.computeIfAbsent(musica.getArtista(), chave -> new ArrayList<>())
			.add(musica);
	}

	public Iterador<Musica> criarIterador() {
		// TODO Auto-generated method stub
		
		List<Musica> todasMusicas = new ArrayList<>();
		
		for(List<Musica> musicasPorArtista : musicas.values()) {
			todasMusicas.addAll(musicasPorArtista);
		}
		
		return setIteradorArtistas(new IteradorArtistas(todasMusicas));
	}

	private IteradorArtistas setIteradorArtistas(IteradorArtistas iteradorArtistas) {
		this.iteradorArtistas = iteradorArtistas;
		return iteradorArtistas;
	}

}
