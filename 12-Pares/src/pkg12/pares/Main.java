/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.pares;

import java.util.Scanner;

/**
 *
 * @author gi.lino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArregloParImpar arregloPar= (float [] arreglo)->{
            float [] arreglo2 = new float[arreglo.length];
            int j=0;
            for(int i = 0; i<arreglo.length; i++){
                if (arreglo[i]%2==0){
                    System.out.println("*"+arreglo[i]);
                    arreglo2[j]= arreglo[i];
                    j++;
                }
            } 
            return arreglo2;
        };
        ArregloParImpar arregloImpar= (float [] arreglo)->{
            float [] arreglo2 = new float[arreglo.length];
            int j=0;
            for(int i = 0; i<arreglo.length; i++){
                if (arreglo[i]%2!=0){
                    System.out.println("*"+arreglo[i]);
                    arreglo2[j]= arreglo[i];
                    j++;
                }
            } 
            return arreglo2;
        };
                
        Scanner s = new Scanner(System.in);
        int longitud;
        System.out.print("Longitud arreglo");
        longitud = s.nextInt();
        float []arregloEntrada = new float [longitud];
        for(int i=0; i<longitud; i++){
            System.out.print("Numero "+i+" ");
            arregloEntrada[i]= s.nextFloat();
        }

        System.out.print("Pares:\n");
        arregloPar.obtenerArreglo(arregloEntrada);
        System.out.print("Impares:\n");
        arregloImpar.obtenerArreglo(arregloEntrada);
        
        
        
        
    }
    
    
    
}
