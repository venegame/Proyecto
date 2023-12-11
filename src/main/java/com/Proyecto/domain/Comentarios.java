package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "comentarios")
public class Comentarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticketcomentario")
    private Long idTicketComentario;

    @Column(name = "id_ticket")
    private long idTicket;
    private String comentario;
    private String rutaImagen;

    public Comentarios() {
    }

    public Comentarios(long idTicket, String comentario, String rutaImagen) {
        this.idTicket = idTicket;
        this.comentario = comentario;
        this.rutaImagen = rutaImagen;
    }

}
