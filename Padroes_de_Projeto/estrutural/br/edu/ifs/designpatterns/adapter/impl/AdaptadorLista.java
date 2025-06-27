package br.edu.ifs.designpatterns.adapter.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifs.designpatterns.adapter.Repositorio;
import br.edu.ifs.designpatterns.adapter.RepositorioLista;

public class AdaptadorLista implements Repositorio{
	
	private RepositorioLista repositorio;

	public AdaptadorLista(RepositorioLista repositorioLista) {
		this.repositorio = repositorioLista;
	}

	public Map<String, String> obterAlunos() {
		// TODO Auto-generated method stub
		List<String> linhas = this.repositorio.recuperarDados();
		Map<String, String> alunos = new HashMap<>();
		
		for(String linha : linhas) {
			
			String[] partes = linha.split("\\s", 2);
			
			String matricula = partes[0];
			String nome = partes[1];
			
			alunos.put(matricula, nome);
			
		}
		
		return alunos;
	}

}
