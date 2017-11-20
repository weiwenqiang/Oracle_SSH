package com.wwq.hibernate;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
	public static void main(String[] args) throws Exception {
		
		Classroom c1 = new Classroom();
		c1.setStuSet(new HashSet<Student>());
		c1.setClass_name("高二");
		
		Student s1 = new Student();
		s1.setStu_name("张无忌");
		s1.setClass_id(c1.getId());
		s1.setClassroom(c1);
		
		Student s2 = new Student();
		s2.setStu_name("周芷若");
		s2.setClass_id(c1.getId());
		s2.setClassroom(c1);
		
		c1.getStuSet().add(s1);
		c1.getStuSet().add(s2);
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();

		Session sess = sf.openSession();
		Transaction tx = null;
		try {
			tx = sess.beginTransaction();

			sess.save(c1);
			
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			sess.close();
		}
	}
}
