package com.tickets.demo.configuration;

import com.tickets.demo.repository.ArtistRepository;
import com.tickets.demo.repository.SongRepository;
import com.tickets.demo.repository.TicketRepository;
import com.tickets.demo.repository.VenueRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements ApplicationRunner {
    private ArtistRepository artistRepository;
    private SongRepository songRepository;
    private TicketRepository ticketRepository;
    private VenueRepository venueRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
