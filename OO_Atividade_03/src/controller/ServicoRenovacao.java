package controller;

import java.util.ArrayList;
import java.util.List;

import model.Emprestimo;
import model.Livro;
import model.Reserva;

public class ServicoRenovacao {
	
	private static List<Reserva> todasReservas = new ArrayList<>();

	public static void renovarEmprestimo(Emprestimo emprestimo){
		
		if(emprestimo.podeRenovar() && !livroTemReserva(emprestimo.getLivro())) {
			emprestimo.renovar();
		}
		
	}
	
	private static boolean livroTemReserva(Livro livro) {
       return todasReservas.stream()
    		   .anyMatch(reserva -> 
    		   		reserva.getLivro().equals(livro) &&
    		   		!reserva.getLivro().isDisponivel()
    		   );
    }
	
}
