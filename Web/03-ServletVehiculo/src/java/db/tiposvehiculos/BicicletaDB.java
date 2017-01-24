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
import model.vehiculo.tiposvehiculos.Bicicleta;

/**
 *
 * @author gi.lino
 */
public class BicicletaDB implements VehiculoDB{
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfajava";
    private static final String USER = "root";
    private static final String PASS = "";
   
    
    @Override
    public boolean registrar(Vehiculo vehiculo) throws ClassNotFoundException, SQLException {
            Class.forName(JDBC_DRIVER);
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement consulta = conexion.createStatement();
            Bicicleta bici = (Bicicleta) vehiculo;

            String query = String.format ("INSERT INTO automovil (id,cantidadruedas,tipovehiculo) values ('%d','%d','%s')",
                        auto.getIdVehiculo(),auto.getCantidadRuedas(),auto.getTipoVehiculo());
    
            boolean resultado = consulta.execute(query);
        
            consulta.close();
            conexion.close();
        
            return resultado; 
   
    }

    @Override
    public boolean actualizar(Vehiculo vehiculo) throws ClassNotFoundException, SQLException {

            Class.forName(JDBC_DRIVER);
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Automovil auto= (Automovil) vehiculo;
            Statement consulta = conexion.createStatement();

            String query = String.format ("UPDATE automovil SET tipoVehiculo='%s' where id='%d'",
                        auto.getTipoVehiculo(),auto.getIdVehiculo());
    
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
            String textConsulta = "SELECT * FROM automovil where id =" +id;
            ResultSet resultado = consulta.executeQuery(textConsulta); //capta todos los resultados de nuestra consulta
        

            Automovil auto= new Automovil(0,0,"");
            if(resultado.next()){
                auto.setIdVehiculo(resultado.getInt("id"));
                auto.setCantidadRuedas(resultado.getInt("cantidadRuedas"));
                auto.setTipoVehiculo(resultado.getString("tipoVehiculo"));
            }
        
            resultado.close();
            conexion.close();
        
            return auto;
 

    }

    @Override
    public boolean eliminar(int id) throws ClassNotFoundException, SQLException {

            Class.forName(JDBC_DRIVER);
            Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement consulta = conexion.createStatement();

            String query = String.format ("DELETE FROM automovil where id='%d'",
                        id);
    
            boolean resultado = consulta.execute(query);
        
            consulta.close();
            conexion.close();
        
            return resultado; 

    }


    
}
