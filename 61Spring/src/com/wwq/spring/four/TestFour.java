package com.wwq.spring.four;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestFour {
	public static void main(String[] args) {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("four.xml");
		ClassRoom room = (ClassRoom) ac1.getBean("room");
		for (Object string : room.getList()) {
			System.out.println(string.toString());
		}
		
		
		Dog dog = (Dog) ac1.getBean("dog");
		for (Object string : dog.getSet()) {
			System.out.println(string.toString());
		}
	}
}
