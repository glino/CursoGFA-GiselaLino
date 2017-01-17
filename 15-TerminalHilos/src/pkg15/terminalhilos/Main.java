/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.terminalhilos;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author gi.lino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static List<Autobus> autobuses = Arrays.asList( 
                              new Autobus (1,"León", "Guadalajara", new int[]{5,3,5}), 
                              new Autobus (2,"León", "México Norte", new int[]{10,7,5}) ,
                              new Autobus (3,"León", "Puerto Vallarta", new int[]{2,10,2}) ,
                              new Autobus (4,"León", "Silao", new int[]{3,9,8}) ,
                              new Autobus (5,"León", "Celaya", new int[]{6,2,5}) ,
                              new Autobus (6,"León", "Irapuato", new int[]{5,5,5}) ,
                              new Autobus (7,"León", "Guanajuato", new int[]{1,2,3}) 
                                );
    public static void main(String[] args) {
        long tiempo = System.currentTimeMillis();
        int terminales = 2;
        ExecutorService ejecutor = Executors.newFixedThreadPool( terminales);
        
        autobuses.forEach(autobus-> {
                           Runnable terminal = new Terminal(autobus, tiempo);
                           ejecutor.execute(terminal);
                            });
        ejecutor.shutdown();
        
        while(!ejecutor.isTerminated()){
            
        }
        System.out.println("Proceso terminado.");
        
    }
    
}
