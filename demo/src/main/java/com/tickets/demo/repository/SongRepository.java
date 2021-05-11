package com.tickets.demo.repository;

import com.tickets.demo.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Long> {
}
