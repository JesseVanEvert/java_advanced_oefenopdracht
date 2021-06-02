package com.tickets.demo.controller;

import com.tickets.demo.model.Venue;
import com.tickets.demo.service.VenueService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/venues")
public class VenueController {
    private VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }

    @RequestMapping(
            value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<Venue>> getAllVenues(){
        List<Venue> venues = venueService.getAllVenues();
        return ResponseEntity
                .status(200)
                .body(venues);
    }
}
