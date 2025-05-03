package biblioteca;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import exception.EmprestimosExcedidoException;
import exception.LivroInvalidoException;
import exception.LivroJaEmprestadoException;
import exception.LivroNaoEmPosseException;

public class Aluno implements Comparable<Aluno> {

	private String matricula;
	private String nome;
	private Set<Livro> emprestimos = new HashSet<>();
	
	public Aluno(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}

	
	@Override
	public String toString() {
		return nome + " (" + matricula + ")";
	}


	// Implementação do Comparable
	@Override
	public int compareTo(Aluno o) {
		// TODO Auto-generated method stub
		return this.matricula.compareTo(o.matricula);
	}
	
	public static Comparator<Aluno> comparadorNome() {
		
        return new Comparator<Aluno>() {
            @Override
            public int compare(Aluno aluno1, Aluno aluno2) {
            	
            	int compareMatricula = aluno1.matricula.compareTo(aluno2.matricula);
            	
            	if(compareMatricula == 0) {
            		return 0; // Matrículas iguais
            	}
            	
                return aluno1.nome.compareToIgnoreCase(aluno2.nome);
            }
        };
    }


	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Aluno aluno = (Aluno) obj;
		return Objects.equals(matricula, aluno.matricula);
	}
		
	
	public void emprestar(Livro livro) throws EmprestimosExcedidoException, LivroJaEmprestadoException, LivroInvalidoException {
	    if (livro == null) {
	        throw new LivroInvalidoException("Livro não pode ser nulo!");
	    }
	    if (emprestimos.contains(livro)) {
	        throw new LivroJaEmprestadoException(livro + " já está emprestado!");
	    }
	    if (emprestimos.size() >= 3) {
	        throw new EmprestimosExcedidoException("Limite de 3 empréstimos atingido!");
	    }
	    emprestimos.add(livro);
	}

	public void renovar(Livro livro) throws LivroNaoEmPosseException, LivroInvalidoException {
	    if (livro == null) {
	        throw new LivroInvalidoException("Livro não pode ser nulo!");
	    }
	    if (!emprestimos.contains(livro)) {
	        throw new LivroNaoEmPosseException(livro + " não pode ser renovado porque não está sob sua posse!");
	    }
	}

	public void devolver(Livro livro) throws LivroNaoEmPosseException, LivroInvalidoException {
	    if (livro == null) {
	        throw new LivroInvalidoException("Livro não pode ser nulo!");
	    }
	    if (!emprestimos.contains(livro)) {
	        throw new LivroNaoEmPosseException(livro + " não pode ser devolvido porque não está sob sua posse!");
	    }
	    emprestimos.remove(livro);
	}
}