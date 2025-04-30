package model;

import java.time.LocalDate;

public class Emprestimo {
	
	private int id;
	private Livro livro;
	private Usuario usuario;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private boolean renovado = false;
	
	// Construtor
	public Emprestimo(int id, Livro livro, Usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucao,
			boolean renovado) {
		this.id = id;
		this.livro = livro;
		this.usuario = usuario;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataEmprestimo.plusDays(7); // Prazo para devolução 7 dias corridos
	}

	
	// Get e Set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public boolean isRenovado() {
		return renovado;
	}

	public void setRenovado(boolean renovado) {
		this.renovado = renovado;
	}
	
	
	public boolean podeRenovar() {
		return !renovado;
	}
	
	public void renovar() {
		setRenovado(true);
		setDataDevolucao(dataDevolucao.plusDays(7));

	}
}
