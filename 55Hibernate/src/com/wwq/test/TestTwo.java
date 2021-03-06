package com.wwq.test;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wwq.hibernate.one.Address;
import com.wwq.hibernate.one.PersonOne;
import com.wwq.hibernate.two.Card;
import com.wwq.hibernate.two.PersonTwo;

public class TestTwo {
	public static void main(String[] args) throws Exception {
		PersonTwo person2 = new PersonTwo();
		person2.setName("赵敏");
		Card card = new Card();
		card.setNo("1111111");
		card.setPerson(person2);
		person2.setCard(card);
		
		PersonTwo person3 = new PersonTwo();
		person3.setName("周芷若");
		Card card3 = new Card();
		card3.setNo("88888888");
		card3.setPerson(person3);
		person3.setCard(card3);
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();

		Session sess = sf.openSession();
		Transaction tx = null;
		try {
			tx = sess.beginTransaction();

			/**
			 * 因为做了级联关系，所以这里只需要保存一个对象，关联对象将自动插入
			 */
			sess.save(card);
			sess.save(person3);
			
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
