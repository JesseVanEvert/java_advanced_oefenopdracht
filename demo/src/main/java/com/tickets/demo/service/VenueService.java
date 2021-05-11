package com.tickets.demo.service;

import com.tickets.demo.model.Venue;
import com.tickets.demo.repository.VenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueService {
    private VenueRepository venueRepository;

    public List<Venue> getAllVenues(){
        return (List<Venue>) this.venueRepository.findAll();
    }
}
