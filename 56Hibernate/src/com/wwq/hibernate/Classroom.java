package com.wwq.hibernate;

import java.util.Set;

public class Classroom {
	private int id;
	private String class_name;
	private Set<Student> stuSet;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public Set<Student> getStuSet() {
		return stuSet;
	}

	public void setStuSet(Set<Student> stuSet) {
		this.stuSet = stuSet;
	}

}
