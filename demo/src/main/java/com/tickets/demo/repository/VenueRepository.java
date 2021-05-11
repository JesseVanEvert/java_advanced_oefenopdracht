package com.tickets.demo.repository;

import com.tickets.demo.model.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Long> {
}
