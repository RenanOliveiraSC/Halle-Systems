package br.com.entra21.amostradetalentos.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/dashboard")
public class DashboardsRest {

	@GET
	@Path("/teste")
	public Response testeDessaMerda() {
		return Response.status(Response.Status.OK).build();
	}
}
