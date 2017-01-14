/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.excepciones;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gi.lino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /*     String s = "Jose";
        int d;
        ArrayList<String> a= null;
        try{
            a.add("d");
            d = Integer.parseInt(s);
            System.out.println(args[1]);
            
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Posicion no valida!");
        }    
        catch (NumberFormatException ex){
            System.out.println("Error de formato");
        }
        catch (Exception ex){/*es recomendable que se deje al final de lo contrario 
            la tomaría en automatico es recomendable seccionar los tipos de mensajes 
            para ser más especificos en los mensajes de error mostrados al usuario  */
     /*       System.out.println("Excepcion Generica");
        }
        System.out.println("Final");*/
     
        Boleto b = new Boleto();
        Date d = new Date("05/25/2010");
        try
        {
            b.setFecha(d);
        }
        catch (FechaInvalidaException e){
            e.printStackTrace();
            e.otroMensaje();
        }
        finally{
            System.out.println(b.getFecha());
            System.out.println("Siempre se va a ejecutar");
        }
        
        
    }
    
}
