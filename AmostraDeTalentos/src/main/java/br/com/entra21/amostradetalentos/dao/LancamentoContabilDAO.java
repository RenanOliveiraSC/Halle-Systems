package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.ContasAPagar;
import br.com.entra21.amostradetalentos.model.ContasAReceber;
import br.com.entra21.amostradetalentos.model.LancamentoContabil;

public class LancamentoContabilDAO {

	private final Connection con;

	public LancamentoContabilDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(LancamentoContabil lancamento) throws SQLException {
		String sql = "INSERT INTO LANCAMENTO_CONTABIL (LC_CODIGO, LC_DATA_LANCAMENTO, LC_OBSERVACAO, LC_CAP_CODIGO, LC_CAR_CODIGO) VALUES (SEQ_LC.NEXTVAL,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setDate(1, (Date) lancamento.getDataLancamento());
		statement.setString(2, lancamento.getObservacao());
		statement.setInt(3, lancamento.getContasAPagar().getCodigo());
		statement.setInt(4, lancamento.getContasAReceber().getCcodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean alterarObservacao(int id, String observacao) throws SQLException {
		String sql = "UPDATE LANCAMENTO_CONTABIL SET LC_OBSERVACAO = ? WHERE LC_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, observacao);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public List<LancamentoContabil> lista() throws SQLException {
		List<LancamentoContabil> lLancamentoContabil = new ArrayList<>();

		String sql = "select * from LANCAMENTO_CONTABIL LC ";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {

					int id = rs.getInt("LC_CODIGO");
					String observacao = rs.getString("LC_OBSERVACAO");
					Date dataLancamento = rs.getDate("LC_DATA_LANCAMENTO");

					ContasAReceber contasAReceber = new ContasAReceber();

					ContasAPagar contasAPagar = new ContasAPagar();

					LancamentoContabil lancamentoContabil = new LancamentoContabil(id, contasAReceber, contasAPagar,
							dataLancamento, observacao);

					lLancamentoContabil.add(lancamentoContabil);
				}
			}
		}

		return lLancamentoContabil;
	}
}
