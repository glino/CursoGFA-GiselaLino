/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsholamundo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author gi.lino
 */
@WebService
public class HolaMundoImpl implements HolaMundo {

    @WebMethod
    public String getHolaMundo(@WebParam(name = "nombre") String s) {
        return "Hola "+s;
    }
    
}
