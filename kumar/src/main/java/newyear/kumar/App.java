package newyear.kumar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		// creating objects to be solved

		bike b1 = new bike();
		bike b2 = new bike();
		bike b3 = new bike();

		Student s1 = new Student(111, "rohit", b1);
		Student s2 = new Student(222, "virat", b2);
		Student s3 = new Student(333, "jadeja", b3);
		b1.setI_d(1001);
		b1.setName("yamaha");
		b1.setSt(s1);

		b2.setI_d(1002);
		b2.setName("bmw");
		b2.setSt(s2);

		b3.setI_d(1003);
		b3.setName("honda");
		b3.setSt(s3);
//hirenate code
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory f = cfg.buildSessionFactory();
		Session sses = f.openSession();
		Transaction tx = sses.beginTransaction();
		sses.save(s1);
		sses.save(s2);
		sses.save(s3);
		sses.save(b1);
		sses.save(b2);
		sses.save(b3);
		tx.commit();

	}
}
