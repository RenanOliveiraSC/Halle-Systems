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

import br.com.entra21.amostradetalentos.dto.AgendaDTO;
import br.com.entra21.amostradetalentos.dto.ContasAPagarDTO;
import br.com.entra21.amostradetalentos.model.ContasAPagar;
import br.com.entra21.amostradetalentos.service.ContasAPagarService;

@Path("/contasAPagar")
public class ContasAPagarRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<ContasAPagarDTO> listContasAPagar() {
		ContasAPagarService contasAPagarService = new ContasAPagarService();
		try {
			return contasAPagarService.listarContasAPagar();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	// private List<AgendaDTO> listarContasAPagar() {
	// // TODO Auto-generated method stub
	// return null;
	// }

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(AgendaDTO agenda) {
		ContasAPagarRest contasAPagarService = new ContasAPagarRest();
		try {
			contasAPagarService.inserir(ContasAPagar.toContasAPagar());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	private void inserir(Object contasAPagar) {
		// TODO Auto-generated method stub

	}

}