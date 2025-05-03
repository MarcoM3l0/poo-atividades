package biblioteca;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

	private String matricula;
	private String nome;
	
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
		
	
	
}
