package com.accenture.j2ee.view;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class IndexBean {

	private String welcome = "Welcome to J2EE";

	public String getWorld() {
		return welcome;
	}

}
