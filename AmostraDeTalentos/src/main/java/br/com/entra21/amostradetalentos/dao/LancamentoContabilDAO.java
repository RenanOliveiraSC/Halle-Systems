package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Familia;
import br.com.entra21.amostradetalentos.model.LancamentoContabil;

public class LancamentoContabilDAO {
	
	private final Connection con;
	
	public LancamentoContabilDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(LancamentoContabil lancamentoContabil) throws SQLException {
		String sql = "INSERT INTO LANCAMENTO_CONTABIL (LC_CODIGO, LC_DATA_LANCAMENTO, LC_OBSERVACAO, LC_CAP_CODIGO, LC_CAR_CODIGO) VALUES"
				+ "(SEQ_LC.NEXTVAL, ?, ?, ?, ?);";
		
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setDate(1, new Date(lancamentoContabil.getDataLancamento().getTime()));
		statement.setString(2, lancamentoContabil.getObservacao());
		statement.setInt(3, lancamentoContabil.getContasAPagar().getCodigo());
		statement.setInt(4, lancamentoContabil.getContasAReceber().getCcodigo());
		
		return statement.executeUpdate() > 0;
	}
	
	/*public List<LancamentoContabil> lista() throws SQLException  {
		List<LancamentoContabil> lLancamentoContabil = new ArrayList<>();
		
		String sql = "select * from LANCAMENTO_CONTABIL LC INNER JOIN CONTAS_A_PAGAR CP ON CP.CAP_CODIGO = LC.LC_CAP_CODIGO"
				+ "INNER JOIN CONTAS_RECEBER CR ON CR.CAR_CODIGO = LC.LC_CAR_CODIGO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("LC_CODIGO");
					String observacao = rs.getString("LC_OBSERVACAO");
					Date dataLancamento = rs.getDate("LC_DATA_LANCAMENTO");
					LancamentoContabil lancamentoContabil = new LancamentoContabil(codigo, contasAReceber, contasAPagar, dataLancamento, observacao);
					lLancamentoContabil.add(lancamentoContabil);
				}
			}
		}

		return lLancamentoContabil;
	}*/
	
}
