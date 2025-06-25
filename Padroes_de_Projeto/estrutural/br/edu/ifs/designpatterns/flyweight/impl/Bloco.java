package br.edu.ifs.designpatterns.flyweight.impl;

public class Bloco {
	
	private int x;
	private int y;
	private int z;
	private TipoBloco tipo;
	
	public Bloco(int x, int y, int z, TipoBloco tipo) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.tipo = tipo;
	}
	
	public String mostrar() {
		return this.toString();
	}

	public TipoBloco getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return tipo.mostrar() + ", x: " + x + ", y: " + y + ", z: " + z;
	}
	
	

}
