package com.accenture.j2ee.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named @RequestScoped
public class IndexBean {

	private String welcome = "Welcome to J2EE";

	public String getWorld() {
		return welcome;
	}

}
