package com.wwq.hibernate2;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMoreToMore {
	public static void main(String[] args) throws Exception {

		Sports s = new Sports();
		s.setPlayerSet(new HashSet<Player>());
		s.setSports_name("µ˚”æ4");
		Sports ss= new Sports();
		ss.setSports_name("Õ‹”æ4");
		ss.setPlayerSet(new HashSet<Player>());
		
		
		Player p = new Player();
		p.setSportsSet(new HashSet<Sports>());
		p.setPlayer_name("∑∆∂˚∆’Àπ4");
		Player pp = new Player();
		pp.setSportsSet(new HashSet<Sports>());
		pp.setPlayer_name("obama4");
		
		p.getSportsSet().add(s);
		p.getSportsSet().add(ss);
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();

		Session sess = sf.openSession();
		Transaction tx = null;
		try {
			tx = sess.beginTransaction();

			sess.save(p);

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
