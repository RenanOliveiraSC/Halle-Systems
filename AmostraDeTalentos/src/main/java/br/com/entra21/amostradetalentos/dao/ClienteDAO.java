package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.entra21.amostradetalentos.model.Cliente;
import br.com.entra21.amostradetalentos.model.Endereco;
import br.com.entra21.amostradetalentos.model.GrupoCliente;

public class ClienteDAO {

	private final Connection con;

	public ClienteDAO(Connection con) {
		this.con = con;
	}

	public boolean inserir(Cliente cliente, GrupoCliente grupocliente, Endereco endereco) throws SQLException {
		String sql = "INSERT INTO CLIENTE (CLI_CODIGO, CLI_NOME, CLI_SOBRENOME, CLI_CPF, CLI_TELEFONE, CLI_CELULAR, CLI_EMAIL, CLI_DATA_NASCIMENTO, CLI_SEXO, CLI_PROFISSAO, CLI_PAI_MAE, CLI_GRU_CODIGO, CLI_END_CODIGO) VALUES (SEQ_CLIENTE.NEXTVAL, ?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getSobrenome());
		statement.setString(3, cliente.getCpf());
		statement.setString(4, cliente.getTelefone());
		statement.setString(5, cliente.getCelular());
		statement.setString(6, cliente.getEmail());
		statement.setDate(7, new Date(cliente.getData_nascimento().getTime()));
		statement.setString(8, cliente.getSexo());
		statement.setString(9, cliente.getProfissao());
		statement.setInt(10, cliente.getPai_mae());
		statement.setInt(11, cliente.getGrupocliente().getCodigo());
		statement.setInt(12, cliente.getEndereco().getCodigo());

		return statement.executeUpdate() > 0;
	}
}
