package br.com.entra21.amostradetalentos.dto;

import br.com.entra21.amostradetalentos.model.UsuarioLogin;

public class UsuarioLoginDTO {

	private String usuario;
	private String senha;


	public UsuarioLoginDTO(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public UsuarioLoginDTO() {

	}

	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public UsuarioLogin toUsuarioLogin() {
		return new UsuarioLogin(this.usuario, this.senha);
	}

}
