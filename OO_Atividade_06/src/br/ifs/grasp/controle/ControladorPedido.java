package br.ifs.grasp.controle;

import br.ifs.grasp.model.*;
import br.ifs.grasp.repository.Repositorio;
import br.ifs.grasp.service.*;

public class ControladorPedido {
	
	private Pedido pedido;
	private ServicoPagamento servicoPagamento = new ServicoPagamento();
    private Repositorio repositorio = new Repositorio();
    private ServicoRelatorio servicoRelatorio = new ServicoRelatorio();
    private ServicoNotificacao servicoNotificacao = new ServicoNotificacao();
    private ServicoValidacao servicoValidacao = new ServicoValidacao(); 

	public boolean iniciarPeidio(Usuario solicitante) {
		
		this.pedido = new Pedido(solicitante);
		
		return (pedido != null);
		
	}
	
	public boolean adicionarItem(Produto produto, int quantidade)  {
		
		try{
			
			servicoValidacao.validarProduto(produto);
			servicoValidacao.validarEstoque(produto, quantidade);
			
		} catch(Exception e) {
			e.getMessage();
		}
		
		boolean confirmacao = pedido.adicionarItem(produto, quantidade);
		
		return confirmacao;
	}
	
	public double calcularTotal(IEstrategiaDesconto desconto) {
		return pedido.calcularTotal(desconto);
	}
	
	public boolean finalizarPedido(Usuario solicitante) {
		
		IEstrategiaDesconto estrategiaDesconto = new DescontoBlackFriday();
		
		double total = calcularTotal(estrategiaDesconto);
		
		if(!servicoPagamento.processarPagamento(total)) return false;
		if(!repositorio.salvarPedido(pedido)) return false;
		
		Relatorio relatorioPedido = servicoRelatorio.gerarRelatorio(pedido);
		return servicoNotificacao.enviarNotificacao(relatorioPedido);
		
	}

}
