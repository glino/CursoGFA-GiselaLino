/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.tiposvehiculos;

import java.util.Scanner;
import transportepublico.TransportePublico;

/**
 *
 * @author gi.lino
 */
public class Barco extends TransportePublico {

    public Barco(int idVehiculo, int cantidadRuedas, String tipoVehiculo, 
            String origen, String destino) {
        super(idVehiculo, cantidadRuedas, tipoVehiculo, origen, destino);
    }

    @Override
    public void registrarTransportePublico( int idVehiculo) {
        Scanner s = new Scanner(System.in);
        registrar(idVehiculo);
        System.out.println("Origen");
        setOrigen(s.next());
        System.out.println("Destino");
        setDestino(s.next());
    }
    
    @Override
    public String toString(){
        return "Barco\nVehiculo: "+getIdVehiculo()+", Cantidad Ruedas: "+getCantidadRuedas()+" TipoVehiculo: "+getTipoVehiculo()
                +" Origen: "+getOrigen()+" Destino: "+ getDestino();
                
    }
    
}
