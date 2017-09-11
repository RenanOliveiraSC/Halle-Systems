package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.entra21.amostradetalentos.model.TipoCliente;

public class TipoClienteDAO {
	
	private final Connection con;
	
	public TipoClienteDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(String nome) throws SQLException {
		String sql = "INSERT INTO TIPO_CLIENTE (TIPC_CODIGO, TIPC_NOME) VALUES (SEQ_TIPO_CLIENTE.NEXTVAL, ?);";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);

		return statement.executeUpdate() > 0;
	}
	
	public boolean alterar(int id, String nome) throws SQLException {
		String sql = "UPDATE TIPO_CLIENTE SET TIPC_NOME = ? WHERE TIPC_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nome);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
	public boolean excluir(int id) throws SQLException {
		String sql = "DELETE TIPO_CLIENTE WHERE TIPC_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, id);

		return statement.executeUpdate() > 0;
	}
	
	public List<TipoCliente> lista() throws SQLException {
		List<TipoCliente> lTipoCliente = new ArrayList<>();

		String sql = "select * from TIPO_CLIENTE";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("TIPC_CODIGO");
					String nome = rs.getString("TIPC_NOME");
					TipoCliente tipoCliente = new TipoCliente(id, nome);
					lTipoCliente.add(tipoCliente);
				}
			}
		}

		return lTipoCliente;

	}

}
