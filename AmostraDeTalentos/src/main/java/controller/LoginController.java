package controller;

import javax.ws.rs.Path;

import br.com.entra21.amostradetalentos.DTO.UsuarioLoginDTO;
import br.com.entra21.amostradetalentos.service.
public class LoginController {
	
	@Path("login")
	
	public class LoginController {
		
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/")
		public list<LoginDTO> listLogins(){
			LoginService loginService = new LoginService();
			try {
				return loginService.
			}
		}
	}
}
