package br.edu.ifs.designpatterns.mediator.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.ifs.designpatterns.mediator.Colaborador;
import br.edu.ifs.designpatterns.mediator.Mediador;

public class ControladorTrafego implements Mediador {

	private List<Aeronave> pousos = new ArrayList<>();
	private List<Aeronave> decolagens = new ArrayList<>();
	private Metereologia metereologia;
	private Oficina oficina;
	
	@Override
	public String notificar(Colaborador colaborador, String mensagem) {
		// TODO Auto-generated method stub
		
		switch(mensagem) {
			case "Metereologia": {
				this.metereologia = (Metereologia) colaborador;
				return null;
			}
			case "Oficina": {
				this.oficina = (Oficina) colaborador;
				return null;
			}
		}
		
		 if (colaborador instanceof Aeronave) {
			 Aeronave aeronave = (Aeronave) colaborador;
			 return solicitacaoAeronave(aeronave, mensagem);
		}
		 
		if(colaborador instanceof Metereologia && mensagem.equals("condicoesFavoraveis"))
			return filasDeEspera();
		
		return "";
	}

	private String filasDeEspera() {
		// TODO Auto-generated method stub
		
		String pousosTotal = pousos.stream().map(a -> a.getId() + ": Pouso autorizado.").collect(Collectors.joining(", "));
		
		String decolagensTotal = decolagens.stream()
				.map(a -> {
					if(this.oficina.necessitaManutencao(a)) {
						return a.getId() + 	": Decolagem negada - manutenção.";
					}else {
						return a.getId() + ": Decolagem autorizada.";
					}
				}).collect(Collectors.joining(", "));
		
		pousos.clear();
		decolagens.clear();
		
		return String.format("[%s]\n[%s]", pousosTotal, decolagensTotal);
	}

	private String solicitacaoAeronave(Aeronave aeronave, String mensagem) {
		// TODO Auto-generated method stub
		
		if(!this.metereologia.isCondicoesFavoraveis()) {
			if(mensagem.equals("pouso")) {
				pousos.add(aeronave);
				return aeronave.getId() + ": Pouso negado - condições metereológicas.";
			}else {
				decolagens.add(aeronave);
				return aeronave.getId() + ": Decolagem negada - condições metereológicas.";
			}
		}
		
		if(mensagem.equals("decolagem")) {
			if(this.oficina.necessitaManutencao(aeronave))
				return aeronave.getId() + ": Decolagem negada - manutenção.";
			
			return aeronave.getId() + ": Decolagem autorizada.";
		}
		
		if(mensagem.equals("pouso"))
			return aeronave.getId() + ": Pouso autorizado.";
		
		return "";
	}

}
