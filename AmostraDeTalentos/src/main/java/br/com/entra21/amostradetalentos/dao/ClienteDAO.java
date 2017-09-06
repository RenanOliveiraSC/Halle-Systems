package br.com.entra21.amostradetalentos.dao;

import java.sql.Connection;
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

	public boolean inserir(Cliente cliente, GrupoCliente tipoCliente, Endereco endereco) throws SQLException {
		String sql = "INSERT INTO CLIENTE (CLI_CODIGO, CLI_NOME, CLI_SOBRENOME, CLI_CPF, CLI_TELEFONE, CLI_CELULAR, CLI_EMAIL, CLI_DATA_NASCIMENTO, CLI_SEXO, CLI_PROFISSAO, CLI_PAI_MAE, CLI_GRU_CODIGO, CLI_END_CODIGO) VALUES (SEQ_CLIENTE.NEXTVAL, ?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cliente.getNome());
		statement.setString(2, cliente.getSobrenome());
		statement.setString(3, cliente.getCpf());
		statement.setString(4, cliente.getTelefone());
		statement.setString(5, cliente.getCelular());
		statement.setString(6, cliente.getEmail());
		statement.setInt(7, cliente.getGrupocliente().getCodigo());
		statement.setInt(8, cliente.getEndereco().getCodigo());

		return statement.executeUpdate() > 0;
	}
}
