package br.edu.ifs.designpatterns.builder.impl;

import br.edu.ifs.designpatterns.builder.Construtor;

public class ConstrutorComputador implements Construtor{
	
	private String processador;
	private int ram;
	private int hd;
	
	@Override
	public Computador obterResultado() {
		// TODO Auto-generated method stub
		return new Computador(this.processador, this.ram, this.hd);
	}
	
	@Override
	public void definirProcessador(String processador) {
		// TODO Auto-generated method stub
		this.processador = processador;
	}
	
	@Override
	public void definirRAM(int memoriaRam) {
		// TODO Auto-generated method stub
		this.ram = memoriaRam;
	}
	
	@Override
	public void definirArmazenamento(int memoriaRom) {
		// TODO Auto-generated method stub
		this.hd = memoriaRom;
	}

}
