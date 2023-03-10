package newyear.manytomany;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Trainer t1 = new Trainer();
		Trainer t2 = new Trainer();
		Trainer t3 = new Trainer();
		Trainer t4 = new Trainer();
		

		List<Trainer> tlist1 = new ArrayList<Trainer>();
		tlist1.add(t1);
		tlist1.add(t2);
		List<Trainer> tlist2 = new ArrayList<Trainer>();
		tlist2.add(t2);
		List<Trainer> tlist3 = new ArrayList<Trainer>();
		tlist3.add(t1);
		tlist3.add(t3);
		List<Trainer> tlist4 = new ArrayList<Trainer>();
		tlist4.add(t3);
		List<Trainer> tlist5 = new ArrayList<Trainer>();
		tlist5.add(t1);
		tlist5.add(t4);
		List<Trainer> tlist6 = new ArrayList<Trainer>();
		tlist6.add(t1);
		tlist6.add(t4);

		Subjects s1 = new Subjects(101, "java", tlist1);
		Subjects s2 = new Subjects(102, "python", tlist2);
		Subjects s3 = new Subjects(103, "sql", tlist3);
		Subjects s4 = new Subjects(104, "web", tlist4);
		Subjects s5 = new Subjects(105, "apti", tlist5);
		Subjects s6 = new Subjects(106, "testing", tlist6);

		List<Subjects> slist1 = new ArrayList<Subjects>();
		slist1.add(s1);
		slist1.add(s3);
		slist1.add(s5);

		List<Subjects> slist2 = new ArrayList<Subjects>();
		slist2.add(s1);
		slist2.add(s2);
		slist2.add(s6);

		List<Subjects> slist3 = new ArrayList<Subjects>();
		slist3.add(s3);
		slist3.add(s4);

		List<Subjects> slist4 = new ArrayList<Subjects>();
		slist4.add(s5);
		slist4.add(s6);

		t1.setT_id(1);
		t1.setS_name("punith sir");
		t1.setSub(slist1);

		t2.setT_id(2);
		t2.setS_name("ayush sir");
		t2.setSub(slist2);

		t3.setT_id(3);
		t3.setS_name("blessina mam");
		t3.setSub(slist3);

		t4.setT_id(4);
		t4.setS_name("kushar sir");
		t4.setSub(slist4);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory f = cfg.buildSessionFactory();
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		s.save(s5);
		s.save(s6);

		s.save(t1);
		s.save(t2);
		s.save(t3);
		s.save(t4);
		tx.commit();

	}
}
