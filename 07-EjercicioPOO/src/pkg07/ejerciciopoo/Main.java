/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.ejerciciopoo;
import persona.Persona;
import deportes.Futbolista;
import oficina.Desarrollador;
import oficina.Operador;

/**
 *
 * @author gi.lino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p = new Persona("Josué Caro");
        p.hablar();
        
        Futbolista fut = new Futbolista("Fabian", "Onate", 27, "Defensa", 22);
        fut.hablar();
        System.out.println(fut.toString());
        
        Desarrollador des = new Desarrollador("Jose", "Lopez", 12, 34, 123);
        
        Operador ope = new Operador("Armando", "Montes", 12, 34, 123);
        
        System.out.println("Primero ");
        des.trabajar();
        System.out.println("Y despues ");
        des.transporteTorta();
       /* p.setEdad(35);
        Persona p2 = new Persona ("José", "Perez", 32);
        
        System.out.println("Nombre: "+p.getNombre()+" Apellido: "+p.getApellido()+" Edad: "+p.getEdad());
        System.out.println("Nombre: "+p2.getNombre()+" Apellido: "+p2.getApellido()+" Edad: "+p2.getEdad());
        */
    }
    
}
