package com.tickets.demo.model;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @SequenceGenerator(name = "ticket_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_seq")
    private long id;
    private String name;
    private String price;

    @ManyToOne
    private Venue venue;

    public Ticket(long id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Ticket() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
