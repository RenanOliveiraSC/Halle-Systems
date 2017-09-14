package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.model.ContasAPagar;
import br.com.entra21.amostradetalentos.service.ContasAPagarService;

public class TesteContasAPagar {

	public static void main(String[] args) throws SQLException {

		ContasAPagarService contasAPagarService = new ContasAPagarService();
		
		List<ContasAPagar> lContasAPagar = contasAPagarService.listarContasAPagar();
		for (ContasAPagar cont : lContasAPagar) {
			System.out.println(cont.toString());
		}
	}
}
