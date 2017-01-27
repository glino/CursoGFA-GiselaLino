/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bd.BDCorrida;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import modelo.Corrida;

/**
 *
 * @author gi.lino
 */
@Path("/")
public class CorridaWS {

    @Path("Consultar/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida consulta(@PathParam("id")int id){
        
        try {
            return BDCorrida.buscarCorrida(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridaWS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridaWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }    
    
    @Path("Insertar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida insertar(@QueryParam("origen")String origen,
                            @QueryParam("destino")String destino,
                            @QueryParam("fechaInicio")String fechaInicio,
                            @QueryParam("fechaFin")String fechaFin,  
                            @QueryParam("horaSalida")String horaSalida,
                            @QueryParam("horaLlegada")String horaLlegada,
                            @QueryParam("escalas") int escalas){
        
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
