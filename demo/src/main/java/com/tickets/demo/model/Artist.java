package com.tickets.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {
    @Id
    @SequenceGenerator(name = "artist_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "artist_seq")
    private long id;
    private String name;

    @ManyToMany(mappedBy = "artists")
    private Set<Venue> venues = new HashSet<>();

    @OneToMany(mappedBy = "artists")
    private Set<Song> songs = new HashSet<>();

    @ManyToMany(mappedBy = "artists")
    private Set<Ticket> tickets = new HashSet<>();

    public Artist(String name) {
        this.name = name;
    }

    public Artist() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
