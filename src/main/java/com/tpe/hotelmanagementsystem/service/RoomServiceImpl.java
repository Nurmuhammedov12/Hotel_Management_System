package com.tpe.hotelmanagementsystem.service;

import com.tpe.hotelmanagementsystem.exception.HotelNotFoundException;
import com.tpe.hotelmanagementsystem.model.Hotel;
import com.tpe.hotelmanagementsystem.model.Room;
import com.tpe.hotelmanagementsystem.repository.HotelImplementations;
import com.tpe.hotelmanagementsystem.repository.HotelRepository;
import com.tpe.hotelmanagementsystem.repository.RoomRepository;

import java.util.Scanner;

public class RoomServiceImpl implements RoomService{

    private static Scanner scanner;

    private final RoomRepository roomRepository;
    private final HotelImplementations hotelRepository;

    public RoomServiceImpl(RoomRepository roomRepository, HotelImplementations hotelRepository) {
        this.roomRepository = roomRepository;
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Room saveRoom() {
        scanner = new Scanner(System.in);

        Room room = new Room();
        System.out.println("Please enter room id: ");
        room.setId(scanner.nextLong());
        scanner.nextLine();
        System.out.println("Enter Room number:");
        room.setNumber(scanner.nextLine());
        System.out.println("Enter the capacity: ");
        room.setCapacity(scanner.nextInt());
        scanner.nextLine();


        System.out.println("Enter hotel Id: ");
        Long hotelId = scanner.nextLong();
        scanner.nextLine();

        try {
            Hotel existHotel = hotelRepository.findHotelById(hotelId);
            if (existHotel == null ){
                throw new HotelNotFoundException("Hotel not found");
            }

            room.setHotel(existHotel);
            Room savedRoom = roomRepository.saveRoom(room);
            existHotel.getRooms().add(savedRoom);
            System.out.println("Room saved successfully.");
        }catch (HotelNotFoundException e){
            System.out.println(e.getMessage());
        }

        return room;
    }
}
