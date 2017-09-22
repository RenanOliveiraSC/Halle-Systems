package br.com.entra21.amostradetalentos.rest;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.entra21.amostradetalentos.dto.CaixaDTO;
import br.com.entra21.amostradetalentos.model.Caixa;
import br.com.entra21.amostradetalentos.service.CaixaService;
import br.com.entra21.amostradetalentos.service.ClienteService;

@Path("/caixa")
public class CaixaRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(CaixaDTO caixa) {
//		ClienteService CaixaService = new CaixaService();
//		try {
//			CaixaService.inserir(Caixa.toCaixa());
			return Response.status(Response.Status.OK).build();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
//		}
	}

	@DELETE
	@Path("delete/{codigo}")
	public Response delete(@PathParam("codigo") int codigo) {
		CaixaService CaixaService = new CaixaService();
		try {
			CaixaService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/caixa")
	public Response getCaixa(CaixaDTO Caixa) {
		CaixaService CaixaService = new CaixaService();
		try {
			CaixaService.inserir(Caixa.toCaixa());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

}
