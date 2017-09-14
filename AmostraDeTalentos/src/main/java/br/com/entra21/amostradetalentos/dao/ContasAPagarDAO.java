package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Agenda;
import br.com.entra21.amostradetalentos.model.ContasAPagar;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;
import br.com.entra21.amostradetalentos.model.Fornecedor;

public class ContasAPagarDAO {

	private final Connection con;

	public ContasAPagarDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(ContasAPagar aPagar, FormaDePagamento formadepagamento) throws SQLException {
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

	public List<ContasAPagar> listaContasAPagar() throws SQLException {
		List<ContasAPagar> lContasAPagar = new ArrayList<>();

		String sql = "select * from CONTAS_A_PAGAR";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {

					int codFornecedor = rs.getInt("CAP_FOR_CODIGO");

					Fornecedor fornecedor = new Fornecedor();

					int codFormaDePagamento = rs.getInt("CAP_FORMA_CODIGO");

					FormaDePagamento formaDePagamento = new FormaDePagamento();

					int codigo = rs.getInt("CAP_CODIGO");
					int diasAtraso = rs.getInt("CAP_DIAS_ATRASO");
					double saldo = rs.getDouble("CAP_SALDO");
					double total = rs.getDouble("CAP_VALOR_TOTAL");
					Date dataLancamento = rs.getDate("CAP_DATA_LANCAMENTO");
					double pagamentoTotal = rs.getDouble("CAP_PAGAMENTO_TOTAL");
					double desconto = rs.getDouble("CAP_DESCONTO");

					ContasAPagar contasAPagar = new ContasAPagar(codigo, fornecedor, formaDePagamento, dataLancamento,
							diasAtraso, total, saldo, desconto, pagamentoTotal);

					lContasAPagar.add(contasAPagar);
				}

				return lContasAPagar;
			}
		}

	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE CONTAS_A_PAGAR WHERE CP_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

}
