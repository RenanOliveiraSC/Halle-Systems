package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Estado;
import br.com.entra21.amostradetalentos.model.FormaDePagamento;
import br.com.entra21.amostradetalentos.model.Fornecedor;
import br.com.entra21.amostradetalentos.model.NotaDeCompra;
import br.com.entra21.amostradetalentos.model.Pais;
import br.com.entra21.amostradetalentos.model.Produto;

public class NotaDeCompraDAO {

	private final Connection con;

	public NotaDeCompraDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(NotaDeCompra notaDeCompra, Fornecedor fornecedor, Produto produto,
			FormaDePagamento formaPagamento) throws SQLException {
		String sql = "INSERT INTO NOTA_DE_COMPRA (NTC_CODIGO, NTC_FOR_CODIGO, NTC_PRO_CODIGO, NTC_QTDE, NTC_PRECO_PRODUTO, NTC_DESCONTO, NTC_VALOR_TOTAL, NTC_NUMERO_NOTA, NTC_DATA_LANCAMENTO, NTC_OBSERVACAO, NTC_ANEXO, NTC_FORMA_CODIGO) VALUES (SEQ_ESTADO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, notaDeCompra.getCodigo());
		statement.setInt(2, notaDeCompra.getFornecedor().getCodigo());
		statement.setInt(3, notaDeCompra.getProduto().getCodigo());
		statement.setDouble(4, notaDeCompra.getQuantidade_produto());
		statement.setDouble(5, notaDeCompra.getPrecoProduto());
		statement.setDouble(6, notaDeCompra.getDesconto());
		statement.setDouble(7, notaDeCompra.getPrecoProduto());
		statement.setDouble(8, notaDeCompra.getValorTotal());
		statement.setString(9, notaDeCompra.getNum_da_nota());
		statement.setDate(10, (Date) notaDeCompra.getData_lancamento());
		statement.setString(11, notaDeCompra.getObs());
		statement.setString(12, notaDeCompra.getAnexo());
		statement.setInt(13, notaDeCompra.getFormaDePagamento().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean alterarFornecedor(int id, String fornecedor) throws SQLException {
		String sql = "UPDATE NOTA_DE_COMPRA SET NTC_FOR_CODIGO = ? WHERE NTC_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, fornecedor);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean alterarObservacao(int id, String observacao) throws SQLException {
		String sql = "UPDATE NOTA_DE_COMPRA SET NTC_OBSERVACAO = ? WHERE NTC_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, observacao);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE NOTA_DE_COMPRA WHERE NTC_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<Estado> lista() throws SQLException {
		List<Estado> lEstados = new ArrayList<>();

		String sql = "select * from ESTADO E INNER JOIN PAIS P ON E.EST_PAIS_CODIGO = P.PAIS_CODIGO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String nomePais = rs.getString("PAIS_NOME");

					int idEst = rs.getInt("EST_CODIGO");
					String nomeEst = rs.getString("EST_NOME");
					String sigla = rs.getString("EST_SIGLA");
					int idPais = rs.getInt("EST_PAIS_CODIGO");

					Pais pais = new Pais(idPais, nomePais);

					Estado estado = new Estado(idEst, nomeEst, sigla, pais);
					lEstados.add(estado);
				}
			}
		}

		return lEstados;

	}

}
