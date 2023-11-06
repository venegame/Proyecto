/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Seur
 */
@Data
@Entity
@Table(name = "ticketManager.personas")
public class Perfil implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    private String username;
    private String nombre;
    private String correo;
    private String telefono;
    private String rutaImagen;
    private boolean permisos;
    
    public Perfil (){
        
    }

    public Perfil(String username, String nombre, String correo, String telefono, String rutaImagen, boolean permisos) {
        this.username = username;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.rutaImagen = rutaImagen;
        this.permisos = permisos;
    }
    
    
    

}
