package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.dao.LancamentoContabilLinhasDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.ContasAPagar;
import br.com.entra21.amostradetalentos.model.ContasAReceber;
import br.com.entra21.amostradetalentos.model.LancamentoContabilLinhas;

public class LancamentoContabilLinhasService {
	
	public void inserir(LancamentoContabilLinhas lancamentoLinha, ContasAPagar contaApagar,
			ContasAReceber contasAreceber) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new LancamentoContabilLinhasDAO(con).inserir(lancamentoLinha, contaApagar, contasAreceber);
		}
	}
	
	public void alterarObservacao(int id, String observacao) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new LancamentoContabilLinhasDAO(con).alterarObservacao(id, observacao);
		}
	}
	
	public void alterarDataVencimento(int id, Date dataVencimento) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new LancamentoContabilLinhasDAO(con).alterarDataVencimento(id, dataVencimento);
		}
	}

}
