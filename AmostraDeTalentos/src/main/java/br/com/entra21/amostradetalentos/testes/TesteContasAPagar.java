package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.ContasAPagarDTO;
import br.com.entra21.amostradetalentos.service.ContasAPagarService;

public class TesteContasAPagar {

	public static void main(String[] args) throws SQLException {

		ContasAPagarService contasAPagarService = new ContasAPagarService();
		
		List<ContasAPagarDTO> lContasAPagar = contasAPagarService.listarContasAPagar();
		for (ContasAPagarDTO cont : lContasAPagar) {
			System.out.println(cont.getCodigo() + " "+ cont.getDiasAtraso() + " " + cont.getDataLancamento() + " " + cont.getFornecedor().getCodigo());
		}
	}
}
