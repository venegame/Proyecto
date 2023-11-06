package com.Proyecto.controller;

import com.Proyecto.Service.PerfilService;
import com.Proyecto.domain.Perfil;
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
    /*
    @Autowired
    private PerfilService perfilService;
    */
    @GetMapping("/perfil.html")
    public String perfil(Model model) {
        
        //List<Perfil> listadoPerfiles = perfilService.getPerfiles(true);
        //model.addAttribute("perfiles", listadoPerfiles);
        return "/perfil";
    }
    
    @GetMapping("/tickets.html")
    public String tickets(Model model) {
        
        //List<Perfil> listadoPerfiles = perfilService.getPerfiles(true);
        //model.addAttribute("perfiles", listadoPerfiles);
        return "/tickets";
    }

}
