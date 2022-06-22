package com.accenture.j2ee.api;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.accenture.j2ee.entities.Customer;
import com.accenture.j2ee.service.CustomerService;

@Path("customers")
public class CustomerResource {
	
	@Inject
	private CustomerService customerService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> list() {
		return customerService.list();
	}

}
