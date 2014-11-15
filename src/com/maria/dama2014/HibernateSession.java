/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014;

import com.maria.dama2014.db.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Maria
 */
public class HibernateSession {
    
    private static SessionFactory sessionFactory;

    public HibernateSession() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    public static Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    
}
