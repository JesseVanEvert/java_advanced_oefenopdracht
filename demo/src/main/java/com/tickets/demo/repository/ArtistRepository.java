package com.tickets.demo.repository;

import com.tickets.demo.model.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {

}
