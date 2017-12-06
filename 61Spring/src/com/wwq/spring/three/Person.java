package com.wwq.spring.three;

public class Person {
	public Person(){
		System.out.println("没通知");
	}
	
	private int age;
	private Util util;
	
	
	public Person(int age, Util util, String name) {
		super();
		this.age = age;
		this.util = util;
		this.name = name;
	}

	public Util getUtil() {
		return util;
	}

	public void setUtil(Util util) {
		this.util = util;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name){
		this.name=name;
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static Person getPerson(int age, String name, Util util){
		System.out.println("通知使用工厂");
		return new Person(age, util, name);
	}
}
