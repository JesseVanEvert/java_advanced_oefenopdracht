package com.tickets.demo.model;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @SequenceGenerator(name = "song_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "song_seq")
    private long id;
    private String name;
    private double durationInMinutes;

    @ManyToOne
    private Artist artist;

    public Song(String name, double durationInMinutes) {
        this.name = name;
        this.durationInMinutes = durationInMinutes;
    }

    public Song() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
