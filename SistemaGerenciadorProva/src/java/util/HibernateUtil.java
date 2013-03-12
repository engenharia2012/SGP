/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Avell
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory ;
    private static Session session;
       
    static {   
        try {   
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();   
               
        } catch (Throwable ex) {   
            // Log exception!   
            throw new ExceptionInInitializerError(ex);   
        }   
    }   
       
    public static Session getSession() throws HibernateException {   
    
            session = sessionFactory.getCurrentSession();

         return session;
    }
    
}
