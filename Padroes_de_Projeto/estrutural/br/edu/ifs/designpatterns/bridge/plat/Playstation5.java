package br.edu.ifs.designpatterns.bridge.plat;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.bridge.Plataforma;
import br.edu.ifs.designpatterns.bridge.obj.Ponto;

public class Playstation5 implements Plataforma{
	
	private int fps = 3;
	
	@Override
	public List<Ponto> animar(Ponto inicio, Ponto fim) {
		// TODO Auto-generated method stub
		
		List<Ponto> trajetoria = new ArrayList<>();
		
		double deltaX = fim.getX() - inicio.getX();
		double deltaY = fim.getY() - inicio.getY();
		
		for(int i = 0; i <= getFPS(); i++) {
			
			double progresso = (double) i / getFPS();
			double x = inicio.getX() + (deltaX * progresso);
			double y = inicio.getY() + (deltaY * progresso);
			trajetoria.add(new Ponto(x, y));
		}
		
		return trajetoria;
	}

	
	public int getFPS() {
		return fps;
	}

}
