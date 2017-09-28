package br.com.entra21.amostradetalentos.rest;

import java.sql.SQLException;
import java.util.ArrayList;
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

import br.com.entra21.amostradetalentos.dto.ServicosDTO;
import br.com.entra21.amostradetalentos.service.ServicoProdutoService;
import br.com.entra21.amostradetalentos.service.ServicoService;

@Path("/servico")
public class ServicoRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(ServicosDTO servico) {
		ServicoService servicoService = new ServicoService();
		try {
			servicoService.inserir(servico.toServico());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Path("/update")
//	public Response update(ServicosDTO servico) {
//		ServicoService servicoService = new ServicoService();
//		try {
//			servicoService.inserir(servico.toServico());
//			return Response.status(Response.Status.OK).build();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
//		}
//	}

	@DELETE
	@Path("/delete/{codigo}")
	public Response delete(@PathParam ("codigo") int codigo) {
		ServicoService servicoService = new ServicoService();
		try {
			servicoService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<ServicosDTO> listPessoas() {
		ServicoService servicoService = new ServicoService();
		try {
			return servicoService.listar();
		} catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/servico/{codigo}")
	public Response getServico(@PathParam("codigo") int codigo) {
		ServicoService servicoService = new ServicoService();
		try {
			ServicosDTO servicoDTO = servicoService.buscarServicoPorCodigo(codigo).toDTO();
			//Aqui diz que retornou OK e retorna pro front end o servicoDTO 
			return Response.ok(servicoDTO).build();
		} catch (SQLException e) {
			e.printStackTrace();
			//Se deu erro, vai retornar pro front end um erro interno
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/servicosSelecionar")
	public Response getServicosSelecionar() {
		ServicoProdutoService service = new ServicoProdutoService();
		try {
			return Response.ok(service.listarSelect()).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}
