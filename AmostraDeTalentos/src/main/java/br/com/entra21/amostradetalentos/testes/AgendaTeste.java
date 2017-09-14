package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Agenda;
import br.com.entra21.amostradetalentos.service.AgendaService;

public class AgendaTeste {
	
	public static void main(String[] args) throws SQLException {

		AgendaService agendaService = new AgendaService();
		
		List<Agenda> agendas = agendaService.listarAgenda();
		for (Agenda age : agendas) {
			System.out.println(age.toString());
		}
	}

}
