package br.edu.ifs.designpatterns.visitor;

import br.edu.ifs.designpatterns.visitor.impl.Alimento;
import br.edu.ifs.designpatterns.visitor.impl.Cerveja;
import br.edu.ifs.designpatterns.visitor.impl.Cigarro;
import br.edu.ifs.designpatterns.visitor.impl.Vinho;

public interface Taxador {

	public double visitar(Alimento alimento);
	public double visitar(Cerveja cerveja);
	public double visitar(Cigarro cigarro);
	public double visitar(Vinho vinho);

}
