package com.wwq.spring.test3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.wwq.spring.UserDao;

public class TestUserLogThree {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("src/beanthree.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		UserDao user = (UserDao) bf.getBean("userdao");
		user.delete("уенч╪и");
		
	}
}
