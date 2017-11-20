package com.wwq.hibernate;

public class Person {
	private String email;
	private PersonKey personKey;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PersonKey getPersonKey() {
		return personKey;
	}
	public void setPersonKey(PersonKey personKey) {
		this.personKey = personKey;
	}
	@Override
	public String toString() {
		return "Person [email=" + email + ", personKey=" + personKey + "]";
	}
	
	
}
