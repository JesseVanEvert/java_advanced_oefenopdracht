package com.tickets.demo.service;

import com.tickets.demo.model.Artist;
import com.tickets.demo.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists(){
        return (List<Artist>) artistRepository.findAll();
    }
}
