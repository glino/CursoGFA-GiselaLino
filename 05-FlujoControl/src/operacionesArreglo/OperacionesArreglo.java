/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesArreglo;

/**
 *
 * @author gi.lino
 */
public class OperacionesArreglo {
    
    
    public int sumaArreglo(int arregloDouble[]){
        int suma = 0;
        for (int i =0; i<arregloDouble.length; i++){
            suma = suma + arregloDouble[i];
        }
        return suma;
    }
    
    public double mediaArreglo(int arregloDouble[]){
        int media = 0;
        for (int i =0; i<arregloDouble.length; i++){
            media = media + arregloDouble[i];
        }
        media = media / arregloDouble.length;
        return media;
    }
    
    public int mayorArreglo(int arregloDouble[]){
        int mayor = 0;
        if (arregloDouble.length>0)
            mayor = arregloDouble[0];
        for (int i =0; i<arregloDouble.length; i++){
            if (arregloDouble[i]> mayor) 
                mayor = arregloDouble[i];
        }
        return mayor;
    }
    
}
