/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import modelo.Estado;

/**
 *
 * @author gi.lino
 */
@WebService
public interface EstadosWS {
    @WebMethod
    public String getCapital(String s);
    @WebMethod
    public int getPoblacion(String s);
    @WebMethod
    public Estado[] getEstados();
}
