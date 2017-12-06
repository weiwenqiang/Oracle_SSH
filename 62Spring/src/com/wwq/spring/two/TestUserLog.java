package com.wwq.spring.two;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.wwq.spring.trans.ITrans;

public class TestUserLog {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beantwouser.xml");
		UserDao dao = (UserDao) ac.getBean("userdao");
		dao.delete("’‘√Ù");
	}
}
