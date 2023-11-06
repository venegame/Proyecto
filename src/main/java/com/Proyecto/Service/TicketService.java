/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.Service;

import com.Proyecto.domain.Ticket;
import java.util.List;
/**
 *
 * @author Me
 */
public interface TicketService {
    public List<Ticket> getTickets();
    public Ticket getTicket(Ticket ticket);
    public void save(Ticket ticket);
    public void delete(Ticket ticket);
}
