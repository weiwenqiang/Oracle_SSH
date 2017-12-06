package com.wwq.spring.trans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class TestTrans {

	public static void main(String[] args) {
		Resource resource = new FileSystemResource("src/bean.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		ITrans itrans = (ITrans) bf.getBean("proxybean");
		itrans.transfer("уенч╪и");
	}
}
