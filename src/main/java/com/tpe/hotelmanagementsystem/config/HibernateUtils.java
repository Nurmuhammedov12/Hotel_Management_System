package com.tpe.hotelmanagementsystem.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    public static final SessionFactory sessionfactory;

    static {
        try{
            Configuration con = new Configuration().configure("hibernate.cfg.xml");
            sessionfactory = con.buildSessionFactory();
        }catch (Throwable e){
            throw  new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionfactory(){
    return  sessionfactory;
    }

    public static void ShutDown(){
        getSessionfactory().close();
    }

    public static void closeSession(Session session){
        if (session != null && session.isOpen()){
            session.close();
        }
    }


}
