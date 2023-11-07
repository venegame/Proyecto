package com.Proyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ticketManager.notificaciones")
public class Notificaciones implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private long idTicket;
    private String estado;
    private String rutaImagen;
    private String tecnico;
    
    public Notificaciones (){  
    }

    public Notificaciones(String estado, String rutaImagen, String tecnico) {
        this.estado = estado;
        this.rutaImagen = rutaImagen;
        this.tecnico = tecnico;
    }
}