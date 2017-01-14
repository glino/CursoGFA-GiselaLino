/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.excepciones;

/**
 *
 * @author gi.lino
 */
public class FechaInvalidaException extends Exception{

    public FechaInvalidaException() {
        System.out.println("Excepcion Lanzada");
    }
    
    public static void otroMensaje(){
        System.out.println("Otro mensaje");
    }
            
    
    
}
