package Controller;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import DTO.ServicosDTO2;
import DTO.ServicosDTO2;
import br.com.entra21.amostradetalentos.service.ServicoService;
import br.com.entra21.amostradetalentos.service.ServicoService;
import br.com.entra21.amostradetalentos.service.ServicoService;

@Path("Servico")

public class ServicoController {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")

	public Response create(ServicosDTO2 servico) {
		ServicoService servicoService = new ServicoService();
		try {
			servicoService.inserir(servico.toServico());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response update(ServicosDTO2 servico) {
		ServicoService servicoService = new ServicoService();
		try {
			servicoService.inserir(servico.toServico());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/")
	public Response Delete(ServicosDTO2 servico) {
		ServicoService servicoService = new ServicoService();
		try {
			servicoService.inserir(servico.toServico());
			return Response.status(Response.Status.OK).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
}
