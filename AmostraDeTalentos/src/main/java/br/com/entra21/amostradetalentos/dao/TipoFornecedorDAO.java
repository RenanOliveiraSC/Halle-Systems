package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.TipoFornecedor;

public class TipoFornecedorDAO {
		
		private final Connection con;
		
		public TipoFornecedorDAO(Connection con) {
			this.con = con;
		}
		
		public boolean inserir(String nome) throws SQLException {
			String sql = "INSERT INTO TIPO_FORNECEDOR  (TIPF_CODIGO, TIPF_NOME ) VALUES (SEQ_TIPO_FORNECEDOR.NEXTVAL, ?);";

			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, nome);

			return statement.executeUpdate() > 0;
		}
		
		public boolean alterar(int id, String nome) throws SQLException {
			String sql = "UPDATE TIPO_FORNECEDOR  SET TIPF_NOME  = ? WHERE TIPF_CODIGO = ?";

			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, nome);
			statement.setInt(2, id);

			return statement.executeUpdate() > 0;
		}
		
		public boolean excluir(int id) throws SQLException {
			String sql = "DELETE TIPO_FORNECEDOR  WHERE TIPF_CODIGO = ?";

			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, id);

			return statement.executeUpdate() > 0;
		}
		
		public List<TipoFornecedor> lista() throws SQLException {
			List<TipoFornecedor> lTipoFornecedor = new ArrayList<>();

			String sql = "select * from TIPO_FORNECEDOR ";
			try (PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.execute();
				try (ResultSet rs = stmt.getResultSet()) {
					while (rs.next()) {
						int id = rs.getInt("TIPF_CODIGO");
						String nome = rs.getString("TIPF_NOME ");
						TipoFornecedor tipoFornecedor = new TipoFornecedor(id, nome);
						lTipoFornecedor.add(tipoFornecedor);
					}
				}
			}

			return lTipoFornecedor;

		}

}
