package br.edu.ifs.designpatterns.bridge;

import java.util.List;

import br.edu.ifs.designpatterns.bridge.obj.Ponto;

public interface Plataforma {
	
	public List<Ponto> animar(Ponto inicio, Ponto fim);

}
