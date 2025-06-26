package br.edu.ifs.designpatterns.prototype.impl;

import java.util.Objects;

import br.edu.ifs.designpatterns.prototype.Robo;

public class RoboTanque implements Robo{
	
	private int forca;
	private int velocidade;
	private String armamento;
	
	public RoboTanque(int forca, int velocidade, String armamento) {
		this.forca = forca;
		this.velocidade = velocidade;
		this.armamento = armamento;
	}


	@Override
	public Robo clonar() {
		// TODO Auto-generated method stub
		return new RoboTanque(this.forca, this.velocidade, this.armamento);
	}


	@Override
	public int hashCode() {
		return Objects.hash(forca, velocidade, armamento);
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass()) return false;
        RoboTanque that = (RoboTanque) obj;
        return forca == that.forca && velocidade == that.velocidade && Objects.equals(armamento, that.armamento);
	}


	public int getForca() {
		return forca;
	}


	public void setForca(int forca) {
		this.forca = forca;
	}


	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}


	public String getArmamento() {
		return armamento;
	}


	public void setArmamento(String armamento) {
		this.armamento = armamento;
	}
	
}
