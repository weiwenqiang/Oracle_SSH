package com.wwq.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import javax.imageio.stream.FileImageInputStream;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wwq.hibernate.image.Image;
import com.wwq.hibernate.one.Address;

public class ImageTest {
	public static void main(String[] args) throws Exception {
		Image img = new Image();
		img.setDate(new Date());
		img.setFile(Hibernate.createBlob(new FileInputStream("L:/a.jpg")));
		img.setText(Hibernate.createClob("fdsajlk"));
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();

		Session sess = sf.openSession();
		Transaction tx = null;
		try {
			tx = sess.beginTransaction();

			sess.save(img);
			
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
