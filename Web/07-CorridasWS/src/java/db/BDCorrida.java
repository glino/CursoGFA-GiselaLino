/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import modelo.Corrida;

/**
 *
 * @author gi.lino
 */
public class BDCorrida {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/corridas";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static boolean insertarCorrida(Corrida corrida) throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String consulta = String.format("INSERT INTO corrida(origen,"+
                "destino, "+
                "fini,"+
                "ffin, "+
                "hsalida, "+
                "hllegada, "+
                "escalas)"+
                " VALUES ('%s','%s','%s','%s','%s','%s',%d) ", corrida.getOrigen(),
                corrida.getDestino(),
                corrida.getFechaInicio(),
                corrida.getFechaFin(),
                corrida.getHoraSalida(),
                corrida.getHoraLlegada(),
                corrida.getEscalas()
        );
        
        int respuesta = st.executeUpdate(consulta);
        st.close();
        conexion.close();
        return respuesta == 1 ? true:false;
    }
    
    public static Corrida buscarCorrida(int id) throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String consulta = String.format("Select * from corrida WHERE id = %d",id);
        ResultSet response = st.executeQuery(consulta);
        Corrida corrida = new Corrida();
        
        if (response.next()){
            corrida.setId(response.getInt("id"));
            corrida.setOrigen(response.getString("origen"));
            corrida.setDestino(response.getString("destino"));
            corrida.setFechaInicio(response.getString("fini"));
            corrida.setFechaFin(response.getString("ffin"));
            corrida.setHoraLlegada(response.getString("hllegada"));
            corrida.setHoraSalida(response.getString("hsalida"));
            corrida.setEscalas(response.getInt("escalas"));
        }
        
        response.close();
        st.close();
        conexion.close();
        
        return corrida;
    }
    
}
