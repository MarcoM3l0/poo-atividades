package model;

public class Livro {
	
	private int id;
	private String name;
	private String autor;
	private String categoria;
	private boolean disponivel = true;
	
	// Construtor
	public Livro(int id, String name, String autor, String categoria, boolean disponivel) {
		this.id = id;
		this.name = name;
		this.autor = autor;
		this.categoria = categoria;
		this.disponivel = disponivel;
	}

	// Get e Set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	

}
