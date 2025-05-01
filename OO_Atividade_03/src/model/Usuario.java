package model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private int id;
	private String name;
	private TipoUsuario tipo;
	private List<Emprestimo> emprestimosAtivos = new ArrayList<>();
	private List<Reserva> resevas = new ArrayList<>();
	
	//  Construtor
	public Usuario(int id, String name, TipoUsuario tipo) {
		this.id = id;
		this.name = name;
		this.tipo = tipo;
	}

	public boolean podeRealizarEmprestimo() {
        return emprestimosAtivos.size() < 5;
    }

	// Get Set
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

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public List<Emprestimo> getEmprestimoAtivos() {
		return emprestimosAtivos;
	}

	public void setEmprestimoAtivos(List<Emprestimo> emprestimoAtivos) {
		this.emprestimosAtivos = emprestimoAtivos;
	}

	public List<Reserva> getResevas() {
		return resevas;
	}

	public void setResevas(List<Reserva> resevas) {
		this.resevas = resevas;
	}

	public enum TipoUsuario {
		ALUNO, PROFESSOR, BIBLIOTECARIO, ADMINISTRADOR
	}
}




