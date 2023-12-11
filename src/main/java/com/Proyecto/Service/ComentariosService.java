/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto.Service;

import com.Proyecto.domain.Comentarios;
import java.util.List;
/**
 *
 * @author Me
 */
public interface ComentariosService {
    
    public List<Comentarios> getComentarios();

    public Comentarios getComentarios(Comentarios comentarios);

    public void save(Comentarios comentarios);

    public void delete(Comentarios comentarios);
    
}
