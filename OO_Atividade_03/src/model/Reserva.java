package model;

import java.time.LocalDate;

public class Reserva {
	
	private int id;
	private Livro livro;
	private Usuario usuario;
	private LocalDate dataReseva;
	
	public Reserva(int id, Livro livro, Usuario usuario) {
		this.id = id;
		this.livro = livro;
		this.usuario = usuario;
		this.dataReseva = LocalDate.now(); // Data Atual
	}

	public int getId() {
		return id;
	}

	public Livro getLivro() {
		return livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public LocalDate getDataReseva() {
		return dataReseva;
	}

	
	
}
