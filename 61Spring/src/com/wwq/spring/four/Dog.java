package com.wwq.spring.four;

import java.util.Set;

public class Dog {
	private int age;
	private Set set;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Dog(int age, Set set) {
		super();
		this.age = age;
		this.set = set;
	}
	public Dog() {
		super();
	}
	
	
}
