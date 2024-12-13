package com.da.andres;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.logging.Level;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Geography!");

        @SuppressWarnings("unused")
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger("org.hibernate");
        logger.setLevel(Level.SEVERE);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        if (session != null) {
            System.out.println("Session successfully opened!");
        } else {
            System.out.println("Error opening session!");
        }

        listCities(session);
        session.close();

    }
    public static void listCities(Session session){
        Query<City> myQuery = session.createQuery("from com.da.andres.City");
        List<City> citiesList = myQuery.list();

        for ( City city : citiesList ) {
            System.out.printf("Name: %s Id: %d\n", city.getName(), city.getId());
        }
    }
}
