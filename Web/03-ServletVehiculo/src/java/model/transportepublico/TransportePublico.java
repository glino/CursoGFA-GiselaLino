/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.transportepublico;

import model.vehiculo.Vehiculo;

/**
 *
 * @author gi.lino
 */
public abstract class TransportePublico extends Vehiculo{
    private String origen ;
    private String destino;

    public TransportePublico(int idVehiculo, int cantidadRuedas, String tipoVehiculo,
                            String origen, String destino) {
        super(idVehiculo, cantidadRuedas, tipoVehiculo);
        this.origen = origen;
        this.destino = destino;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
    
    public abstract void registrarTransportePublico(int idVehiculo);
    
    
      
}