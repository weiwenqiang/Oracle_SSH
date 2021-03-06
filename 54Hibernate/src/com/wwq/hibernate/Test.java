package com.wwq.hibernate;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();

		Session sess = sf.openSession();
		Transaction tx = null;
		try {
			tx = sess.beginTransaction();

			PersonKey pk = new PersonKey();
			pk.setFirstname("abc");
			pk.setLastname("xyz");
			
			Person p = (Person) sess.get(Person.class, pk);
			System.out.println(p.toString());
			
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
