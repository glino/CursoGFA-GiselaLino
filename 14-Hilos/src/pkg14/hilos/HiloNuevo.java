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
public class HiloNuevo implements Runnable{
    int id;
    public HiloNuevo(int id){
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println("Inicio de Hilo 3 seg. ID: "+id);
        try{
            Thread.sleep(300);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Fin de hilo de 3 seg. ID: "+id);
    }
    
    
    
    
}
