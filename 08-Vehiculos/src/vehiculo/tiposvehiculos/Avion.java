/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.tiposvehiculos;

import java.util.Scanner;
import transportepublico.TransportePublico;
import vehiculo.Vehiculo;

/**
 *
 * @author gi.lino
 */
public class Avion extends TransportePublico {

    public Avion(int idVehiculo, int cantidadRuedas, String tipoVehiculo, 
                    String origen, String destino) {
        super(idVehiculo, cantidadRuedas, tipoVehiculo, origen, destino);
    }

    @Override
    public void registrarTransportePublico( int idVehiculo) {
    }    
    
    @Override
    public void registrar( int idVehiculo) {    
        Scanner s = new Scanner(System.in);
        
        setIdVehiculo (idVehiculo);
        System.out.println("Cantidad Ruedas");
        setCantidadRuedas (s.nextInt());
        System.out.println("TipoVehiculo");
        setTipoVehiculo (s.next());
        System.out.println("Origen");
        setOrigen(s.next());
        System.out.println("Destino");
        setDestino(s.next());
    }

    @Override
    public String toString(){
        return "Avion\nVehiculo: "+getIdVehiculo()+", Cantidad Ruedas: "+getCantidadRuedas()+" TipoVehiculo: "+getTipoVehiculo()
                +" Origen: "+getOrigen()+" Destino: "+ getDestino();
    }
    
}
