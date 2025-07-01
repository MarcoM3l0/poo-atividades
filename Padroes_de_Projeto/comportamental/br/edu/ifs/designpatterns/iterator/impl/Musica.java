package br.edu.ifs.designpatterns.iterator.impl;

public class Musica {
	
	private String titulo;
	private String artista;
	
	public Musica(String titulo, String artista) {
		super();
		this.titulo = titulo;
		this.artista = artista;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getArtista() {
		return artista;
	}

	@Override
	public String toString() {
		return "{" + this.titulo +", "+ this.artista+"}";
	}
	
	

}
