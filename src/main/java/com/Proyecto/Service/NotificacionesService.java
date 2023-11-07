package com.Proyecto.Service;

import com.Proyecto.domain.Notificaciones;
import java.util.List;

public interface NotificacionesService {

    public List<Notificaciones> getNotificaciones();

    public Notificaciones getNotificaciones(Notificaciones notificaciones);

    public void save(Notificaciones notificaciones);

    public void delete(Notificaciones notificaciones);
}
