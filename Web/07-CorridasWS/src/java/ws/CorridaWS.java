/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import modelo.Corrida;

/**
 *
 * @author gi.lino
 */
@WebService
public interface CorridaWS {
    @WebMethod
    public Corrida consulta(int id);
    @WebMethod
    public Corrida insertar(int id, String origen, String destino, String fechaInicio, String fechaFin, String horaSalida, String horaLlegada, int escalas);
}
