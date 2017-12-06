package com.wwq.spring.usb;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wwq.spring.bean.User;


public class TestUsb {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		Computer c = (Computer)bf.getBean("com");
		c.test();
	}
}
