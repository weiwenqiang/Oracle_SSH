package com.wwq.spring.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wwq.spring.bean.User;

public class TestUser {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
//		User user  = (User) bf.getBean("user");
//		System.out.println(user.getName());
		CRUD crud = (CRUD) bf.getBean("crud");
		crud.insert();
	}
}
