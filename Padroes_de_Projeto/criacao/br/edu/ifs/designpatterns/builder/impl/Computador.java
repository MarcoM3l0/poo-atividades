package br.edu.ifs.designpatterns.builder.impl;

public class Computador {
	
	private String processador;
	private int ram;
	private int hd;
	
	public Computador(String processador, int ram, int hd) {
		super();
		this.processador = processador;
		this.ram = ram;
		this.hd = hd;
	}

	public String getProcessador() {
		return processador;
	}

	public int getRAM() {
		return ram;
	}

	public int getHD() {
		return hd;
	}

}
