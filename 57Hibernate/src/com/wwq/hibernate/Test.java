package com.wwq.hibernate;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) throws Exception {
		Manager m = new Manager();
		m.setName("������");
		m.setSex("��");
		m.setManager_has("manager_has");
		
		Normal n = new Normal();
		n.setName("����Ů");
		n.setSex("Ů");
		n.setNormal_has("normal_has");
			
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();

		Session sess = sf.openSession();
		Transaction tx = null;
		try {
			tx = sess.beginTransaction();

			sess.save(m);
			sess.save(n);

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
