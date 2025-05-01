package controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Emprestimo;

public class ServicoDevolucao {
	
	public static double calcularMulta(Emprestimo emprestimo) {
		
		long diaAtraso = ChronoUnit.DAYS.between(emprestimo.getDataDevolucao(), LocalDate.now());
		return Math.max(0, diaAtraso) * 2.0;
		
	}
	
	public static void devolverLivro(Emprestimo emprestimo) {
		
		emprestimo.getLivro().setDisponivel(true);
		emprestimo.getUsuario().getEmprestimoAtivos().remove(emprestimo);
		
	}
	
}
