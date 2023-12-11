/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Proyecto.Controller;

import com.Proyecto.Service.ComentariosService;
import com.Proyecto.Service.TicketService;
import com.Proyecto.ServiceImp.FirebaseStorageServiceImpl;
import com.Proyecto.domain.Comentarios;
import com.Proyecto.domain.Ticket;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Me
 */
@Controller
@RequestMapping("/tickets")
public class TicketsController {
    
    @Autowired
    private TicketService ticketService;
    
    @Autowired
    private ComentariosService comentarioService;
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @GetMapping("/listado")
    public String tickets(Model model) {

        List<Ticket> listadoTickets = ticketService.getTickets();
        List<Comentarios> listadoComentarios = comentarioService.getComentarios();
        model.addAttribute("comentarios", listadoComentarios);
        model.addAttribute("tickets", listadoTickets);
        return "/tickets/listado";
    }
    
    @GetMapping("/detallesTicket/{idTicket}")
    public String detallesTicket(Ticket ticket, Model model){
        ticket = ticketService.getTicket(ticket);
        List<Comentarios> comentarios = comentarioService.getComentarios();
        model.addAttribute("ticket", ticket);
        model.addAttribute("comentarios", comentarios);
        return "/tickets/detallesticket";
    }
    
    @GetMapping("/comentarios/{idTicket}")
    public String comentarioNuevo(Comentarios comentarios) {
        return "/tickets/comentarios";
    }
    
    @PostMapping("/comentarios/guardar")
    public String ComentarioGuardar(Comentarios comentarios,
            @RequestParam("imagenFile") MultipartFile imagenFile) {
        if (!imagenFile.isEmpty()) {
            comentarioService.save(comentarios);
            comentarios.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile,
                            "comentarios",
                            comentarios.getIdTicketComentario()));
        }
        comentarioService.save(comentarios);
        return "redirect:/tickets/detallesTicket/" + comentarios.getIdTicket();
    }
}
