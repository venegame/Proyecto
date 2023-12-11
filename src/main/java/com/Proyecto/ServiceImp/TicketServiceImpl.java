/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.ServiceImp;

import com.Proyecto.Controller.dao.TicketDao;
import com.Proyecto.Service.TicketService;
import com.Proyecto.domain.Ticket;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Me
 */
@Service
public class TicketServiceImpl implements TicketService{
    
    @Autowired
    private TicketDao ticketDao;

    @Override
    public List<Ticket> getTickets() {
        List <Ticket> tickets = ticketDao.findAll();
        return tickets; 
    }

    @Override
    public Ticket getTicket(Ticket ticket) {
        return ticketDao.findById(ticket.getIdTicket()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Ticket ticket) {
        ticketDao.save(ticket);
    }

    @Override
    @Transactional
    public void delete(Ticket ticket) {
        ticketDao.delete(ticket);
    }

}
