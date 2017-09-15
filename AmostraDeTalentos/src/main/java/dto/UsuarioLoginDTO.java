package dto;

import br.com.entra21.amostradetalentos.model.UsuarioLogin;

public class UsuarioLoginDTO {

	private Integer codigo;
	private String login;
	private String senha;

	public UsuarioLoginDTO(Integer codigo, String login, String senha) {
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
	}

	public UsuarioLoginDTO(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public UsuarioLoginDTO() {

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

	public UsuarioLogin toUsuarioLogin() {
		return new UsuarioLogin(this.codigo, this.login, this.senha);
	}

}
