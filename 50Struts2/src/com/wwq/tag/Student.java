package com.wwq.tag;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	public Student() {
	}

	public Student(String name, int age) {
		this.age = age;
		this.name = name;
	}

	private String name;
	private int age;

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

	public static void main(String[] args) {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("mm");
		String date = df.format(d);
		System.out.print(date);
	}
}
