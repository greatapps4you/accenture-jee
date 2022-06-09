package com.accenture.j2ee.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.accenture.j2ee.entities.Customer;

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
