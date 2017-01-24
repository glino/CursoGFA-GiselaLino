/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.tiposvehiculos;

import db.VehiculoDB;
import model.vehiculo.Vehiculo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.vehiculo.tiposvehiculos.Avion;

/**
 *
 * @author gi.lino
 */
public class AvionDB implements VehiculoDB{
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfajava";
    private static final String USER = "root";
    private static final String PASS = "";
                
    
   
    
    @Override
    public boolean registrar(Vehiculo vehiculo) throws ClassNotFoundException, SQLException {
            Class.forName(JDBC_DRIVER);
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement consulta = conexion.createStatement();
            Avion avion= (Avion) vehiculo;

            String query = String.format ("INSERT INTO avion (id,cantidadruedas,tipovehiculo,origen,destino) values ('%d','%d','%s','%s','%s')",
                        avion.getIdVehiculo(),avion.getCantidadRuedas(),avion.getTipoVehiculo(),avion.getOrigen(),avion.getDestino());
    
            boolean resultado = consulta.execute(query);
        
            consulta.close();
            conexion.close();
        
            return resultado; 
   
    }

    @Override
    public boolean actualizar(Vehiculo vehiculo) throws ClassNotFoundException, SQLException {

            Class.forName(JDBC_DRIVER);
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Avion avion= (Avion) vehiculo;
            Statement consulta = conexion.createStatement();

            String query = String.format ("UPDATE avion SET tipoVehiculo='%s', origen='%s', destino='%s' where id='%d'",
                        avion.getTipoVehiculo(),avion.getOrigen(),avion.getDestino(),avion.getIdVehiculo());
    
            boolean resultado = consulta.execute(query);
        
            consulta.close();
            conexion.close();
        
            return resultado; 
    }

    @Override
    public Vehiculo consultar( int id) throws ClassNotFoundException, SQLException {

            Class.forName(JDBC_DRIVER);
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement consulta = conexion.createStatement();//nos permite hacer consultas
            String textConsulta = "SELECT * FROM avion where id =" +id;
            ResultSet resultado = consulta.executeQuery(textConsulta); //capta todos los resultados de nuestra consulta
        

            Avion avion= new Avion(0,0,"","","");
            if(resultado.next()){
                avion.setIdVehiculo(resultado.getInt("id"));
                avion.setCantidadRuedas(resultado.getInt("cantidadRuedas"));
                avion.setTipoVehiculo(resultado.getString("tipoVehiculo"));
                avion.setOrigen(resultado.getString("origen"));
                avion.setDestino(resultado.getString("destino"));
            }
        
            resultado.close();
            conexion.close();
        
            return avion;
 

    }

    @Override
    public boolean eliminar(int id) throws ClassNotFoundException, SQLException {

            Class.forName(JDBC_DRIVER);
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement consulta = conexion.createStatement();

            String query = String.format ("DELETE FROM avion where id='%d'",
                        id);
    
            boolean resultado = consulta.execute(query);
        
            consulta.close();
            conexion.close();
        
            return resultado; 

    }


    
}
