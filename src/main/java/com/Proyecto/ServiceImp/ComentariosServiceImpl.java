package com.Proyecto.ServiceImp;

import com.Proyecto.Controller.dao.ComentariosDao;
import com.Proyecto.Service.ComentariosService;
import com.Proyecto.domain.Comentarios;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComentariosServiceImpl implements ComentariosService{
    
    @Autowired
    private ComentariosDao comentariosDao;

    @Override
    public List<Comentarios> getComentarios() {
        List <Comentarios> comentarios = comentariosDao.findAll();
        return comentarios;
    }

    @Override
    public Comentarios getComentarios(Comentarios comentarios) {
        return comentariosDao.findById( comentarios.getIdTicketComentario()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Comentarios comentarios) {
        comentariosDao.save(comentarios);
    }

    @Override
    @Transactional
    public void delete(Comentarios comentarios) {
        comentariosDao.delete(comentarios);
    }
    
}
