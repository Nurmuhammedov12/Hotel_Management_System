package com.tpe.hotelmanagementsystem.repository;

import com.tpe.hotelmanagementsystem.config.HibernateUtils;
import com.tpe.hotelmanagementsystem.model.Hotel;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HotelRepository implements HotelImplementations{

    @Override
    public Hotel createHotel(Hotel hotel) {
            try(Session session = HibernateUtils.getSessionfactory().openSession()){
                Transaction tr = session.beginTransaction();
                session.save(hotel);
                tr.commit();
                return hotel;
            }catch(Exception e){
                e.printStackTrace();
                return null;
            }
    }

    @Override
    public Hotel findHotelById(Long id) {
        Session session = HibernateUtils.getSessionfactory().openSession();
        return session.get(Hotel.class, id);
    }
}
