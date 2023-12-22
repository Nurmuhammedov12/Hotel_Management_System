package com.tpe.hotelmanagementsystem.repository;

import com.tpe.hotelmanagementsystem.config.HibernateUtils;
import com.tpe.hotelmanagementsystem.model.Room;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RoomRepositoryImpl implements RoomRepository{
    @Override
    public Room saveRoom(Room room) {
      try{
          Session session = HibernateUtils.getSessionfactory().openSession();
          Transaction tr = session.beginTransaction();
          session.save(room);
          tr.commit();
          return room;
      }catch (Exception e){
          e.printStackTrace();
          return null;
      }
    }
}
