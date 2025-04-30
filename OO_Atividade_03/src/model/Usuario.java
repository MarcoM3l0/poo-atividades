package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private int id;
	private String name;
	private TipoUsuario tipo;
	private List<Emprestimo> emprestimoAtivos = new ArrayList<>();
	private List<Reseva> resevas = new ArrayList<>();
	
	//  Construtor
	public Usuario(int id, String name, TipoUsuario tipo) {
		this.id = id;
		this.name = name;
		this.tipo = tipo;
	}

	// Get Set
	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public list<Emprestimo> getEmprestimoAtivos() {
		return emprestimoAtivos;
	}

	public void setEmprestimoAtivos(list<Emprestimo> emprestimoAtivos) {
		this.emprestimoAtivos = emprestimoAtivos;
	}

	public list<Reseva> getResevas() {
		return resevas;
	}

	public void setResevas(list<Reseva> resevas) {
		this.resevas = resevas;
	}
	
	
}


enum TipoUsuario {
	ALUNO, PROFESSOR, BIBLIOTECARIO, ADMINISTRADOR
}
