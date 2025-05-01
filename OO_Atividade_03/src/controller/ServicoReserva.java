package controller;

import java.util.UUID;

import model.Livro;
import model.Reserva;
import model.Usuario;

public class ServicoReserva {
	
	public static void realizarReserva(Usuario user, Livro livro) {
		
		if(!livro.isDisponivel()) {
			
			Reserva reseva = new Reserva(gerarId(), livro, user);
			user.getResevas().add(reseva);
			
		}
		
	}
	
	public static int gerarId() {
		
		UUID uuid = UUID.randomUUID();
	    return (int) uuid.getMostSignificantBits();
		
	}

}
