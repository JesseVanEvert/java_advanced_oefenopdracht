package com.tickets.demo.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Venue {
    @Id
    @SequenceGenerator(name = "venue_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venue_seq")
    private long id;
    private String streetName;
    private String streetNumber;
    private String postcode;

    @OneToMany(mappedBy = "venues")
    private Set<Ticket> tickets = new HashSet<>();

    public Venue(String streetName, String streetNumber, String postcode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postcode = postcode;
    }

    public Venue() {

    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
