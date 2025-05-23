package br.ifs.grasp.repository;

import java.util.HashMap;
import java.util.Map;

import br.ifs.grasp.model.Pedido;
import br.ifs.grasp.model.Usuario;

public class Repositorio implements IRepositorio {
	private Map<Usuario, Pedido> pedidos = new HashMap<>();

	public boolean salvarPedido(Pedido pedido){
		return pedidos.put(pedido.getSolicitante(), pedido) != null;
	}
	
}
