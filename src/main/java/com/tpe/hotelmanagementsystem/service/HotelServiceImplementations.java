package com.tpe.hotelmanagementsystem.service;

import com.tpe.hotelmanagementsystem.model.Hotel;

public interface HotelServiceImplementations {
    Hotel createHotel();
    Hotel findHotelById(Long id);
}
