package com.wwq.hibernate;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Stu s1 = new Stu();
		s1.setName("kjg");
		s1.setEmail("s1@qq.com");

		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();

		//����
		session.save(s1);
		session.beginTransaction().commit();
//		��ѯ
		Stu s2 = (Stu) session.get(Stu.class, 1);
		System.out.println(s2.toString());
		//�޸�
		s2.setName("����");
		session.beginTransaction().commit();
//		ɾ��
		session.delete(s2);
		session.beginTransaction().commit();
		
		session.close();
	}
}