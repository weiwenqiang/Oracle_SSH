package com.wwq.spring.test1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.wwq.spring.UserDao;

public class TestUserLog {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("src/bean.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		UserDao user = (UserDao) bf.getBean("proxybean");
		user.delete("уенч╪и");
	}
}
