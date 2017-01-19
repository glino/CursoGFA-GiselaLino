/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Autobus;

/**
 *
 * @author gi.lino
 */
public class AutobusDB {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfajava";
    private static final String USER = "root";
    private static final String PASS = "";
            
    
    public List<Autobus> getAutobuses () 
            throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement consulta = conexion.createStatement();//nos permite hacer consultas
        String textConsulta = "SELECT * FROM autobus";
        ResultSet resultado = consulta.executeQuery(textConsulta); //capta todos los resultados de nuestra consulta
        
        ArrayList<Autobus> lista = new ArrayList<>();

        while(resultado.next()){
            Autobus autobus= new Autobus();
            /*
            int num_Autobus=resultado.getInt("num_autobus");
            String siglas =resultado.getString("siglas");
            int modelo=resultado.getInt("modelo");
            int capacidad =resultado.getInt("capacidad");
            String base = resultado.getString("base");*/
            
            autobus.setNum_Autobus(resultado.getInt("num_autobus"));
            autobus.setSiglas(resultado.getString("siglas"));
            autobus.setModelo(resultado.getInt("modelo"));
            autobus.setCapacidad(resultado.getInt("capacidad"));
            autobus.setBase(resultado.getString("base"));
            
            lista.add(autobus);
            
        }
        
        resultado.close();
        consulta.close();
        conexion.close();
        return lista;
    }
}
