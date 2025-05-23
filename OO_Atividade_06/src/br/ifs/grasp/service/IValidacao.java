package br.ifs.grasp.service;

import br.ifs.grasp.model.Produto;

public interface IValidacao {
	
	public void validarProduto(Produto produto);
	public void validarEstoque(Produto produto, int quantidade);

}
