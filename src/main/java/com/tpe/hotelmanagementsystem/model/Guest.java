package com.tpe.hotelmanagementsystem.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_guests")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    @Column(name = "full_name", nullable = false, length = 25)
   private String name;

    @Embedded
    private Adress adress;

    private LocalDateTime createDate;

    @PrePersist
    public void prePersist(){
        createDate = LocalDateTime.now();
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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                ", createDate=" + createDate +
                '}';
    }
}
