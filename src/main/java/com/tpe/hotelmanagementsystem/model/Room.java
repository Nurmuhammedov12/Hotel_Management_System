package com.tpe.hotelmanagementsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_rooms")
public class Room {
    @Id
    private Long id;
    @Column(nullable = false)
    private int capacity;
    @Column(nullable = false)
    private String number;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    public Room() {
    }

    public Room(Long id, int capacity, String number, Hotel hotel) {
        this.id = id;
        this.capacity = capacity;
        this.number = number;
        this.hotel = hotel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", number=" + number +
                ", hotel=" + hotel +
                '}';
    }
}
