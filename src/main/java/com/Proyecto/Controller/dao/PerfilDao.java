/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Controller.dao;

import com.Proyecto.domain.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Seur
 */
public interface PerfilDao extends JpaRepository<Perfil, Long> {
    
}
