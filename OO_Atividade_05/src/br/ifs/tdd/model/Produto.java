package br.ifs.tdd.model;

import java.util.Objects;

import br.ifs.tdd.exception.ValidacaoException;

public class Produto {
	
	private  String id;
    private String nome;
    private String descricao;
    private double preco;
    
    
	public Produto(String id, String nome, String descricao, double preco) {
		
		validarIdentificador(id);
        validarNome(nome);
        validarDescricao(descricao);
        validarPreco(preco);
		
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}


	private void validarPreco(double preco) {
		
		if(preco < 0) {
			throw new ValidacaoException("Preço inválido (deve ser positivo)");
		}
		
	}


	private void validarDescricao(String descricao) {

		if(descricao == null || descricao.trim().isEmpty()) {
			throw new ValidacaoException("Descrição obrigatória");
		}
		if(descricao.length() > 500) {
			throw new ValidacaoException("Descrição excede 500 caracteres");
		}
		
	}


	private void validarNome(String nome) {
		
		if( nome == null || nome.trim().isEmpty()) {
			throw new ValidacaoException("Nome obrigatório");
		}
		if(nome.length() > 100) {
			throw new ValidacaoException("Nome excede 100 caracteres");
		}
		
	}


	private void validarIdentificador(String id) {


		if (id == null || id.trim().isEmpty()) {
			throw new ValidacaoException("Identificador obrigatório");
		}
		if (id.length() != 13) {
			throw new ValidacaoException("Tamanho do identificador inválido (13 caracteres)");
		}
		if(!id.matches("\\d{13}")) {
			throw new ValidacaoException("Formato do identificador inválido (apenas números)");
		}
		
	}


	public String getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public double getPreco() {
		return preco;
	}

	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Produto produto = (Produto) o;
	        return Double.compare(produto.preco, preco) == 0 &&
	                Objects.equals(id, produto.id) &&
	                Objects.equals(nome, produto.nome) &&
	                Objects.equals(descricao, produto.descricao);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id, nome, descricao, preco);
	    }

}
