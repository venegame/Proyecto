/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Controller;

import com.Proyecto.Controller.domain.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Proyecto.Service.PerfilService;
import java.util.List;
import org.springframework.ui.Model;

/**
 *
 * @author Seur
 */
@Controller
@RequestMapping("/perfil")
public class PerfilController {
    
    @Autowired
    private PerfilService perfilService;
    
    @GetMapping("/perfil")
    public String inicio(Model model){
        List<Perfil> listadoPerfil = perfilService.getPerfiles(false);
        model.addAttribute("perfil", listadoPerfil);
        return "/perfil";
    }
}
