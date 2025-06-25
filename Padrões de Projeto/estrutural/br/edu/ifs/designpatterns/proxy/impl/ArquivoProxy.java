package br.edu.ifs.designpatterns.proxy.impl;

import java.nio.file.Files;
import java.nio.file.Paths;

import br.edu.ifs.designpatterns.proxy.Arquivo;

public class ArquivoProxy implements Arquivo {
	
	private String nome;
	private ArquivoReal arquivo;
	private Permissao permisao;

	public ArquivoProxy(String nome, Permissao permisao) {
		this.nome = nome;
		this.permisao = permisao;
	}

	@Override
	public void criar() {
		if(!this.permisao.podeEscrever())
			throw new IllegalStateException("Acesso negado!");
		
		if(Files.exists(Paths.get(this.nome)))
			return;
		
		this.arquivo = new ArquivoReal(this.nome);
		this.arquivo.criar();
	}

	@Override
	public String recuperar() {
		
		if(!this.permisao.podeLer()) 
			throw new IllegalStateException("Acesso negado!");
		
		return this.arquivo.recuperar();
	}

	@Override
	public void escrever(String string) {
		if(!this.permisao.podeEscrever()) 
			throw new IllegalStateException("Acesso negado!");
		
		this.arquivo.escrever(string);
	}

	@Override
	public void remover() {
		if(!this.permisao.podeEscrever()) 
			throw new IllegalStateException("Acesso negado!");
		
		this.arquivo.remover();
		
	}

}
