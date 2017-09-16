package br.com.entra21.amostradetalentos.rest;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.entra21.amostradetalentos.dto.ProdutoDTO;
import br.com.entra21.amostradetalentos.service.ProdutoService;

@Path("/rest/produto")
public class ProdutoRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")

	public Response create(ProdutoDTO produto) {
		ProdutoService produtoService = new ProdutoService();
		try {
			produtoService.inserir(produto.toProduto());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response update(ProdutoDTO produto) {
		ProdutoService produtoService = new ProdutoService();
		try {
			produtoService.inserir(produto.toProduto());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response Delete(ProdutoDTO produto) {
		ProdutoService produtoService = new ProdutoService();
		try {
			produtoService.inserir(produto.toProduto());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}
