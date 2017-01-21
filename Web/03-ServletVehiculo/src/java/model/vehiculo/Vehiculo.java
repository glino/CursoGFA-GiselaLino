/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vehiculo;

import java.util.Scanner;

/**
 *
 * @author gi.lino
 */
public class Vehiculo {
 
    private int idVehiculo;
    private int cantidadRuedas;
    private String tipoVehiculo;

    public Vehiculo(int idVehiculo, int cantidadRuedas, String tipoVehiculo) {
        this.idVehiculo = idVehiculo;
        this.cantidadRuedas = cantidadRuedas;
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    public void registrar(int idVehiculo){
        Scanner s = new Scanner(System.in);
        this.idVehiculo = idVehiculo;
        System.out.println("Cantidad Ruedas");
        this.cantidadRuedas= s.nextInt();
        System.out.println("TipoVehiculo");
        this.tipoVehiculo =  s.next();
    }
}
