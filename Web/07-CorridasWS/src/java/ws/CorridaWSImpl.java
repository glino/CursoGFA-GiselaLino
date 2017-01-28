/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import db.BDCorrida;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.*;
import modelo.Corrida;

/**
 *
 * @author gi.lino
 */
@WebService
public class CorridaWSImpl implements CorridaWS{

    @Override
    @WebMethod
    public Corrida consulta(@WebParam(name = "id" )int id) {
         try {
            return BDCorrida.buscarCorrida(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridaWS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridaWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    @WebMethod
    public Corrida insertar(@WebParam(name = "id") int id, 
                            @WebParam(name = "origen") String origen, 
                            @WebParam(name = "destino") String destino, 
                            @WebParam(name = "fechaInicio") String fechaInicio, 
                            @WebParam(name = "fechaFin") String fechaFin, 
                            @WebParam(name = "horaSalida") String horaSalida, 
                            @WebParam(name = "horaLlegada") String horaLlegada, 
                            @WebParam(name = "escalas") int escalas) {
            Corrida corrida = new Corrida (0, origen,destino,fechaInicio,fechaFin,horaSalida,horaLlegada,escalas);
            
        try {    
            BDCorrida.insertarCorrida(corrida);
            
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridaWS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridaWS.class.getName()).log(Level.SEVERE, null, ex);
        }
            return corrida;
    }

    
    
}
