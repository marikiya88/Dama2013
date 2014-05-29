/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maria.dama2014;

import com.maria.dama2014.db.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Maria
 */
public class HibernateSession {
    
    private static Session session;

    public HibernateSession() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public static Session getSession(){
        return session;
    }
    
    
}
