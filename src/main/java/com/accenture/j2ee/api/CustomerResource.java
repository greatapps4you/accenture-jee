package com.accenture.j2ee.api;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("customers")
@RequestScoped
public class CustomerResource {
	
	@GET
	public String list() {
		return "A LIST OF CUSTOMERS";
	}

}
