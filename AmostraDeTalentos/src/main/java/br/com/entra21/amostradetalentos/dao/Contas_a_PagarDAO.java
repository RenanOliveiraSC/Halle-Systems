package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.Contas_a_Pagar;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;

public class Contas_a_PagarDAO {

	private final Connection con;

	public Contas_a_PagarDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Contas_a_Pagar aPagar, FormaDePagamento formadepagamento) throws SQLException {
		String sql = "INSERT INTO Contas_a_Pagar(CAP_CODIGO, CAP_COD_FORNECEDOR, CAP_COD_TIPO_PAGAMENTO, CAP_DATA_LANCAMENTO, CAP_DIAS_DE_ATRASO, CAP_TOTAL, CAP_SALDO, CAP_DESCONTO, CAP_PAGAMENTO_TOTAL) VALUES (SEQ_Contas_a_Pagar.NEXTVAL, ?,?,?,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, aPagar.getFornecedor().getCodigo());
		statement.setInt(2, aPagar.getForneceFormaDePagamentodor().getCodigo());
		statement.setDate(3, (Date) aPagar.getDataLancamento());
		statement.setInt(4, aPagar.getDiasAtraso());
		statement.setDouble(5, aPagar.getTotal());
		statement.setDouble(6, aPagar.getSaldo());
		statement.setDouble(7, aPagar.getDesconto());
		statement.setDouble(8, aPagar.getPagamentoTotal());
		return statement.executeUpdate() > 0;
	}

}
