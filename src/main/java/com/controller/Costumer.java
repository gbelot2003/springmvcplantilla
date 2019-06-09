package com.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Costumer {
	@NotNull(message="Is required")
	@Size(min=5)
	private String firstName;
	
	@NotNull(message="Is required")
	@Size(min=5)
	private String lastName;
	
	@NotNull(message="Is required")
	@Min(value=1, message="must be greater than or equal to one")
	@Max(value=10, message="must be lower than or equal to ten")
	private Integer freePass;
	
	@NotNull(message="Is required")
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	

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
	
	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	

}
