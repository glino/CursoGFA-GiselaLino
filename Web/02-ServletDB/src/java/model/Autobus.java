/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gi.lino
 */
public class Autobus {
    
    private int num_Autobus;
    private String siglas;
    private int modelo;
    private int capacidad;
    private String base;

    public void setNum_Autobus(int numAutobus) {
        this.num_Autobus = num_Autobus;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public int getNum_Autobus() {
        return num_Autobus;
    }

    public String getSiglas() {
        return siglas;
    }

    public int getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getBase() {
        return base;
    }
    
    @Override
    public String toString() {
        return "Autobus{" + "num_Autobus=" + num_Autobus + ", siglas=" + siglas + ", modelo=" + modelo + ", capacidad=" + capacidad + ", base=" + base + '}';
    }

    
}
