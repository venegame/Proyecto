package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "tickets")
public class Ticket implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private long idTicket;
    private String resumen;
    private String fechaCreacion;
    private String descripcion;
    private long prioridad;
    private String estado;
    private String resolucion;
    private String rutaImagen;
    
    public Ticket (){  
    }

    public Ticket(String resumen, String fechaCreacion, String descripcion, long prioridad, String estado, String resolucion, String rutaImagen) {
        this.resumen = resumen;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.resolucion = resolucion;
        this.rutaImagen = rutaImagen;
    }

}
