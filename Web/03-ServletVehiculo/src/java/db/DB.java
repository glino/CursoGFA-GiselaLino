package db;

import java.sql.SQLException;
import model.vehiculo.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gi.lino
 */
public interface DB {
 

    public abstract boolean registrar(Vehiculo vehi) throws ClassNotFoundException, SQLException ;
    public abstract boolean actualizar(Vehiculo vehi) throws ClassNotFoundException, SQLException ;
    public abstract Vehiculo consultar(int id) throws ClassNotFoundException, SQLException ;
    public abstract boolean eliminar(int id)throws ClassNotFoundException, SQLException ;
        
}
