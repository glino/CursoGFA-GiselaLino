/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.archivos;

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
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.println("Ingresa el Código de Error");
        int cError = s.nextInt();
        System.out.println("Ingresa la descripcion del Error");
        String descripcion = s2.nextLine();
        Error e1 = new Error (cError, descripcion);
        e1.escribir("errores.txt");
    }
    
}
