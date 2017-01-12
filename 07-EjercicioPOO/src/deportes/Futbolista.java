/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;

import persona.Persona;

/**
 *
 * @author gi.lino
 */
public class Futbolista extends Persona{
    private String posicion;
    private int dorsal;
    public Futbolista(String nombre, String apellido, int edad, String posicion, int dorsal) {
        super(nombre, apellido, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;               
    }

    public String getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setDorsal(short dorsal) {
        this.dorsal = dorsal;
    }
    
    /*Cuando Java ve @Override sobre entiende que no se va a usar la otra 
    operación de la clase que esta heredando, eficienta la compilación*/
    
    @Override
    public void hablar(){
        System.out.println("Se hizo lo que se pudo..., dimos lo mejor");
    }
    
    @Override
    public void comer(){
        System.out.println("¿Qué es eso?...");
    }
}
