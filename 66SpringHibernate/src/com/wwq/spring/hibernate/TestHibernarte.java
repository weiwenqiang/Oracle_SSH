package com.wwq.spring.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wwq.spring.bean.Person;
import com.wwq.spring.bean.UserDao;

public class TestHibernarte {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserDao dao = (UserDao)ac.getBean("userdao");
		Person p = new Person();
		p.setName("Ñî×óÊ¹");
		
		dao.add(p);
		
		dao.delete(p);
		
		Person p2 = new Person();
		p2.setId(33);
		p2.setName("ÑîåÐ");
		dao.update(p2);
		
		List list=dao.listPerson();
		for (int i = 0; i < list.size(); i++) {
			Person p1 = (Person)list.get(i);
			System.out.println(p1.getId());
			System.out.println(p1.getName());
		}
	}
}
