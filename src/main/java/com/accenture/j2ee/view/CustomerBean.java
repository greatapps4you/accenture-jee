package com.accenture.j2ee.view;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.accenture.j2ee.entities.Customer;
import com.accenture.j2ee.service.CustomerService;

@Named
@RequestScoped
public class CustomerBean {

	@Inject
	private CustomerService customerService;

	private Customer customer = new Customer();
	private List<Customer> customers;

	@PostConstruct
	private void initCustomers() {
		customers = customerService.list();
	}

	public void save() {
		customerService.create(customer);
		customers.add(customer);
		customer = new Customer();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}