package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.ContasAReceberDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.ContasAReceber;

public class ContasAReceberService {
	
	public void inserir(ContasAReceber aReceber) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new ContasAReceberDAO(con).inserir(aReceber);
		}
	}

}
