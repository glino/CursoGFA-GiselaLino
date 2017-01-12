/*
 * Clase con un arreglo de 5 strings,
 * donde se capturen nombres
 * 
 */
package pkg05.flujocontrol;

/**
 *
 * @author gi.lino
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int arregloEnteros[];
        capturaNombres();
          
        
    }
    
    public static void capturaNombres(){
        Arreglo arr= new Arreglo();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.println("Captura el Nombre "+(i+1));
            arr.arregloNombres[i]= s.nextLine();
        }
        
        for (int j = 0; j<5; j++){
            System.out.println("El Nombre "+(j+1)+ " es "+ arr.arregloNombres[j]);
        }
    }
    
    /**
     *
     * @return
     */
   
    
}
