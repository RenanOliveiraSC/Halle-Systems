package br.com.entra21.amostradetalentos.rest;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.entra21.amostradetalentos.dto.ClienteDTO;
import br.com.entra21.amostradetalentos.service.ClienteService;

@Path("/cliente")
public class ClienteRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(ClienteDTO cliente) {
		ClienteService clienteService = new ClienteService();
		try {
			clienteService.inserir(cliente.toCliente());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Response update(ClienteDTO cliente) {
		ClienteService clienteService = new ClienteService();
		try {
			clienteService.alterar(cliente);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("/delete/{codigo}")
	public Response delete(@PathParam ("codigo") int codigo) {
		ClienteService clienteService = new ClienteService();
		try {
			clienteService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/clientes")
	public Response getClientes() {
		ClienteService clienteService = new ClienteService();
		try {
			return Response.ok(clienteService.listar()).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cliente/{codigo}")
	public Response getClientePeloCodigo(@PathParam ("codigo") int codigo) {
		ClienteService clienteService = new ClienteService();
		try {
			return Response.ok(clienteService.getClientePeloCodigo(codigo)).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/clientesSelecionar")
	public Response getClientesSelecionar() {
		ClienteService clienteService = new ClienteService();
		try {
			return Response.ok(clienteService.listarSelect()).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
}
