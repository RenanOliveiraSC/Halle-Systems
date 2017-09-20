package br.com.entra21.amostradetalentos.rest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.entra21.amostradetalentos.dto.AgendaDTO;
import br.com.entra21.amostradetalentos.service.AgendaService;

@Path("/agenda")
public class ContasAReceberRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<AgendaDTO> listAgenda() {
		AgendaService agendaService = new AgendaService();
		try {
			return agendaService.listarAgenda();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(AgendaDTO agenda) {
		AgendaService agendaService = new AgendaService();
		try {
			agendaService.inserir(agenda.toAgenda());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

}