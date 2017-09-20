package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.dto.ContasAReceberDTO;
import br.com.entra21.amostradetalentos.model.Cliente;
import br.com.entra21.amostradetalentos.model.ContasAReceber;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;

public class ContasAReceberDAO {

	private final Connection con;

	public ContasAReceberDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(ContasAReceber aReceber) throws SQLException {
		String sql = "INSERT INTO Contas_a_Receber(CAR_CODIGO, CAR_CX_CODIGO, CAR_DATA_LANCAMENTO, CAR_DIAS_DE_ATRASO, CAR_SALDO, CAR_DECONTO, CAR_PAGAMENTO_TOTAL) VALUES (SEQ_Contas_a_Pagar.NEXTVAL, ?,?,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, aReceber.getCaixa().getCodigo());
		statement.setDate(2, (Date) aReceber.getDatalancamento());
		statement.setInt(3, aReceber.getDias_de_atraso());
		statement.setDouble(4, aReceber.getSaldo());
		statement.setDouble(5, aReceber.getDesconto());
		statement.setDouble(6, aReceber.getPagamento_total());
		return statement.executeUpdate() > 0;
	}

	public List<ContasAReceberDTO> listaContasAReceber() throws SQLException {
		List<ContasAReceberDTO> lContasAReceber = new ArrayList<>();

		String sql = "select * from CONTAS_A_RECEBER";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {

					Cliente cliente = new Cliente();

					FormaDePagamento formaDePagamento = new FormaDePagamento();

					int codigo = rs.getInt("CAR_CODIGO");
					int diasAtraso = rs.getInt("CAR_DIAS_ATRASO");
					double saldo = rs.getDouble("CAR_SALDO");
					double total = rs.getDouble("CAR_VALOR_TOTAL");
					Date dataLancamento = rs.getDate("CAR_DATA_LANCAMENTO");
					double pagamentoTotal = rs.getDouble("CAR_PAGAMENTO_TOTAL");
					double desconto = rs.getDouble("CAR_DESCONTO");

					lContasAReceber.add(new ContasAReceber().toDTO());
				}

				return lContasAReceber;
			}
		}

	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE CONTAS_A_RECEBER WHERE CR_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

}