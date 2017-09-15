package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.LancamentoContabilDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.LancamentoContabil;

public class LancamentoContabilService {
	
	public void inserir(LancamentoContabil lancamento)
			throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new LancamentoContabilDAO(con).inserir(lancamento);
		}
	}
	
	public void alterarObservacao(int id, String observacao) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new LancamentoContabilDAO(con).alterarObservacao(id, observacao);
		}
	}
	
	public List<LancamentoContabil> lista() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			return new LancamentoContabilDAO(con).lista();
		}
	}

}
