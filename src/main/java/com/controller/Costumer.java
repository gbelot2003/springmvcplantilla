package com.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Costumer {
	@NotNull(message="Empty")
	@Size(min=5)
	private String firstName;
	
	@NotNull(message="Empty")
	@Size(min=5)
	private String lastName;
	
	public Costumer() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
