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
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanhibernate.xml");
		UserDao dao = (UserDao)ac.getBean("userdao");
		Person p = new Person();
		p.setName("аЁеб");
		
		dao.add(p);
		
//		dao.delete(p);
//		
//		dao.update(p);
		
		List list=dao.listPerson();
		for (int i = 0; i < list.size(); i++) {
			Person p1 = (Person)list.get(i);
			System.out.println(p1.getId());
			System.out.println(p1.getName());
		}
	}
}
