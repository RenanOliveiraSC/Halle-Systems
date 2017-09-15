package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.entra21.amostradetalentos.service.AgendaService;
import dto.AgendaDTO;

@Path("agenda")

public class AgendaController {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
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
	@Path("/")
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
