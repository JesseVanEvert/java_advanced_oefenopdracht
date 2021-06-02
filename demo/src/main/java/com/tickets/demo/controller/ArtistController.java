package com.tickets.demo.controller;

import com.tickets.demo.model.Artist;
import com.tickets.demo.service.ArtistService;
import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import java.awt.*;

@Controller
@RequestMapping(value = "/artists")
public class ArtistController {

    private ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @RequestMapping(
            value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<Artist>> getAllArtists(){
        List<Artist> artists = artistService.getAllArtists();
        return ResponseEntity
                .status(200)
                .body(artists);
    }
}
