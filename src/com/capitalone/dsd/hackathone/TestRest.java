package com.capitalone.dsd.hackathone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestRest {

	@GET
	@Path("/{name}")
	public Response authenticate(@PathParam("name") String name) {
		return Response.status(200).entity("LoggedIn - " + name).build();
	}
}