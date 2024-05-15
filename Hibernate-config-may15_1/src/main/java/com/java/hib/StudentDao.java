package com.java.hib;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDao {
    
    public void saveStudent(Student stud) {
        Transaction trans = null;
        Session session = null;
        
        try {
            session = HibernateConnection.getSessionFactory().openSession();
            trans = session.beginTransaction();
            session.save(stud);
            trans.commit();
        } catch (Exception e) {
            if (trans != null) {
                trans.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
