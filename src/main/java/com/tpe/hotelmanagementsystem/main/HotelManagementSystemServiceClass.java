package com.tpe.hotelmanagementsystem.main;

import com.tpe.hotelmanagementsystem.repository.HotelImplementations;
import com.tpe.hotelmanagementsystem.repository.HotelRepository;
import com.tpe.hotelmanagementsystem.service.HotelService;
import com.tpe.hotelmanagementsystem.service.HotelServiceImplementations;

import java.util.Scanner;


public class HotelManagementSystemServiceClass {
    private static Scanner scanner;

   static HotelImplementations hotelRepository = new HotelRepository();
   static HotelServiceImplementations hotelService = new HotelService(hotelRepository);

    public static void displayHotelManagementSystemMenu(){
        boolean exit = false;
        scanner = new Scanner(System.in);
        while(!exit)
        {
            System.out.println("Please select an option:");
            System.out.println("1. Hotel Operations");
            System.out.println("2. Room Operations");
            System.out.println("3. Guest Operations");
            System.out.println("4. Reservation Operations");
            System.out.println("5. Exit");
            System.out.println("Enter the number corresponding to your choice: [1-5]");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayHotelOperations(hotelService);
                    break;

                case 2:
                    displayRoomOperations();
                    break;
                case 3:
                    displayGuestsOperations();
                    break;
                case 4:
                    displayReservationOperations();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Invalid number.");
                    break;
            }
    }
    }


    private static void displayHotelOperations(HotelServiceImplementations hotelService){
        boolean exit = false;
        scanner = new Scanner(System.in);
        while(!exit)
        {
            System.out.println("Hotel Operations");
            System.out.println("1. Add a new hotel");
            System.out.println("2. Find a hotel by ID");
            System.out.println("3. Update a hotel");
            System.out.println("4. Delete a hotel");
            System.out.println("5. View all hotels");
            System.out.println("6. Exit");
            System.out.println("Enter the number corresponding to your choice: [1-5]");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotelService.createHotel();
                    break;

                case 2:
                    System.out.println("Enter Hotel id: ");
                Long Hotelid = scanner.nextLong();
                hotelService.findHotelById(Hotelid);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid number.");
                    break;
            }
        }

    }
    private static void displayRoomOperations(){
        boolean exit = false;
        scanner = new Scanner(System.in);
        while(!exit)
        {
            System.out.println("Room Operations");
            System.out.println("1. Add a new room");
            System.out.println("2. Find a room by ID");
            System.out.println("3. Update a room");
            System.out.println("4. Delete a room");
            System.out.println("5. View all rooms");
            System.out.println("6. Exit");
            System.out.println("Enter the number corresponding to your choice: [1-5]");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid number.");
                    break;
            }
        }

    }
    private static void displayGuestsOperations(){
        boolean exit = false;
        scanner = new Scanner(System.in);
        while(!exit)
        {
            System.out.println("Guest Operations");
            System.out.println("1. Add a new guest");
            System.out.println("2. Find a guest by ID");
            System.out.println("3. Update a guest");
            System.out.println("4. Delete a guest");
            System.out.println("5. View all guests");
            System.out.println("6. Exit");
            System.out.println("Enter the number corresponding to your choice: [1-5]");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid number.");
                    break;
            }
        }
    }
    private static void  displayReservationOperations(){
        boolean exit = false;
        scanner = new Scanner(System.in);
        while(!exit)
        {
            System.out.println("Reservation Operations");
            System.out.println("1. Add a new reservation");
            System.out.println("2. Find a reservation by ID");
            System.out.println("3. Update a reservation");
            System.out.println("4. Delete a reservation");
            System.out.println("5. View all reservations");
            System.out.println("6. Exit");
            System.out.println("Enter the number corresponding to your choice: [1-5]");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    exit = true;
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Invalid number.");
                    break;
            }
        }
    }

        }

