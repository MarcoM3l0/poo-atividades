package controller;

import java.time.LocalDate;
import java.util.UUID;

import model.Livro;
import model.Usuario;
import model.Emprestimo;

public class ServicoEmprestimo {
	
	public static void realizarEmprestimo(Usuario user, Livro livro, Usuario bibliotecario) {
		
		if(bibliotecario.getTipo() != Usuario.TipoUsuario.BIBLIOTECARIO) {
			throw new IllegalArgumentException("Apenas bibliotecários podem aprovar empréstimos.");
		}
		
		if(!user.podeRealizarEmprestimo() || !livro.isDisponivel()) {
			throw new IllegalStateException("Empréstimo não permitido.");
		}
		
		Emprestimo emprestimo =  new Emprestimo(gerarId(), livro, user, LocalDate.now());
		livro.setDisponivel(false);
		user.getEmprestimoAtivos().add(emprestimo);
		
	}
	
	public static int gerarId() {
		
		UUID uuid = UUID.randomUUID();
	    return (int) uuid.getMostSignificantBits();
		
	}

}
