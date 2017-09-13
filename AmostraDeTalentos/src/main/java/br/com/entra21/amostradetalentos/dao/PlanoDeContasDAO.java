package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.entra21.amostradetalentos.model.PlanoDeContas;

public class PlanoDeContasDAO {
	
	private final Connection con;

	public PlanoDeContasDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(PlanoDeContas planodecontas) throws SQLException {
		String sql = "INSERT INTO PLANO_DE_CONTAS (CONTA_CODIGO, CONTA_NOME, CONTA_SALDO, CONTA_CAIXA, CONTA_ATIVA, CONTA_CONFIDENCIAL, CONTA_CENTRO_DE_CUSTO, CONTA_CODIGO_EXTERNO) VALUES (SEQ_CONTA.NEXTVAL, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement statement = con.prepareStatement(sql);
		/*------------------------------------------------------*/
		statement.setString(1, planodecontas.getNome_conta());
		statement.setInt(2, planodecontas.getSaldo());
		statement.setString(3, planodecontas.getConta_caixa());
		statement.setString(4, planodecontas.getConta_ativa());
		statement.setString(5, planodecontas.getConfidencial());
		statement.setString(6, planodecontas.getCentro_de_custo());
		statement.setString(7, planodecontas.getCodigo_externo());		
		
		return statement.executeUpdate() > 0;
	}
	
	public boolean alterarNomeconta(int id, String nomeconta) throws SQLException {
		String sql = "UPDATE PLANO_DE_CONTAS SET CONTA_NOME = ? WHERE CONTA_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, nomeconta);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
	public boolean alterarContaativa(int id, String contaativa) throws SQLException {
		String sql = "UPDATE PLANO_DE_CONTAS SET CONTA_ATIVA = ? WHERE CONTA_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, contaativa);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
	public boolean alterarContaconfidencial(int id, String contaconfidencial) throws SQLException {
		String sql = "UPDATE PLANO_DE_CONTAS SET CONTA_CONFIDENCIAL = ? WHERE CONTA_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, contaconfidencial);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
	public boolean alterarCentrocusto(int id, String centrocusto) throws SQLException {
		String sql = "UPDATE PLANO_DE_CONTAS SET CONTA_CENTRO_DE_CUSTO = ? WHERE CONTA_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, centrocusto);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
	public boolean alterarCodigoexterno(int id, String codigoexterno) throws SQLException {
		String sql = "UPDATE PLANO_DE_CONTAS SET CONTA_CODIGO_EXTERNO = ? WHERE CONTA_CODIGO = ?";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, codigoexterno);
		statement.setInt(2, id);

		return statement.executeUpdate() > 0;
	}
	
	
	public List<PlanoDeContas> lista() throws SQLException {
		List<PlanoDeContas> lplanodecontas = new ArrayList<>();

		String sql = "select * from PLANO_DE_CONTAS";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int id = rs.getInt("CONTA_CODIGO");
					String nome = rs.getString("CONTA_NOME");
					int saldo = rs.getInt("CONTA_SALDO");
					String caixa = rs.getString("CONTA_CAIXA");
					String ativa = rs.getString("CONTA_ATIVA");
					String confidencial = rs.getString("CONTA_CONFIDENCIAL");
					String centrodecusto = rs.getString("CENTRO_DE_CUSTO");
					String codigoexterno = rs.getString("CONTA_CODIGO_EXTERNO");
					
					PlanoDeContas planodecontas = new PlanoDeContas(id, nome, saldo, caixa, ativa, confidencial, centrodecusto, codigoexterno);
					lplanodecontas.add(planodecontas);
				}
			}
		}

		return lplanodecontas;

	}
	
	
}
