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
public class Boxeador extends Persona implements Deporte{
    
    public Boxeador(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
  
    
    @Override
    public void hablar(){
        System.out.println("Se hizo lo que se pudo..., dimos lo mejor");
    }
    
    @Override
    public void comer(){
        System.out.println("¿Qué es eso?...");
    }
    
    @Override
    public String toString(){
        return "Nombre: ";
    }
    
    @Override 
    public void jugar(){
        System.out.println("Pelea contra su oponente");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja a las Vegas");
    }

    @Override
    public void entranar() {
    }
}
