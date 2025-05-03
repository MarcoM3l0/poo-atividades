package biblioteca;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Livro implements Comparable<Livro> {
	
	private String isbn;
	private String titulo;
	private LocalDate data;
	
	public Livro(String codigo, String titulo, LocalDate data) {
		this.isbn = codigo;
		this.titulo = titulo;
		this.data = data;
	}

	@Override
	public String toString() {
		return titulo + " (" + data.getYear() + ") " + "[" + isbn + "]"; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		Livro livro = (Livro) obj;
		return Objects.equals(isbn, livro.isbn);
	}

	@Override
	public int compareTo(Livro o) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(o.titulo);
	}
	
	public static Comparator<Livro> dataPublicacao() {
		
        return new Comparator<Livro>() {
            @Override
            public int compare(Livro livro1, Livro livro2) {
            	
                return livro1.data.compareTo(livro2.data);
            }
        };
    }

	
	
}
