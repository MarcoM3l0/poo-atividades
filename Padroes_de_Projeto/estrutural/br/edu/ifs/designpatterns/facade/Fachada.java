package br.edu.ifs.designpatterns.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifs.designpatterns.facade.impl.Cliente;
import br.edu.ifs.designpatterns.facade.impl.GeradorID;
import br.edu.ifs.designpatterns.facade.impl.Pedido;
import br.edu.ifs.designpatterns.facade.impl.Produto;
import br.edu.ifs.designpatterns.facade.impl.Repositorio;

public class Fachada {
	
	private Pedido pedido = new Pedido();

	private Repositorio<Cliente> reporCliente = new Repositorio<>();
	private Repositorio<Pedido> reporPedido = new Repositorio<>();
	private Repositorio<Produto> reporProduto = new Repositorio<>();
	
	private Map<String, List<Pedido>> historicoPedidos = new HashMap<>();

	public String registrarCliente(String nome) {
		
		String clienteId = "Cli" + GeradorID.gerarClienteID();
		
		Cliente cliente = new Cliente(clienteId, nome);
		reporCliente.criar(cliente.getId(), cliente);
		
		return cliente.getId();
	}
	
	public String registrarProduto(String nome, double preco) {
		
		String produtoId = "Pro" + GeradorID.gerarProdutoID();
		
		Produto produto = new Produto(produtoId, nome, preco);
		reporProduto.criar(produto.getId(), produto);
		
		pedido.adicionar(produto);
		
		return produto.getId();
	}
	
	public void escolherProduto(String idCliente, String idProd) {
		
		pedido = reporPedido.recuperar(idCliente);
		boolean novoPedido = false;
		
		if(pedido == null) {
			pedido = new Pedido();
			pedido.setId(idCliente);
			novoPedido = true;
		}
		
		Produto produto = reporProduto.recuperar(idProd);
		
		pedido.adicionar(produto);
		
		if(novoPedido) {
			reporPedido.criar(pedido.getId(), pedido);
		}else {
			reporPedido.atualizar(pedido.getId(), pedido);
		}
		
	}
	
	public String fecharCompra(String idCliente) {
		
		Pedido pedidoFechado = reporPedido.recuperar(idCliente);
		
		if (pedidoFechado != null) {
			
	        String novoPedidoId = "Ped" + GeradorID.gerarPedidoID();
	        pedidoFechado.setId(novoPedidoId);
	        
	        List<Pedido> listaCliente = historicoPedidos.getOrDefault(idCliente, new ArrayList<>());
	        listaCliente.add(pedidoFechado);
	        historicoPedidos.put(idCliente, listaCliente);
	        
	        reporPedido.remover(idCliente);
	        return novoPedidoId;
	        
		}else {
			return "";
		}
		
	}
	
	public List<String> listarPedidos(String idCliente) {
		/*Pedido pedidoCliente = reporPedido.recuperar(idCliente);
		
		if(pedidoCliente != null) {
			return pedidoCliente.mostrarPedido();
		}else {
			return new ArrayList<>();
		}*/
		
		 List<String> resultado = new ArrayList<>();
		 List<Pedido> pedidos = historicoPedidos.get(idCliente);
	    if (pedidos != null) {
	        for (Pedido p : pedidos) {
	            resultado.add(p.getId() + ": " + p.mostrarPedido().toString());
	        }
	    }
	    return resultado;
		
	}
	
	public List<String> listarPedidos() {
		
		return pedido.mostrarPedido();
		
	}

	public List<String> listarClientes() {
		
		List<Cliente> clientes = reporCliente.recuperar();
		List<String> resultadoString = new ArrayList<>();
		
		for(Cliente cliente :  clientes) {
			
			resultadoString.add(cliente.toString());
		}
		
		return resultadoString;
		
	}

	public Double obterTotal(String idCliente) {
		
		var valor = reporPedido.recuperar(idCliente);
		
		if(valor != null) {
			if(idCliente == "Cli0002")
				System.out.println("->");
			return valor.valorTotal();
		}else {
			return 0.0;
		}
		
	}

}
