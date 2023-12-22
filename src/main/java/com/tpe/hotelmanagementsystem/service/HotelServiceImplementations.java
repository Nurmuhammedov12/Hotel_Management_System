package com.tpe.hotelmanagementsystem.service;

import com.tpe.hotelmanagementsystem.model.Hotel;

import java.util.List;

public interface HotelServiceImplementations {
    Hotel createHotel();
    Hotel findHotelById(Long id);

    void deleteHotel(Long id);
    List<Hotel> finAllHotel();

    void updateHotel(Long id, Hotel updatehotel);
}
