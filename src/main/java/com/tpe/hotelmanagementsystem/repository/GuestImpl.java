package com.tpe.hotelmanagementsystem.repository;

import com.tpe.hotelmanagementsystem.config.HibernateUtils;
import com.tpe.hotelmanagementsystem.model.Adress;
import com.tpe.hotelmanagementsystem.model.Guest;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GuestImpl implements GuestRepository{
    @Override
    public void saveGuest(Guest guest) {
        try {
            Session session = HibernateUtils.getSessionfactory().openSession();
            Transaction tr = session.beginTransaction();


            Adress adress = new Adress();
            adress.setStreet(guest.getAdress().getStreet());
            adress.setCity(guest.getAdress().getCity());
            adress.setCountry(guest.getAdress().getCountry());
            adress.setZipCode(guest.getAdress().getZipCode());

            guest.setAdress(adress);
            session.save(guest);
            tr.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
