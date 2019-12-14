package com.csi.jpacriateria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Services {
	static SessionFactory factory;

	public static void main(String[] args) {
		factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setEmpName("Varsha");
		e1.setEmpSalary(45000.00);

		session.save(e1);
		List list=session.createQuery("from Employee").list();
		list.forEach(a->System.out.println(list));
		transaction.commit();
		
		
	}

}
