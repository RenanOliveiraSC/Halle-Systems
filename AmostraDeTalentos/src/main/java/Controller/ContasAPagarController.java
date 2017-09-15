package Controller;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import DTO.ClienteDTO;
import br.com.entra21.amostradetalentos.model.Cliente;
import br.com.entra21.amostradetalentos.service.ClienteService;

public class ContasAPagarController {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response create(ClienteDTO cliente) {
		ClienteService ClienteService = new ClienteService();
		try {
			ClienteService.inserir(Cliente.toCliente());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response update(ClienteDTO Cliente) {
		ClienteService ClienteService = new ClienteService();
		try {
			ClienteService.inserir(Cliente.toCliente());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response Delete(ClienteDTO Cliente) {
		ClienteService ClienteService = new ClienteService();
		try {
			ClienteService.inserir(Cliente.toCliente());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}
