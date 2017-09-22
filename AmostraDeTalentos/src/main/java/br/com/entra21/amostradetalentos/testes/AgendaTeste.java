package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.AgendamentoDTO;
import br.com.entra21.amostradetalentos.service.AgendamentoService;

public class AgendaTeste {
	
	public static void main(String[] args) throws SQLException {

		AgendamentoService agendaService = new AgendamentoService();
		
		List<AgendamentoDTO> agendas = agendaService.listarAgenda();
		for (AgendamentoDTO age : agendas) {
			System.out.println(age.toString());
		}
	}

}
