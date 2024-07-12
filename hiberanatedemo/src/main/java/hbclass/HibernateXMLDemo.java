package hbclass;

import org.hibernate.*;
import org.hibernate.cfg.*;



public class HibernateXMLDemo {
	
	public static void main(String[] args) {
		
		Student st=new Student();
		
		st.setRollno("st-2");
		st.setStname("abc");
		st.setRank(3);
		st.setMark(96.17);
		
		Configuration con=new Configuration();
		con.configure("nandha.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction t=ses.beginTransaction();
		
		ses.persist(st);
		
		
		t.commit();
		ses.close();
		sf.close();
		
		
		System.out.println("Success");
		
	}

}