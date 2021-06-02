package com.tickets.demo.controller;

import com.tickets.demo.model.Song;
import com.tickets.demo.service.SongService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping
public class SongController {

    private SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping(
            value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<List<Song>> getAllSongs(){
        List<Song> songs = songService.getAllSongs();
        return ResponseEntity
                .status(200)
                .body(songs);
    }
}
