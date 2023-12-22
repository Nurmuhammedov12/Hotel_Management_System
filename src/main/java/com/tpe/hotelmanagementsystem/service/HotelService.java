package com.tpe.hotelmanagementsystem.service;

import com.tpe.hotelmanagementsystem.exception.HotelNotFoundException;
import com.tpe.hotelmanagementsystem.model.Hotel;
import com.tpe.hotelmanagementsystem.repository.HotelImplementations;
import org.hibernate.Session;

import java.util.List;
import java.util.Scanner;

public class HotelService implements HotelServiceImplementations{

    private static Scanner scanner;

    private final HotelImplementations hotelrepository;

    public HotelService(HotelImplementations hotelrepository) {
        this.hotelrepository = hotelrepository;
    }

    @Override
    public Hotel createHotel() {
        scanner = new Scanner(System.in);

        Hotel hotel = new Hotel();

        System.out.println("Please enter Hotel id: ");
        hotel.setId(scanner.nextLong());
        scanner.nextLine();

        System.out.println("Enter Hotel name:");
        hotel.setName(scanner.nextLine());

        System.out.println("Enter Location: ");
        hotel.setLocation(scanner.nextLine());

        hotelrepository.createHotel(hotel);
        System.out.println("Hotel Createt with id: " + hotel.getId());
        return hotel;
    }

    @Override
    public Hotel findHotelById(Long id) {

        try{
            Hotel hotelFound = hotelrepository.findHotelById(id);
            if (hotelFound !=null){
                System.out.println(hotelFound);
                return hotelFound;
            }else{
                throw new HotelNotFoundException("Hotel didn't found");
            }
        }catch (HotelNotFoundException e){
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public void deleteHotel(Long id) {
        scanner = new Scanner(System.in);
            Hotel hotelidToDelete = hotelrepository.findHotelById(id);
            if (hotelidToDelete == null){
                throw  new HotelNotFoundException("Hotel Id Not Found");
            }
            System.out.println("Do you really want to delete this hotel: " + hotelidToDelete.getId() + " Y/N");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("Y")){
                hotelrepository.deleteHotel(id);
                System.out.println("Hotel deleted");
            }else {
                System.out.println("Canceled");
            }

    }

    @Override
    public List<Hotel> finAllHotel() {
       try{
           List<Hotel> hotels =  hotelrepository.finAllHotel();
           if(!hotels.isEmpty()){
               for (Hotel hotel:hotels){
                   System.out.println(hotel);
               }
           }else System.out.println("Hotel List is empty :(");
           return hotels;
       }catch (Exception e){
           System.out.println("Error in Hotel List");
           return null;
       }
    }

    @Override
    public void updateHotel(Long id, Hotel updatehotel) {
        try {
            Hotel existHotel = hotelrepository.findHotelById(id);
            if (existHotel == null){
                throw new HotelNotFoundException("Hotel id fatal");
            }

            existHotel.setName(updatehotel.getName());
            existHotel.setLocation(updatehotel.getLocation());
           hotelrepository.updateHotel(existHotel);
        }catch (HotelNotFoundException e){
            System.out.println(e.getMessage());
        }
    }


}
