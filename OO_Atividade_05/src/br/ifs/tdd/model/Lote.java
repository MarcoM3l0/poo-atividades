package br.ifs.tdd.model;

import java.time.LocalDate;

import br.ifs.tdd.exception.ValidacaoException;

public class Lote {
	
	private Produto produto;
    private int quantidade;
    private LocalDate dataValidade;
    
	public Lote(Produto produto, int quantidade, LocalDate dataValidade) {
		
		validarProduto(produto);
		validarQuantidade(quantidade);
		validarValidade(dataValidade);
		
		this.produto = produto;
		this.quantidade = quantidade;
		this.dataValidade = dataValidade;
	}

	private void validarProduto(Produto produto) {
		
		if(produto == null) {
			throw new ValidacaoException("Produto inválido");
		}
		
	}

	private void validarQuantidade(int quantidade) {
		
		if(quantidade < 0) {
			throw new ValidacaoException("Quantidade inválida (deve ser positiva)");
		}
		
	}

	private void validarValidade(LocalDate dataValidade) {
		
		if(dataValidade == null) {
			throw new ValidacaoException("Data de validade obrigatória");
		}
		if(dataValidade.isBefore(LocalDate.now())) {
            throw new ValidacaoException("Data de validade vencida");
        }
		
	}
	

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

}
