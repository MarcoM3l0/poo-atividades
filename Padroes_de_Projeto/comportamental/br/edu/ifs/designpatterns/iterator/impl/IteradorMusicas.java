package br.edu.ifs.designpatterns.iterator.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.iterator.Iterador;

public class IteradorMusicas implements Iterador<Musica> {
	
	private List<Musica> playlist = new ArrayList<>();

	public IteradorMusicas(List<Musica> playlist) {
		super();
		this.setPlaylist(playlist);
	}

	@Override
	public Musica proximo() {
		// TODO Auto-generated method stub
		if(playlist.size() == 0)
			return null;
		
		Musica proxima = playlist.get(0);
		playlist.remove(proxima);
		
		return proxima;
	}

	@Override
	public boolean temProximo() {
		// TODO Auto-generated method stub
		if(playlist.size() == 0)
			return false;
		
		return true;
	}

	public List<Musica> getPlaylist() {
		return playlist;
	}

	private void setPlaylist(List<Musica> playlist) {
		this.playlist = playlist;
	}

}
