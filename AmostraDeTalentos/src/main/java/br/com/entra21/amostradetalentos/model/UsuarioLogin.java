package br.com.entra21.amostradetalentos.model;

public class UsuarioLogin {

	private Integer codigo;
	private String login;
	private String senha;
	private String nome;
	private boolean administrador;

	public UsuarioLogin(Integer codigo, String login, String senha, String nome,boolean administrador) {
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.administrador = administrador;
	}

	public UsuarioLogin(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public UsuarioLogin() {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

}
