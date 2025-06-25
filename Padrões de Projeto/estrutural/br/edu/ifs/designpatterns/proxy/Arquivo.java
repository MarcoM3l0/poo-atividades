package br.edu.ifs.designpatterns.proxy;

public interface Arquivo {
	
	public void criar();
	public String recuperar();
	public void escrever(String string);
	public void remover();
	
}
