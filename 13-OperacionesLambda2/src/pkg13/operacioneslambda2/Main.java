/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.operacioneslambda2;

import Operador.Operador;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


/**
 *
 * @author gi.lino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static List<Operador> lista= Arrays.asList(new Operador("Juan", 341, true), 
                                               new Operador("Carlos", 342, false),
                                               new Operador("Cesar", 343, true),
                                               new Operador("Luis", 344, true),
                                               new Operador("Miguel", 345, false));
        
    public static void main(String[] args) {
        //filtroAntiguo();
        
        long tiempoInicio = System.currentTimeMillis();
        filtroNuevo();
        long tiempoFinal  = System.currentTimeMillis();
        System.out.println("nuevo "+(tiempoFinal - tiempoInicio));
     
        
    }
    
    public static void filtroAntiguo(){
        List<Operador> operadores = new ArrayList<Operador>();
        for(Operador op:lista){
            if(op.isStatus()){
                operadores.add(op);
            }
        }
        imprimir(operadores);
    }
    
    public static void imprimir(List<Operador> operadores){
        System.out.println("--- Lista Filtrada ---");
        for(Operador op: operadores){
            System.out.println(op);
        }
        
    }
    
    public static void filtroNuevo(){
        List<Operador> operadores = lista.stream()
                      .filter(op->op.isStatus())//op.getClave()==342 ) 
                      .collect( Collectors.toList());
        imprimirNuevo(operadores);
    }
    
    public static void imprimirNuevo (List<Operador> operadores){
        System.out.println("--- Lista Filtrada ---");
        operadores.forEach(op-> {System.out.println(op);});
    }
    
}
