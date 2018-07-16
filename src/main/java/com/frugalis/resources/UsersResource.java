package com.frugalis.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.frugalis.beans.Users;


@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "Users Api ", produces = "application/json")
public interface UsersResource {


	@GET
	@ApiOperation(value = "List Down All Users")  
	public Response getAllUsers();
	
	@POST
	@ApiOperation(value = "Adding a User")
	public Response saveUser( Users user);
	

	
}
