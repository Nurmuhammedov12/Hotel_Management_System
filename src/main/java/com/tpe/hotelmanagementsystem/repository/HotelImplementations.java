package com.tpe.hotelmanagementsystem.repository;

import com.tpe.hotelmanagementsystem.model.Hotel;

import java.util.List;

public interface HotelImplementations {
   Hotel createHotel(Hotel hotel);
   Hotel findHotelById(Long id);

   void deleteHotel(Long id);

   List<Hotel> finAllHotel();

   void updateHotel(Hotel hotel);

}
