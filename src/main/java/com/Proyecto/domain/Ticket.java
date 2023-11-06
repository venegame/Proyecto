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
 * @author Me
 */

@Data
@Entity
@Table(name = "ticketManager.tickets")
public class Ticket implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private long idTicket;
    private String resumen;
    private String descripcion;
    private long prioridad;
    private String estado;
    private String rutaImagen;
    
    public Ticket (){  
    }

    public Ticket(String resumen, String descripcion, long prioridad, String estado, String rutaImagen) {
        this.resumen = resumen;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.rutaImagen = rutaImagen;
    }
}
