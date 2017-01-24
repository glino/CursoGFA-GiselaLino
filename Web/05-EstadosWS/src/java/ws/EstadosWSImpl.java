/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import db.EstadoDB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import modelo.Estado;

/**
 *
 * @author gi.lino
 */
@WebService
public class EstadosWSImpl implements EstadosWS{

    @Override
    @WebMethod
    public String getCapital(@WebParam(name = "nombre" )String s) {
        String capital= null;

        try {
            capital = EstadoDB.getCapital(s);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstadosWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstadosWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return capital;
    }

    @Override
    @WebMethod
    public int getPoblacion(@WebParam(name = "nombre")String s) {
        int poblacion= 0;
        try {
            poblacion = EstadoDB.getPoblacion(s);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstadosWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstadosWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return poblacion;
    }
    
    
    @Override
    @WebMethod
    public Estado[]getEstados() {
        try {   
            Estado[] estados;
            estados = EstadoDB.getEstados();
            return estados;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstadosWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstadosWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
