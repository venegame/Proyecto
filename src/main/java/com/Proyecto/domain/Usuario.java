package com.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
/**
 *
 * @author Me
 */
@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    
    @NotEmpty
    private String username;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String password;
    
    private String correo;
    private String telefono;
    private boolean activo;
    private String rutaImagen;
    
    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<Rol> roles;
}
