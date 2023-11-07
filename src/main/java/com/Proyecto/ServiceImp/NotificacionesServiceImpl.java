package com.Proyecto.ServiceImp;

import com.Proyecto.Controller.dao.NotificacionesDao;
import com.Proyecto.Service.NotificacionesService;
import com.Proyecto.domain.Notificaciones;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Me
 */
@Service
public class NotificacionesServiceImpl implements NotificacionesService {

    @Autowired
    private NotificacionesDao notificacionesDao;

    @Override
    public List<Notificaciones> getNotificaciones() {
        List<Notificaciones> notificaciones = notificacionesDao.findAll();
        return notificaciones;
    }

    @Override
    @Transactional
    public void save(Notificaciones notificaciones) {
        notificacionesDao.save(notificaciones);
    }

    @Override
    @Transactional
    public void delete(Notificaciones notificaciones) {
        notificacionesDao.delete(notificaciones);
    }

    @Override
    public Notificaciones getNotificaciones(Notificaciones notificaciones) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
