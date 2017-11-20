package com.wwq.hibernate.one;

import java.io.Serializable;

public class Address implements Serializable {
	private String street;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	private String address;
	private String city;
	private String code;

	public Address() {
	}

	public Address(String adress, String city, String code, String street) {
		this.address = adress;
		this.city = city;
		this.code = code;
		this.street = street;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
