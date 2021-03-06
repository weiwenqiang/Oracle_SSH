package com.wwq.test;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wwq.hibernate.one.Address;
import com.wwq.hibernate.one.PersonOne;

public class TestOne {
	public static void main(String[] args) throws Exception {
		Address address = new Address();
		address.setAddress("��ɳ��ɳ");
		address.setCity("����");
		address.setCode("100854");
		address.setStreet("weagsdga");
		PersonOne person1 = new PersonOne();
		person1.setAddress(address);
		person1.setName("���޼�");
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();

		Session sess = sf.openSession();
		Transaction tx = null;
		try {
			tx = sess.beginTransaction();

			sess.save(person1);
			
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
