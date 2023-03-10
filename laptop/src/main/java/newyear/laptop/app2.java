package newyear.laptop;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class app2 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory f = cfg.buildSessionFactory();
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
//		laptop1 l = s.get(laptop1.class, 111);
//		System.out.println(l);

		java.util.List list = s.createQuery("From laptop1").getResultList();
		for (Object c : list) {
			System.out.println(c);
		}

		tx.commit();

	}

}
