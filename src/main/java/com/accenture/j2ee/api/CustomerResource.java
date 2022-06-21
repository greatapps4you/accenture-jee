package com.accenture.j2ee.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("customers")
public class CustomerResource {

	@GET
	@Path("list")
	public String list() {
		return "A LIST OF CUSTOMERS";
	}

}
