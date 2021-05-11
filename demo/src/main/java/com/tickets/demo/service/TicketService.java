package com.tickets.demo.service;

import com.tickets.demo.model.Ticket;
import com.tickets.demo.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private TicketRepository ticketRepository;

    public List<Ticket> getAllTickets(){
        return (List<Ticket>) ticketRepository.findAll();
    }
}
