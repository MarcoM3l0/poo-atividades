package br.edu.ifs.designpatterns.bridge.obj;

import java.util.List;

import br.edu.ifs.designpatterns.bridge.ObjetoGrafico;
import br.edu.ifs.designpatterns.bridge.Plataforma;

public class HollowKnight extends ObjetoGrafico {
	
	private double impulso;
	private double velocidade;

	public HollowKnight(Plataforma plataforma) {
		super(plataforma);
		// TODO Auto-generated constructor stub
		this.impulso = 15;
		this.velocidade = 15;
	}

	public List<Ponto> andar(boolean andar) {
		// TODO Auto-generated method stub
		
		 if(andar) {
			 return super.moverDireita();
		 }else {
			 return super.moverEsquerda();
		 }
		
	}

	public List<Ponto> correr(boolean correr) {
		// TODO Auto-generated method stub
		double velocidadeOriginal = this.velocidade;
	    this.velocidade *= 2; 
	    
	    try {
	    	
	        if(correr) {
	        	return super.moverDireita();
	        } else {
	        	return super.moverEsquerda();
	        }
	        
	    } finally {
	        this.velocidade = velocidadeOriginal; 
	    }
	}
	
	public List<Ponto> pular() {
		// TODO Auto-generated method stub
		
		return super.moverPular();
	}
	
	public double getImpulso() {
		return impulso;
	}

	public double getVelocidade() {
		return velocidade;
	}

}
