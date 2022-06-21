package com.accenture.j2ee.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/customer")
public class CustomerResource {
	
	@GET
	public String list() {
		return "A LIST OF CUSTOMERS";
	}

}
