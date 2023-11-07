package com.Proyecto.Controller.dao;

import com.Proyecto.domain.Notificaciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionesDao extends JpaRepository<Notificaciones, Long>{
    
}
