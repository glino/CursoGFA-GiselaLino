/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.tiposvehiculos;

import vehiculo.Vehiculo;

/**
 *
 * @author gi.lino
 */
public class Automovil extends Vehiculo {
    
    public Automovil(int idVehiculo, int cantidadRuedas, String tipoVehiculo) {
        super(idVehiculo, cantidadRuedas, tipoVehiculo);
    }
    
    
    public static void conducir(){
        
    }
    
    public static void frenar(){
        
    }
    
    @Override
    public String toString(){
        return "Vehiculo: "+getIdVehiculo()+", Cantidad Ruedas: "+getCantidadRuedas()+" TipoVehiculo: "+getTipoVehiculo () ;
    }
  
    
}
