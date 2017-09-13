package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.PlanoDeContas;

public class PlanoDeContasDAO {
	
	private final Connection con;

	public PlanoDeContasDAO(Connection con) {
		this.con = con;
	}
	
	public boolean inserir(PlanoDeContas planodecontas) throws SQLException {
		String sql = "INSERT INTO PLANO_DE_CONTAS (CONTA_CODIGO, CONTA_NOME, CONTA_SALDO, CONTA_CAIXA, CONTA_ATIVA, CONTA_CONFIDENCIAL, CONTA_CENTRO_DE_CUSTO, CONTA_CODIGO_EXTERNO) VALUES (SEQ_CONTA.NEXTVAL, ?, ?, ?, ?, ?, ?, ?);";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, planodecontas.getNome_conta());
		statement.setInt(2, planodecontas.getSaldo());
		statement.setString(3, planodecontas.getConta_caixa());
		statement.setString(4, planodecontas.getConta_ativa());
		statement.setString(5, planodecontas.getConfidencial());
		statement.setString(6, planodecontas.getCentro_de_custo());
		statement.setString(7, planodecontas.getCodigo_externo());		
		
		return statement.executeUpdate() > 0;
	}
}
