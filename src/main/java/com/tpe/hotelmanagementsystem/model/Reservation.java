package com.tpe.hotelmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tbl_reservations")
public class Reservation {
    @Id
    private Long id;
    private Date checkindate;
    private Date checkoutdate;

    public Reservation() {
    }

    public Reservation(Long id, Date checkindate, Date checkoutdate) {
        this.id = id;
        this.checkindate = checkindate;
        this.checkoutdate = checkoutdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    public Date getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", checkindate=" + checkindate +
                ", checkoutdate=" + checkoutdate +
                '}';
    }
}
