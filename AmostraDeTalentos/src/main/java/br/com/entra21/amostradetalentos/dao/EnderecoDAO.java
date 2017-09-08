package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Endereco;
import br.com.entra21.amostradetalentos.model.Estado;
import br.com.entra21.amostradetalentos.model.Pais;
import br.com.entra21.amostradetalentos.model.Cidade;

public class EnderecoDAO {

	private final Connection con;

	public EnderecoDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Endereco endereco) throws SQLException {
		String sql = "INSERT INTO ENDERECO (END_CODIGO, END_TIPO_DE_LOUGRADOURO, END_RUA, END_RUA_NUMERO, END_COMPLEMENTO, END_CEP, END_BAIRRO, END_CID_CODIGO) VALUES (SEQ_ENDERECO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?);";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, endereco.getTipo_de_logradouro());
		statement.setString(2, endereco.getRua());
		statement.setInt(3, endereco.getRua_numero());
		statement.setString(4, endereco.getComplemento());
		statement.setString(5, endereco.getCep());
		statement.setString(6, endereco.getBairro());
		statement.setInt(7, endereco.getCidade().getCodigo());

		return statement.executeUpdate() > 0;
	}

	public boolean alterarBairro(int id, String bairro) throws SQLException {
		String sql = "UPDATE ENDERECO SET END_BAIRRO = ? WHERE END_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, bairro);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}

	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE ENDERECO WHERE END_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}

	public List<Endereco> lista() throws SQLException {
		List<Endereco> lEndereco = new ArrayList<>();

		String sql = "select * from ENDERECO E INNER JOIN CIDADE C ON E.END_CODIGO = C.CID_CODIGO "
				+ "INNER JOIN ESTADO ES ON ES.EST_CODIGO = C.CID_CODIGO "
				+ "INNER JOIN PAIS P ON ES.EST_PAIS_COD = P.PAIS_CODIGO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String nomePais = rs.getString("PAIS_NOME");

					String nomeEstado = rs.getString("EST_NOME");
					String sigla = rs.getString("EST_SIGLA");
					int codPais = rs.getInt("EST_PAIS_CODIGO");

					String nomeCid = rs.getString("CID_NOME");
					int codEstado = rs.getInt("CID_EST_CODIGO");

					int codigo = rs.getInt("END_CODIGO");
					String tipo_de_logradouro = rs.getString("END_TIPO_DE_LOUGRADOURO");
					String rua = rs.getString("END_RUA");
					int rua_numero = rs.getInt("END_RUA_NUMERO");
					String complemento = rs.getString("END_COMPLEMENTO");
					String cep = rs.getString("END_CEP");
					String bairro = rs.getString("END_BAIRRO");
					int codCidade = rs.getInt("END_CID_CODIGO");

					Pais pais = new Pais(codPais, nomePais);

					Estado estado = new Estado(codEstado, nomeEstado, sigla, pais);

					Cidade cidade = new Cidade(codCidade, nomeCid, estado);

					Endereco endereco = new Endereco(codigo, tipo_de_logradouro, rua, rua_numero, complemento, cep,
							bairro, cidade);
					lEndereco.add(endereco);
				}
			}
		}

		return lEndereco;

	}
}
