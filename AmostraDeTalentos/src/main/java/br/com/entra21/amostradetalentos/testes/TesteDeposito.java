package br.com.entra21.amostradetalentos.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Deposito;
import br.com.entra21.amostradetalentos.service.DepositoService;

public class TesteDeposito {

	public static void main(String[] args) throws SQLException{
		
		DepositoService depositoService = new DepositoService();
		
		List<Deposito> lDeposito = depositoService.listarDeposito();
		for (Deposito dep : lDeposito) {
			System.out.println(dep.getCodigo() + " " + dep.getNome());
		}
	}
}
