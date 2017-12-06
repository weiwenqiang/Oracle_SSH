package com.wwq.spring.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestThree {
	public static void main(String[] args) {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("three.xml");
		Person person = (Person) ac1.getBean("per");
		System.out.println(person.getUtil().getStr());
		
		
		TrendsPerson per = (TrendsPerson) ac1.getBean("person");
		System.out.println(per.getName()+per.getAge());
	}
}
