package com.tpe.hotelmanagementsystem.repository;

import com.tpe.hotelmanagementsystem.config.HibernateUtils;
import com.tpe.hotelmanagementsystem.exception.HotelNotFoundException;
import com.tpe.hotelmanagementsystem.model.Hotel;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

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

    @Override
    public void deleteHotel(Long id) {
        try(Session session = HibernateUtils.getSessionfactory().openSession()){
            Transaction tr = session.beginTransaction();
            Hotel hotelidToDelete = session.get(Hotel.class, id);
            if (hotelidToDelete != null){
                session.delete(hotelidToDelete);
                tr.commit();
            }else{
                throw new HotelNotFoundException("Hotel id not found!");
            }
        }catch (HotelNotFoundException e){
            e.getMessage();
        }
    }

    @Override
    public List<Hotel> finAllHotel() {
        return null;
    }
}
