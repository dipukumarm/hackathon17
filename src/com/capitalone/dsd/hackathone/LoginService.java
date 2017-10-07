package com.capitalone.dsd.hackathone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/login")
public class LoginService {

	@GET
	@Path("/authenticate/{username}")
	public Response authenticate(@PathParam("username") String username) {
		return Response.status(200).entity("LoggedIn - " + username).build();
	}
	//http://localhost:8080/hackathon17/resources/login/authenticate/user
	
	@GET
	@Path("/test")
	public Response authenticate() {
		return Response.status(200).entity("Your setup is working.").build();
	}
	//http://localhost:8080/hackathon17/resources/login/test
}
