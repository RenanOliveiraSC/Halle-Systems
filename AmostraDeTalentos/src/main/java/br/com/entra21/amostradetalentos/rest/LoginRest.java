package br.com.entra21.amostradetalentos.rest;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.entra21.amostradetalentos.dto.UsuarioLoginDTO;
import br.com.entra21.amostradetalentos.model.UsuarioLogin;
import br.com.entra21.amostradetalentos.service.UsuarioService;

@Path("/login")
public class LoginRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/efetuarlogin")
	public Response login(UsuarioLoginDTO usuario) {
		UsuarioService usuarioService = new UsuarioService();
//		UsuarioLogin usuarioLogin = usuario.toUsuarioLogin();
//		usuarioLogin.setSenha(null);
//		return Response.ok(usuarioLogin).build();
		try {
			UsuarioLogin usuarioLogin = usuarioService.login(usuario.toUsuarioLogin());
			if (usuarioLogin != null) {
				return Response.ok(usuarioLogin).build();
			}
			return Response.status(Response.Status.UNAUTHORIZED).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}