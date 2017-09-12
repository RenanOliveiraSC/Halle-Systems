package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Estado;
import br.com.entra21.amostradetalentos.model.NotaDeCompra;
import br.com.entra21.amostradetalentos.model.Pais;

public class NotaDeCompraDAO {

	private final Connection con;

	public NotaDeCompraDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(NotaDeCompra notaDeCompra) throws SQLException {
		String sql = "INSERT INTO NOTA_DE_COMPRA (NTC_CODIGO, NTC_QTDE, NTC_PRECO_ITEM, NTC_VALOR_TOTAL, NTC_DATA_LANCAMENTO, NTC_OBSERVACAO, NTC_ANEXO, NTC_NUMERO_NOTA, NTC_DESCONTO, NTC_FOR_CODIGO, NTC_PRO_CODIGO, NTC_FORMA_CODIGO) VALUES (SEQ_ESTADO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, notaDeCompra.getCodigo());
		statement.setDouble(2, notaDeCompra.getQuantidade_item());
		statement.setDouble(3, notaDeCompra.getPrecoProduto());
		statement.setDouble(4, notaDeCompra.getTotal());
		statement.setDate(5, (Date)notaDeCompra.getData_lancamento());
		statement.setString(6, notaDeCompra.getObs());
		statement.setString(7, notaDeCompra.getAnexo());
		statement.setString(8, notaDeCompra.getNum_da_nota());
		
		
		
		return statement.executeUpdate() > 0;
	}

	public boolean alterar(int id, String nome) throws SQLException {
		String sql = "UPDATE ESTADO SET EST_NOME = ? WHERE EST_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE ESTADO WHERE EST_CODIGO = ?";

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
