package br.ifs.tdd.service;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import br.ifs.tdd.exception.*;
import br.ifs.tdd.model.*;

public class Estoque {
	private Map<String, Produto> produtos = new HashMap<>();
    private Map<String, List<Lote>> lotes = new HashMap<>();
    
    private void validarIdProduto(String idProduto) {
    	
    	if(idProduto == null || idProduto.trim().isEmpty()) throw new ValidacaoException("Identificador de produto inválido");
    	if (!produtos.containsKey(idProduto)) throw new ProdutoNaoEncontradoException("Produto não cadastrado");
    }

    public void cadastrar(Produto produto) {
    	
        if (produto == null) throw new ValidacaoException("Produto inválido");
        
        String id = produto.getId();
        if (produtos.containsKey(id)) throw new ProdutoDuplicadoException("Produto com cadastro");
        
        produtos.put(id, produto);
        lotes.put(id, new ArrayList<>());
    }

    
    public void remover(String idProduto) {
    	
    	validarIdProduto(idProduto);
        
        List<Lote> lista = lotes.get(idProduto);
        if (!lista.isEmpty()) throw new OperacaoInvalidaException("Remova os lotes associados primeiro");
        
        produtos.remove(idProduto);
        lotes.remove(idProduto);
    }
    
    
    public Produto buscar(String idProduto) {
    	
    	if (idProduto == null || idProduto.trim().isEmpty()) throw new ValidacaoException("Identificador de produto inválido");
        
    	Produto p = produtos.get(idProduto);
        if(p == null) throw new ProdutoNaoEncontradoException("Produto não cadastrado");
        
        return p;
    }
    
    
    public void atualizar(Produto produto) {
    	
    	if(produto == null) throw new ValidacaoException("Produto inválido");
    	
    	String id = produto.getId();
    	if(!produtos.containsKey(id)) throw new ProdutoNaoEncontradoException("Produto não cadastrado");
    	
    	produtos.put(id, produto);
    }
    
    
    public void adicionar(String idProduto, int quantidade, LocalDate dataValidade) {
    	
    	validarIdProduto(idProduto);
    	if(quantidade < 0) throw new ValidacaoException("Quantidade inválida");
    	if(dataValidade == null) throw new ValidacaoException("Data de validade inválida");
    	if(dataValidade.isBefore(LocalDate.now())) throw new ValidacaoException("Data de validade vencida");
    	
    	Lote lote = new Lote(produtos.get(idProduto), quantidade, dataValidade);
    	lotes.get(idProduto).add(lote);
    	
    }
    
    public void retirar(String idProduto, int quantidade) {
    	
    	validarIdProduto(idProduto);
    	if (quantidade <= 0) throw new ValidacaoException("Quantidade inválida");
    	
    	List<Lote> lista = lotes.get(idProduto);
    	int total = lista.stream().mapToInt(Lote::getQuantidade).sum();
    	if(quantidade > total) throw new EstoqueInsuficienteException("Estoque insuficiente");
    	
    	lista.sort(Comparator.comparing(Lote::getDataValidade));
    	int restante = quantidade;
    	Iterator<Lote> it = lista.iterator();
    	
    	while(it.hasNext() && restante > 0) {
    		
    		Lote lote = it.next();
    		int qnt = lote.getQuantidade();
    		
    		if(qnt >= restante) {
    			restante -= qnt;
    			lote = new Lote(lote.getProduto(), 0, lote.getDataValidade());
    		}else {
    			lote = new Lote(lote.getProduto(), qnt - restante, lote.getDataValidade());
    			restante = 0;
    		}
    		
    		it.remove();
    		if(lote.getQuantidade() > 0) lista.add(lote);
    	}
    	
    	lotes.put(idProduto, lista);
    }
    
    
    public int obterQuantidade() {
    	return lotes.values().stream().flatMap(List::stream).mapToInt(Lote::getQuantidade).sum();
    }
    
    
    public int obterQuantidade(String idProduto) {
    	validarIdProduto(idProduto);
    	return lotes.get(idProduto).stream().mapToInt(Lote::getQuantidade).sum();
    }
    
    
    public String exibirRelatorio() {
    	
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %-20s %-30s %-10s %-10s %-12s%n",
            "ID", "Nome", "Descrição", "Preço", "Quantidade", "Validade"));
        
        for (String id : produtos.keySet()) {
            Produto p = produtos.get(id);
            for (Lote lote : lotes.get(id)) {
                sb.append(String.format("%-15s %-20s %-30s %-10.2f %-10d %-12s%n",
                    id, p.getNome(), p.getDescricao(), p.getPreco(), lote.getQuantidade(), lote.getDataValidade()));
            }
        }
        
        return sb.toString();
    }
    
    public String exibirRelatorioCSV() {
    	
        StringBuilder sb = new StringBuilder();
        sb.append("id,nome,descricao,preco,quantidade,validade\n");
        
        for (String id : produtos.keySet()) {
            Produto p = produtos.get(id);
            for (Lote lote : lotes.get(id)) {
                sb.append(String.format("%s,%s,%s,%.2f,%d,%s%n",
                    id, p.getNome(), p.getDescricao(), p.getPreco(), lote.getQuantidade(), lote.getDataValidade()));
            }
        }
        
        return sb.toString();
    }
    
    public String exibirRelatorioJSON() {
    	
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        List<String> produtosJson = produtos.keySet().stream().map(id -> {
        	
            Produto p = produtos.get(id);
            StringBuilder pJson = new StringBuilder();
            
            pJson.append("{\"id\":\"").append(id).append("\",");
            pJson.append("\"nome\":\"").append(p.getNome()).append("\",");
            pJson.append("\"descricao\":\"").append(p.getDescricao()).append("\",");
            pJson.append("\"preco\":").append(p.getPreco()).append(",");
            pJson.append("\"lotes\":[");
            
            List<String> lotesJson = lotes.get(id).stream().map(l ->
                String.format("{\"quantidade\":%d,\"validade\":\"%s\"}",
                    l.getQuantidade(), l.getDataValidade())
            ).collect(Collectors.toList());
            
            pJson.append(String.join(",", lotesJson));
            pJson.append("]}");
            
            return pJson.toString();
            
        }).collect(Collectors.toList());
        
        sb.append(String.join(",", produtosJson));
        sb.append("]");
        
        return sb.toString();
    }
    
}
