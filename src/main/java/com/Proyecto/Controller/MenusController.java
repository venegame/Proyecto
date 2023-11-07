package com.Proyecto.controller;

import com.Proyecto.Service.PerfilService;
import com.Proyecto.Service.TicketService;
import com.Proyecto.domain.Perfil;
import com.Proyecto.domain.Ticket;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menus")
public class MenusController {

    @Autowired
    private PerfilService perfilService;

    @Autowired
    private TicketService ticketService;

    @GetMapping("/perfil")
    public String perfil(Model model) {

        //List<Perfil> listadoPerfiles = perfilService.getPerfiles(true);
        //model.addAttribute("perfiles", listadoPerfiles);
        return "menus/perfil";
    }

    @GetMapping("/tickets")
    public String tickets(Model model) {

        List<Ticket> listadoTickets = ticketService.getTickets();
        model.addAttribute("tickets", listadoTickets);
        return "/menus/tickets";
    }

    @GetMapping("/crearTiquete")
    public String crarTiquete(Model model) {

        //List<Perfil> listadoPerfiles = perfilService.getPerfiles(true);
        //model.addAttribute("perfiles", listadoPerfiles);
        return "menus/crearTiquete";
    }

    @GetMapping("/notificaciones")
    public String notificaciones(Model model) {

        return "menus/notificaciones";
    }

    @GetMapping("/registro")
    public String registro(Model model) {

        return "menus/registro";
    }
}
