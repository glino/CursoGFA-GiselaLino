package pkg02.paquetes;

import matematicas.Matematicas;
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
        Matematicas mat = new Matematicas();
        Scanner lector = new Scanner(System.in);
        float a, b;
        
        System.out.println("Introduce un número");
        a = lector.nextFloat();
        b = lector.nextFloat();
        
        System.out.println("El resultado de la suma es: "+Matematicas.suma(a, b));
        System.out.println("El resultado de la resta es: "+mat.resta(a, b));
        
    }
    
}
