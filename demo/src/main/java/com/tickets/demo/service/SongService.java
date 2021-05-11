package com.tickets.demo.service;

import com.tickets.demo.model.Song;
import com.tickets.demo.repository.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    private SongRepository songRepository;
    
    public List<Song> getAllSongs(){
         return (List<Song>) songRepository.findAll();
    }
}
