/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14.hilos;

/**
 *
 * @author gi.lino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            HiloNuevo h = new HiloNuevo (i);
            Thread t = new Thread (h);
            t.start();
            //h.run();
        }
        
    }
    
}
