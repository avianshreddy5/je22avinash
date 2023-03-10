package com.p;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		// Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		// System.out.println(factory);
//    }
		//Teacher t = new Teacher(111, "deep", "java");
		//Teacher t = new Teacher(222, "blessina", "python");
		Teacher t = new Teacher(444, "kavya", "selenium");

		Session sess = factory.openSession();

		Transaction tx = sess.beginTransaction();
		sess.save(t);
		tx.commit();

	}
}
