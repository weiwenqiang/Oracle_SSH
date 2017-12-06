package com.wwq.spring.bean;

public class User {
	public User() {
		super();
	}
	private User(int id){
		this.id=id;
		System.out.print("----------");
	}
	private int id;
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
