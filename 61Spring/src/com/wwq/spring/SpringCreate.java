package com.wwq.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.wwq.spring.one.CRUD;
import com.wwq.spring.two.Computer;

public class SpringCreate {
	public static void main(String[] args) {
		//1
		Resource resource1 = new ClassPathResource("bean.xml");
		//2
		Resource resource2 = new FileSystemResource("src/bean.xml");
		BeanFactory bf = new XmlBeanFactory(resource1);
//		User user  = (User) bf.getBean("user");
//		System.out.println(user.getName());
		CRUD crud = (CRUD) bf.getBean("crud");
		crud.insert();
		
		/**
		 * 1
		 */
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("bean.xml");
		Computer com1 = (Computer) ac1.getBean("com");
		com1.test();
		/**
		 * 2
		 */
		ApplicationContext ac2 = new FileSystemXmlApplicationContext("src/bean.xml");
		Computer com2 = (Computer) ac2.getBean("com");
		com2.test();
		/**
		 * 3
		 */
//		ApplicationContext ac3 = new XmlWebApplicationContext();
//		Computer com3 = (Computer) ac3.getBean("com");
//		com3.test();
		/**
		 * 4
		 */
		ApplicationContext ac4 = new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml","bean.xml"});
		Computer com4 = (Computer) ac4.getBean("com");
		com4.test();
	}
}
