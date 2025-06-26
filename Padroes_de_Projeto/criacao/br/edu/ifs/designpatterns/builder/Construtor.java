package br.edu.ifs.designpatterns.builder;

import br.edu.ifs.designpatterns.builder.impl.Computador;

public interface Construtor {
	
	public Computador obterResultado();
	public void definirProcessador(String processador);
	public void definirRAM(int memoriaRam);
	public void definirArmazenamento(int memoriaRom);

}
