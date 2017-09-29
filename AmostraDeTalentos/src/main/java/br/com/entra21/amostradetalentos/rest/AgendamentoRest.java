package br.com.entra21.amostradetalentos.rest;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.entra21.amostradetalentos.dto.AgendamentoCriarDTO;
import br.com.entra21.amostradetalentos.dto.AgendamentoDTO;
import br.com.entra21.amostradetalentos.dto.AgendamentoMiniDTO;
import br.com.entra21.amostradetalentos.service.AgendamentoService;

@Path("/agendamento")
public class AgendamentoRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar/{start}/{end}")
	public Response listAgenda(@PathParam("start") String dateStart, @PathParam("end") String dateEnd) {
		/*Tem que retornar uma lista de AgendamentoMiniDTO, pra ser exibido no calendario*/
		AgendamentoService agendaService = new AgendamentoService();
		try {
			List<AgendamentoMiniDTO> agendamentos = agendaService.listarAgenda();
			return Response.ok(agendamentos).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Path("/agendamento/{id}")
	public Response getAgendamento(@PathParam("id") int codigo) {
		AgendamentoService agendaService = new AgendamentoService();
		try {
			AgendamentoDTO agendamento = agendaService.getAgendamentoPeloCodigo(codigo);
			return Response.ok(agendamento).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(AgendamentoCriarDTO agenda) {
		AgendamentoService agendaService = new AgendamentoService();
		try {
			agendaService.inserir(agenda);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Response update(AgendamentoDTO agenda) {
		AgendamentoService agendaService = new AgendamentoService();
		try {
			agendaService.alterar(agenda);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@DELETE
	@Path("/delete/{id}")
	public Response delete(@PathParam("id") int codigo) {
		AgendamentoService agendaService = new AgendamentoService();
		try {
			agendaService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@POST
	@Path("/concluir/{id}")
	public Response concluir(@PathParam("id") int codigo) {
		AgendamentoService agendaService = new AgendamentoService();
		try {
			agendaService.concluirAgendamento(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@POST
	@Path("/cancelar/{id}")
	public Response cancelar(@PathParam("id") int codigo) {
		AgendamentoService agendaService = new AgendamentoService();
		try {
			agendaService.cancelarAgendamento(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

}
