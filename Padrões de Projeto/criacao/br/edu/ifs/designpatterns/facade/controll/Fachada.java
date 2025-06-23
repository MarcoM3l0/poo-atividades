package br.edu.ifs.designpatterns.facade.controll;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifs.designpatterns.facade.impl.Cliente;
import br.edu.ifs.designpatterns.facade.impl.GeradorID;
import br.edu.ifs.designpatterns.facade.impl.Pedido;
import br.edu.ifs.designpatterns.facade.impl.Repositorio;

public class Fachada {

	private Repositorio<Cliente> repor = new Repositorio();

	public String registrarCliente(String nome) {
		
		String id = GeradorID.gerarClienteID();
		var cliente = new Cliente(id, nome);
		repor.criar(id, cliente);
		
		return id;
	}
	
	public String registrarProduto(String string, double d) {
		return null;
	}
	
	public void escolherProduto() {
	}
	
	public void fecharCompra() {
	}
	
	public List<Pedido> listarPedidos() {
		return new ArrayList<>(Pedidos);
	}

	public List<Cliente> listarClientes() {
		
		
		return repor.recuperar();
	}

}
