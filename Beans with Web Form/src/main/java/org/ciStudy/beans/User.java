package org.ciStudy.beans;

public class User {
	private String firstName;
	private String lastName;
	public User() {
		firstName="Jhon";
		lastName="Doe";
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
