package br.edu.ifs.designpatterns.adapter.impl;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifs.designpatterns.adapter.Repositorio;
import br.edu.ifs.designpatterns.adapter.RepositorioString;

public class AdaptadorString implements Repositorio{

	private RepositorioString repositorio;

	public AdaptadorString(RepositorioString repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Map<String, String> obterAlunos() {
		// TODO Auto-generated method stub
		
		Map<String, String> alunos = new HashMap<>();
		String dados = this.repositorio.recuperarDados();
		
		for(String dado : dados.split(";")) {
			
			String[] partes = dado.split("\\s", 2);
			String matricula = partes[0];
			String nome = partes[1];
			
			alunos.put(matricula, nome);
		}
		
		return alunos;
	}
	
	
	
}
