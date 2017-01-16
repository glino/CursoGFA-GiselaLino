/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08.vehiculos;
import java.io.*;
import java.util.Scanner;
import vehiculo.tiposvehiculos.Automovil;
import vehiculo.tiposvehiculos.Avion;
import vehiculo.tiposvehiculos.Barco;
import vehiculo.tiposvehiculos.Bicicleta;
import java.io.IOException;
import vehiculo.Vehiculo;

/**
 *
 * @author gi.lino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Vehiculo [] arreglo;
    static int punteroArreglo;
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        arreglo = new Vehiculo [10];
        punteroArreglo = 0;

        int opcion;
        do{
            System.out.println("1)Registrar nuevo vehículo \n2)Eliminar vehículo (por id) \n3)Buscar (por id) \n4)Consultar todo \n5)Salir");
            opcion= s.nextInt();
            switch(opcion){
                case 1:
                    registrar();
                break;    
                case 2:
                    eliminar(); //por id
                break;
                case 3:
                    buscar();//buscar por id
                break;
                case 4:
                    consultarTodo();
                break;
            }
  
        }while (opcion != 5);
        
        
    }
    
    
    private static void registrar(){
        System.out.println("Registrar: \n1)Bicicleta \n2)Avion \n3)Automovil \n4)Barco");
        int opcion= s.nextInt();
        Vehiculo vehi= null;
         switch(opcion){
                case 1:
                    vehi = new Bicicleta(0,0,"");
                break;    
                case 2:
                    vehi = new Avion(0,0,"","","");
                break;
                case 3:
                    vehi = new Automovil(0,0,"");
                break;
                case 4:
                    vehi = new Barco(0,0,"","","");
                break;
            }
                         System.out.println("tt "+vehi.getClass().getName()); ;
        vehi.registrar(punteroArreglo);
        arreglo [punteroArreglo] = vehi; 
        punteroArreglo ++;
        
    }
    
    private static void eliminar(){
        try{
            System.out.println("Id a eliminar");
            int opcion= s.nextInt();
            arreglo [opcion] = null;
        }
        catch (NullPointerException exc ){
            System.out.println("No existe el vehiculo"); 
        }    
    }
    public static void buscar(){
        try{
            System.out.println("Id");
            int opcion= s.nextInt();
            System.out.println( arreglo [opcion].toString());
        }
        catch (NullPointerException exc ){
            System.out.println("No existe el vehiculo"); 
        }
        
    }
    public static void consultarTodo(){
        System.out.println("Listado Vehiculos");
        for (int i = 0; i<arreglo.length; i++)
        {
            try{
                System.out.println(arreglo[i].toString());
            }catch (NullPointerException ex){}
        } 
    }
}
