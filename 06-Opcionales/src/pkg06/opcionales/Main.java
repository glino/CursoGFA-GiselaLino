/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.opcionales;
import java.util.Scanner;
import operacionesArreglo.OperacionesArreglo;
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
        int arregloEnteros[];
        OperacionesArreglo arregloOp = new OperacionesArreglo();
        
        int opcion;
        
        do{
        System.out.println("Captura la opción a ejecutar: 1.Suma del arreglo, 2. Calcular Media, 3. Número mayor en arreglo, 5. Salir ");
        opcion= s.nextInt();
                arregloEnteros = llenaArreglo(creaArreglo());
        switch (opcion){
            case 1:{

                System.out.println("La suma es: "+arregloOp.sumaArreglo(arregloEnteros));
             }
            break;
            case 2:{
//                arregloEnteros = llenaArreglo(creaArreglo());
                System.out.println("La media es: "+arregloOp.mediaArreglo(arregloEnteros));
             }
            break;
            case 3:{
  //              arregloEnteros = llenaArreglo(creaArreglo());
                System.out.println("El número mayor es: "+arregloOp.mayorArreglo(arregloEnteros));
            }
            break;

        }
        }while(opcion != 5);
          
    }
     public static int [] creaArreglo(){
        int tamanio = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Captura el tamaño del arreglo ");
        tamanio = s.nextInt();
        int arregloEnteros[] = new int[tamanio];
        return arregloEnteros;     
    }
    
    public static int [] llenaArreglo(int arregloEnteros[]){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i<arregloEnteros.length; i++){
            System.out.println("Captura el Numero "+(i+1));
            arregloEnteros[i]= s.nextInt();
        }    
        return arregloEnteros; 
    }
    
}
