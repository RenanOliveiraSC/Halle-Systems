package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.Contas_a_Pagar;
import br.com.entra21.amostradetalentos.model.Contas_a_Receber;
import br.com.entra21.amostradetalentos.model.LancamentoContabilLinhas;

public class LancamentoContabilLinhasDAO {

	private final Connection con;

	public LancamentoContabilLinhasDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(LancamentoContabilLinhas lancamentoLinha, Contas_a_Pagar contaApagar,
			Contas_a_Receber contasAreceber) throws SQLException {
		String sql = "INSERT INTO LANCAMENTO_CONTABIL_LINHAS (LCL_CODIGO, LCL_DEBITO, LCL_CREDITO,LCL_DATA_LANCAMENTO, LCL_DATA_VENCIMENTO, LCL_OBSERVACAO, LCL_LC_CODIGO, LCL_CONTA_CODIGO) VALUES (SEQ_LC.NEXTVAL,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setDouble(1, lancamentoLinha.getDebito());
		statement.setDouble(2, lancamentoLinha.getCredito());
		statement.setDate(3, (Date) lancamentoLinha.getData_lancamento());
		statement.setDate(4, (Date) lancamentoLinha.getDataVencimento());
		statement.setString(5, lancamentoLinha.getObservacao());
		statement.setInt(6, lancamentoLinha.getLc_codigo());
		statement.setString(7, lancamentoLinha.getCod_conta());

		return statement.executeUpdate() > 0;
	}

	public boolean alterarObservacao(int id, String observacao) throws SQLException {
		String sql = "UPDATE LANCAMENTO_CONTABIL_LINHAS SET LCL_OBSERVACAO = ? WHERE LCL_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, observacao);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarDataVencimento(int id, Date dataVencimento) throws SQLException {
		String sql = "UPDATE LANCAMENTO_CONTABIL_LINHAS SET LCL_DATA_VENCIMENTO = ? WHERE LCL_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setDate(1, dataVencimento);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
}
