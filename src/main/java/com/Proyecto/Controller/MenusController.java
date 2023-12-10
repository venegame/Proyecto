package com.Proyecto.controller;

import com.Proyecto.Service.ComentariosService;
import com.Proyecto.Service.TicketService;
import com.Proyecto.ServiceImp.FirebaseStorageServiceImpl;
import com.Proyecto.domain.Ticket;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menus")
public class MenusController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private ComentariosService comentarioService;

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;

    @GetMapping("/perfil")
    public String perfil(Model model) {

        //List<Perfil> listadoPerfiles = perfilService.getPerfiles(true);
        //model.addAttribute("perfiles", listadoPerfiles);
        return "menus/perfil";
    }

    @GetMapping("/crearTiquete")
    public String crearTiquete(Model model) {

        //List<Perfil> listadoPerfiles = perfilService.getPerfiles(true);
        //model.addAttribute("perfiles", listadoPerfiles);
        return "menus/crearTiquete";
    }
    
    @PostMapping("/guardarTicket")
    public String ticketGuardar(Ticket ticket) {    
        ticket.setEstado("activo");
        ticket.setFechaCreacion(LocalDateTime.now().toString());
        ticketService.save(ticket);
        return "redirect:/menus/tickets";
    }

    @GetMapping("/notificaciones")
    public String notificaciones(Model model) {

        return "menus/notificaciones";
    }

    @GetMapping("/registro")
    public String registro(Model model) {

        return "menus/registro";
    }

    @GetMapping("/menuPrincipal")
    public String menuPrincipal(Model model) {

        //List<Perfil> listadoPerfiles = perfilService.getPerfiles(true);
        //model.addAttribute("perfiles", listadoPerfiles);
        return "menus/menuPrincipal";
    }

}
