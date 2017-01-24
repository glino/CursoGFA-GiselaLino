/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import java.util.ArrayList;
import modelo.Estado;



/**
 *
 * @author gi.lino
 */
public class EstadoDB {
   
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL_DB = "jdbc:mysql://localhost:3306/estadosMexico";
    private static final String USUARIO = "root";
    private static final String PASS = "";
                
    
    
    public static String getCapital (String estadoNombre) throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL_DB, USUARIO, PASS);
        Statement st = conexion.createStatement();
        String consulta ="SELECT capital from estados where nombre = '" + estadoNombre+"'";
        ResultSet rs = st.executeQuery(consulta);
        String capital = null;
        if (rs.next()){
            capital = rs.getString ("capital");
        }
        rs.close();
        st.close();
        conexion.close();
        return capital;
        
    }
    
    
     public static int getPoblacion (String estadoNombre) throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL_DB, USUARIO, PASS);
        Statement st = conexion.createStatement();
        String consulta ="SELECT poblacion from estados where nombre = '" + estadoNombre+"'";
        ResultSet rs = st.executeQuery(consulta);
        int poblacion = 0;
        if (rs.next()){
            poblacion = rs.getInt("poblacion");
        }
        rs.close();
        st.close();
        conexion.close();
        return poblacion;
        
    }
     
     
    public static Estado[] getEstados () throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL_DB, USUARIO, PASS);
        Statement st = conexion.createStatement();
        String consulta ="SELECT * from estados ";
        ResultSet rs = st.executeQuery(consulta);
        ArrayList<Estado> lista = new ArrayList<Estado>();
        while (rs.next()){
            lista.add(
                    new Estado(
                        rs.getInt("idEstado"),
                            rs.getString("nombre"),
                            rs.getInt("municipios"),
                            rs.getString("capital"),
                            rs.getString("comidatipica"),
                            rs.getInt("poblacion")
                    ) );
        }
        rs.close();
        st.close();
        conexion.close();
        Estado [] listaEstados = new Estado[lista.size()];
        listaEstados = lista.toArray(listaEstados);
        return listaEstados;
        
    }
     
     
}
