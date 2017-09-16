package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.AgendaDTO;
import br.com.entra21.amostradetalentos.service.AgendaService;

public class AgendaTeste {
	
	public static void main(String[] args) throws SQLException {

		AgendaService agendaService = new AgendaService();
		
		List<AgendaDTO> agendas = agendaService.listarAgenda();
		for (AgendaDTO age : agendas) {
			System.out.println(age.toString());
		}
	}

}
