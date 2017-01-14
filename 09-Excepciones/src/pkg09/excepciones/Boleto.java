/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.excepciones;

import java.util.Date;

/**
 *
 * @author gi.lino
 */
public class Boleto {
    private float costo;
    private int folio;
    private String origen, destino;
    private Date fecha;

    public float getCosto() {
        return costo;
    }

    public int getFolio() {
        return folio;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha(Date fecha) throws FechaInvalidaException{
        if (fecha.before(new Date())){
            throw new FechaInvalidaException();
        }
        this.fecha = fecha;
    }
    
    
}
