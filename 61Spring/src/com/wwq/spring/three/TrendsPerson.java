package com.wwq.spring.three;

public class TrendsPerson {
	private String name;
	private int age;

	public TrendsPerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TrendsPerson(String name) {
		super();
		this.name = name;
	}

	public TrendsPerson() {
	}
	
	
}
