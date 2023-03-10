package newyear.avi;

import java.util.*;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
			skill s1 = new skill();
			skill s2 = new skill();
			skill s3 = new skill();
			skill s4 = new skill();

			List<skill> skills1 = new ArrayList<skill>();
			skills1.add(s1);
			skills1.add(s2);
			List<skill> skills2 = new ArrayList<skill>();
			skills2.add(s3);
			skills2.add(s4);

			fresher f1 = new fresher(1, "virat", skills1);
			fresher f2 = new fresher(2, "anushka", skills2);

			s1.setS_id(101);
			s1.setS_name("java");
			s1.setF(f1);
			

			s2.setS_id(202);
			s2.setS_name("python");
			s2.setF(f1);

			s3.setS_id(303);
			s3.setS_name("html");
			s3.setF(f2);

			s4.setS_id(404);
			s4.setS_name("sql");
			s4.setF(f2);

			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory f = cfg.buildSessionFactory();
			Session sses = f.openSession();
			Transaction tx = sses.beginTransaction();
			sses.save(f1);
			sses.save(f2);
			sses.save(s1);
			
			
			sses.save(s2);
			sses.save(s3);
			sses.save(s4);
			tx.commit();
		} 

	
}
