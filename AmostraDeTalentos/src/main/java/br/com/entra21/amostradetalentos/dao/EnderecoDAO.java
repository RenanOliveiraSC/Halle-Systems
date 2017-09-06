package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.Endereco;

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

		String sql = "select * from ENDERECO";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("END_CODIGO");
					String tipo_de_logradouro = rs.getString("END_TIPO_DE_LOUGRADOURO");
					String rua = rs.getString("END_RUA");
					int rua_numero = rs.getInt("END_RUA_NUMERO");
					String complemento = rs.getString("END_COMPLEMENTO");
					String cep = rs.getString("END_CEP");
					String bairro = rs.getString("END_BAIRRO");
					
					Endereco endereco = new Endereco(codigo, tipo_de_logradouro, rua, rua_numero, complemento, cep, bairro);
					lEndereco.add(endereco);
				}
			}
		}

		return lEndereco;

	}
}
