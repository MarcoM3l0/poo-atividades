package controller;

import java.util.List;
import java.util.stream.Collectors;

import model.Livro;

public class BuscadorLivros {

	public static List<Livro> buscarPorTitulo(List<Livro> livros, String Titulo) {
		
		return livros.stream()
				.filter(livro -> livro.getName().equalsIgnoreCase(Titulo))
				.collect(Collectors.toList());
	}
	
	public static List<Livro> buscarPorAutor(List<Livro> livros, String Autor){
		
		return livros.stream()
				.filter(livro -> livro.getAutor().equalsIgnoreCase(Autor))
				.collect(Collectors.toList());
		
	}
	
	public static List<Livro> buscarPorCategoria(List<Livro> livros, String categoria){
		
		return livros.stream()
				.filter(livro -> livro.getCategoria().equalsIgnoreCase(categoria))
				.collect(Collectors.toList());
	}
	
}
