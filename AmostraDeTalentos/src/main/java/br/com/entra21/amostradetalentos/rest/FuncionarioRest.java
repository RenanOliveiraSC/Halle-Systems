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

import br.com.entra21.amostradetalentos.model.Funcionario;
import br.com.entra21.amostradetalentos.service.FuncionarioService;

@Path("/funcionario")
public class FuncionarioRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/create")
	public Response create(Funcionario funcionario) {
		FuncionarioService funcionarioService = new FuncionarioService();
		try {
			funcionarioService.inserir(funcionario);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Response update(Funcionario funcionario) {
		FuncionarioService funcionarioService = new FuncionarioService();
		try {
			funcionarioService.alterar(funcionario);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@DELETE
	@Path("/delete/{codigo}")
	public Response delete(@PathParam ("codigo") int codigo) {
		FuncionarioService funcionarioService = new FuncionarioService();
		try {
			funcionarioService.excluir(codigo);
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/funcionariosSelecionar")
	public Response getFuncionariosSelecionar() {
		FuncionarioService funcionarioService = new FuncionarioService();
		try {
			return Response.ok(funcionarioService.listarSelect()).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/funcionarios")
	public Response getFuncionarios() {
		FuncionarioService funcionarioService = new FuncionarioService();
		try {
			return Response.ok(funcionarioService.listar()).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
}
