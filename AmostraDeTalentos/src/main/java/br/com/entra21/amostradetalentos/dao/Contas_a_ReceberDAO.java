package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.Caixa;
import br.com.entra21.amostradetalentos.model.Contas_a_Receber;

public class Contas_a_ReceberDAO {

	private final Connection con;

	public Contas_a_ReceberDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Contas_a_Receber aReceber, Caixa caixa) throws SQLException {
		String sql = "INSERT INTO Contas_a_Pagar(CAR_CODIGO, CAR_CX_CODIGO, CAR_DATA_LANCAMENTO, CAR_DIAS_DE_ATRASO, CAR_SALDO, CAR_DECONTO, CAR_PAGAMENTO_TOTAL) VALUES (SEQ_Contas_a_Pagar.NEXTVAL, ?,?,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, aReceber.getCaixa().getCodigo());
		statement.setDate(2, (Date) aReceber.getDatalancamento());
		statement.setInt(3, aReceber.getDias_de_atraso());
		statement.setDouble(4, aReceber.getSaldo());
		statement.setDouble(5, aReceber.getDesconto());
		statement.setDouble(6, aReceber.getPagamento_total());
		return statement.executeUpdate() > 0;

	}
}
