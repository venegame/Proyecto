package com.Proyecto.controller;

import com.Proyecto.Service.ComentariosService;
import com.Proyecto.Service.PerfilService;
import com.Proyecto.Service.TicketService;
import com.Proyecto.ServiceImp.FirebaseStorageServiceImpl;
import com.Proyecto.domain.Comentarios;
import com.Proyecto.domain.Perfil;
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

@Controller
@RequestMapping("/menus")
public class MenusController {

    @Autowired
    private PerfilService perfilService;

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
