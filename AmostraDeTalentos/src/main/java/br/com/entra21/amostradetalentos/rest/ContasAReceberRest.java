package br.com.entra21.amostradetalentos.rest;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.entra21.amostradetalentos.dto.ContasAReceberDTO;
import br.com.entra21.amostradetalentos.service.ContasAReceberService;

@Path("/contasAReceber")
public class ContasAReceberRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<ContasAReceberDTO> listContasAReceber() throws SQLException {
		ContasAReceberService contasAReceberService = new ContasAReceberService();
		return contasAReceberService.listarContasAReceber();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(ContasAReceberDTO contasAReceber) {
		ContasAReceberService contasAReceberService = new ContasAReceberService();
		try {
			contasAReceberService.inserir(contasAReceber.toContasAReceber());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

}
