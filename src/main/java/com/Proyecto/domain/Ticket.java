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
    private String prioridad;
    private String estado;
    private String resolucion;
    private String tipoError;
    private String nombre;
    private String correo;
    private String rutaImagen;
    private boolean favorito;
    
    public Ticket (){  
    }

    public Ticket(String resumen, String fechaCreacion, String descripcion, String prioridad, String estado, String resolucion, String tipoError, String nombre, String correo, String rutaImagen, boolean favorito) {
        this.resumen = resumen;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.resolucion = resolucion;
        this.tipoError = tipoError;
        this.nombre = nombre;
        this.correo = correo;
        this.rutaImagen = rutaImagen;
        this.favorito = favorito;
    }
 
}