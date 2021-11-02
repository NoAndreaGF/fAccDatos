/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Comentario;
import dominio.Publicacion;
import interfaces.ComentarioInterface;
import java.util.List;

/**
 *
 * @author Equipo 6 
 */
public class ComentarioDAO implements ComentarioInterface{

    @Override
    public void guardarComentario(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarComentario(Comentario comentario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Comentario> consultarComentarios(Publicacion publicacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
