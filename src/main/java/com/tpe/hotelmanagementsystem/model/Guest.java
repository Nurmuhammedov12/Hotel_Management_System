package com.tpe.hotelmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_guests")
public class Guest {
    @Id
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(name = "contact information", nullable = false)
    private String contact_information;

    public Guest() {
    }

    public Guest(Long id, String name, String contact_information) {
        this.id = id;
        this.name = name;
        this.contact_information = contact_information;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_information() {
        return contact_information;
    }

    public void setContact_information(String contact_information) {
        this.contact_information = contact_information;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact_information='" + contact_information + '\'' +
                '}';
    }
}
