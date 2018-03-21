package org.dbrest.servicios;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hola")
public class HolaService {
	
	@GET
	public Response getHola() {
		return Response
				.ok("Hola mundo!")
				.type(MediaType.TEXT_PLAIN)
				.build();
	}
}
