package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.AgendamentoMiniDTO;
import br.com.entra21.amostradetalentos.service.AgendamentoService;

public class AgendaTeste {
	
	public static void main(String[] args) throws SQLException {

		AgendamentoService agendaService = new AgendamentoService();
		
		List<AgendamentoMiniDTO> agendas = agendaService.listarAgenda();
		for (AgendamentoMiniDTO age : agendas) {
			System.out.println(age.toString());
		}
	}

}
