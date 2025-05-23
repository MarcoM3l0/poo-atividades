package br.ifs.grasp.model;

import java.util.Objects;

public class Usuario {
	
	private String nome;
	private String email;
	private String telefone;
	
	
	public Usuario(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hashCode(email);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Usuario usuario = (Usuario) obj;
		return Objects.equals(this.email, usuario.email);
	}
	
	

}
