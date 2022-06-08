package com.accenture.j2ee.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.accenture.j2ee.entities.Customer;

@Named
@RequestScoped
public class CustomerBean {

	private Customer customer = new Customer("John Wayne", "john.wayne@accenture.com");
	
	public void save() {
		System.out.println("Saving Customer: " + customer);
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}