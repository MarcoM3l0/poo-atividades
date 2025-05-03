package biblioteca;

import java.util.Comparator;

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
                return aluno1.nome.compareToIgnoreCase(aluno2.nome);
            }
        };
    }
		

	
}
