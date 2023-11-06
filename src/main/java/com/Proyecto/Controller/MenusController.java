package com.Proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menus/perfil")
public class MenusController {

    @GetMapping
    public String mostrarPerfil() {
        return "perfil";
}
}
