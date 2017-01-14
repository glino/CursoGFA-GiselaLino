/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.tiposvehiculos;

import transportepublico.TransportePublico;
import vehiculo.Vehiculo;

/**
 *
 * @author gi.lino
 */
public class Bicicleta extends Vehiculo {

    public Bicicleta(int idVehiculo, int cantidadRuedas, String tipoVehiculo) {
        super(idVehiculo, cantidadRuedas, tipoVehiculo);
    }      
    
    public static void pedalear(){
        
    }
    
    public static void cambiarVelocidad(){
        
    }

    @Override
    public String toString(){
        return "Bicicleta\nVehiculo: "+getIdVehiculo()+", Cantidad Ruedas: "+getCantidadRuedas()+" TipoVehiculo: "+getTipoVehiculo () ;
    }
   
}
