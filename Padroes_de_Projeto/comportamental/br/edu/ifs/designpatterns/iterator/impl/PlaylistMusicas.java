package br.edu.ifs.designpatterns.iterator.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.iterator.Agregador;
import br.edu.ifs.designpatterns.iterator.Iterador;


public class PlaylistMusicas implements Agregador<Musica>{
	
	private List<Musica> musicas = new ArrayList<>();
	private IteradorMusicas iteradorMusicas;

	@Override
	public Iterador<Musica> criarIterador() {
		// TODO Auto-generated method stub
		
		return this.setIteradorMusicas(new IteradorMusicas(this.musicas));
	}

	public void adicionar(Musica musica) {
		// TODO Auto-generated method stub
		this.musicas.add(musica);
	}

	public IteradorMusicas getIteradorMusicas() {
		return iteradorMusicas;
	}

	private IteradorMusicas setIteradorMusicas(IteradorMusicas iteradorMusicas) {
		this.iteradorMusicas = iteradorMusicas;
		return iteradorMusicas;
	}

}
