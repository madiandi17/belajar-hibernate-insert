
package com.wordpress.bmadi.belajar.hibernate.insert.main;

import com.wordpress.bmadi.belajar.hibernate.insert.model.Employee;
import com.wordpress.bmadi.belajar.hibernate.insert.model.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainHibernate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        Employee andi = new Employee();
        andi.setFirstName("Madi");
        andi.setLastName("Andi");
        andi.setEmail("madiandi@gmail.com");
        session.save(andi);
        
        session.getTransaction().commit();
        session.close();
    }
    
}
