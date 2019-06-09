package com.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Costumer {
	@NotNull(message="Is required")
	@Size(min=5)
	private String firstName;
	
	@NotNull(message="Is required")
	@Size(min=5)
	private String lastName;
	
	@Min(value=1, message="must be greater than or equal to one")
	@Max(value=10, message="must be lower than or equal to ten")
	private int freePass;
	

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
	
	public int getFreePass() {
		return freePass;
	}

	public void setFreePass(int freePass) {
		this.freePass = freePass;
	}

}
