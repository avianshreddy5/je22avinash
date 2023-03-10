package newyear.laptop;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		laptop1 l1 = new laptop1(111, "hcl", 30000);
		laptop1 l2 = new laptop1(222, "hp", 35000);
		laptop1 l3 = new laptop1(333, "dell", 4000);
		laptop1 l4 = new laptop1(444, "lenovo", 45000);
		laptop1 l5 = new laptop1(555, "sony", 50000);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory f = cfg.buildSessionFactory();
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(l1);
		s.save(l2);
		s.save(l3);
		s.save(l4);
		s.save(l5);
		tx.commit();

	}
}
