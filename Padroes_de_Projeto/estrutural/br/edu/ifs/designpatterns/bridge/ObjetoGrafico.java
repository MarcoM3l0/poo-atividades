package br.edu.ifs.designpatterns.bridge;

import java.util.List;

import br.edu.ifs.designpatterns.bridge.obj.Ponto;

public abstract class ObjetoGrafico {
	
	private Ponto posicao;
	private Plataforma plataforma;

	public abstract double getVelocidade();
	public abstract double getImpulso();
	
	public ObjetoGrafico(Plataforma plataforma) {
		this.plataforma = plataforma;
		this.posicao = new Ponto(0, 0);
	}
	
	public List<Ponto> moverDireita(){
		
		Ponto inicio = getPosicao();
		Ponto fim = new Ponto((getPosicao().getX() + getVelocidade()), getPosicao().getY());
		
		List<Ponto> trajetoria = getPlataforma().animar(inicio, fim);
		this.posicao = trajetoria.get(trajetoria.size() - 1);
		return trajetoria;
	}
	
	public List<Ponto> moverEsquerda(){
		
		Ponto inicio = getPosicao();
		Ponto fim = new Ponto((getPosicao().getX() - getVelocidade()), getPosicao().getY());
		
		List<Ponto> trajetoria = getPlataforma().animar(inicio, fim);
		this.posicao = trajetoria.get(trajetoria.size() - 1);
		
		return trajetoria;
	}
	
	public List<Ponto> moverPular(){
		
		Ponto inicio = getPosicao();
		Ponto topo = new Ponto(getPosicao().getX(), (getPosicao().getY() + getImpulso()));

		List<Ponto> subida = getPlataforma().animar(inicio, topo);
		List<Ponto> decida = getPlataforma().animar(topo, inicio);
		
		subida.addAll(decida);
		
		return subida;
		
	}

	public Ponto getPosicao() {
		return posicao;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}
	
	

}
