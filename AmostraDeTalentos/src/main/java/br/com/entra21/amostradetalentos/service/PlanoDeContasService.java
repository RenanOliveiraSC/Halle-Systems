package br.com.entra21.amostradetalentos.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.entra21.amostradetalentos.dao.PlanoDeContasDAO;
import br.com.entra21.amostradetalentos.jdbc.oracle.ConnectionPoolOracle;
import br.com.entra21.amostradetalentos.model.PlanoDeContas;

public class PlanoDeContasService {
	
	public void inserir(PlanoDeContas planodecontas) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new PlanoDeContasDAO(con).inserir(planodecontas);
		}
	}
	
	public void alterarNomeConta(int id, String nomeconta) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new PlanoDeContasDAO(con).alterarNomeConta(id, nomeconta);
		}
	}
	
	public void alterarContaAtiva(int id, String contaativa) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new PlanoDeContasDAO(con).alterarContaAtiva(id, contaativa);
		}
	}
	
	public void alterarContaConfidencial(int id, String contaconfidencial) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new PlanoDeContasDAO(con).alterarContaConfidencial(id, contaconfidencial);
		}
	}
	
	public void alterarCentroCusto(int id, String centrocusto) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new PlanoDeContasDAO(con).alterarCentroCusto(id, centrocusto);
		}
	}
	
	public void alterarCodigoExterno(int id, String codigoexterno) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			new PlanoDeContasDAO(con).alterarCodigoExterno(id, codigoexterno);
		}
	}
	
	public List<PlanoDeContas> lista() throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()){
			return new PlanoDeContasDAO(con).lista();
		}
	}

}
