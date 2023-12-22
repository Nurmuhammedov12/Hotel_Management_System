package com.tpe.hotelmanagementsystem.service;

import com.tpe.hotelmanagementsystem.model.Adress;
import com.tpe.hotelmanagementsystem.model.Guest;
import com.tpe.hotelmanagementsystem.repository.GuestRepository;

import java.util.Scanner;

public class GuestServiceImpl implements GuestService {

    private Scanner scanner;
    private final GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public Guest saveGuest() {
        scanner=new Scanner(System.in);

        Guest guest = new Guest();
        System.out.println("Please enter guest name: ");
        guest.setName(scanner.nextLine());


        Adress adress = new Adress();
        System.out.println("Please enter guest Street: ");
        adress.setStreet(scanner.nextLine());

        System.out.println("Please enter guest city: ");
        adress.setStreet(scanner.nextLine());

        System.out.println("Please enter guest Country: ");
        adress.setStreet(scanner.nextLine());

        System.out.println("Please enter guest ZipCode: ");
        adress.setStreet(scanner.nextLine());


        guest.setAdress(adress);

        guestRepository.saveGuest(guest);

        System.out.println("Guest successfully saved.");

        return guest;
    }
}
