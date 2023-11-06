/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.Service;

import com.Proyecto.Controller.domain.Perfil;
import java.util.List;

/**
 *
 * @author Seur
 */
public interface PerfilService {
    
    public List<Perfil> getPerfiles(boolean permisos);
    public Perfil getPerfil(Perfil perfil);
}
