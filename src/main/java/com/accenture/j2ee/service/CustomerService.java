package com.accenture.j2ee.service;

import java.util.List;


import com.accenture.j2ee.entities.Customer;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class CustomerService {

	@PersistenceContext
	private EntityManager entityManager;

	public void create(Customer customer) {
		entityManager.persist(customer);
	}

	public List<Customer> list() {
		return entityManager.createQuery("FROM Customer c", Customer.class).getResultList();
	}

}
