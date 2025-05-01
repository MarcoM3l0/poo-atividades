package controller;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

import model.Emprestimo;
import model.Reserva;

public class RelatorioMensal {
	
	public static void gerarRelatorio(List<Emprestimo> emprestimos, List<Reserva> reservas, Month mes) {
		
		List<Emprestimo> emprestimoMes = emprestimos.stream()
				.filter(emprestimo -> emprestimo.getDataEmprestimo().getMonth() == mes)
				.collect(Collectors.toList());
		
		List<Reserva> reservaMes = reservas.stream()
				.filter(reserva -> reserva.getDataReseva().getMonth() == mes)
				.collect(Collectors.toList());
		
		long totalEmprestimos = emprestimoMes.size();
		long totalReservas = reservaMes.size();
		long reservasAtendidas = reservaMes.stream()
				.filter(r -> foiAtendida(r, emprestimos))
				.count();
		
		double percentualAtendidas = totalReservas > 0 ?
				(reservasAtendidas * 100.0) / totalReservas : 0;
		
		System.out.println("\n=== Relatório Mensal - " + mes + " ===");
        System.out.println("Total de empréstimos: " + totalEmprestimos);
        System.out.println("Total de reservas: " + totalReservas);
        System.out.printf("Reservas atendidas: %d (%.1f%%)%n", 
                          reservasAtendidas, percentualAtendidas);
		
	}

	private static boolean foiAtendida(Reserva reserva, List<Emprestimo> emprestimos) {
		
		return emprestimos.stream()
				.anyMatch(emprestimo -> emprestimo.getLivro().equals(reserva.getLivro()) &&
						emprestimo.getDataEmprestimo().isAfter(reserva.getDataReseva()));
		
	}

}
