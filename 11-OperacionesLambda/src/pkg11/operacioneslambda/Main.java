/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.operacioneslambda;

/**
 *
 * @author gi.lino
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematicas suma    = (float a, float b)->a+b;
        Matematicas resta   = (float a, float b)->a-b;
        Matematicas multiplicacion = (float a, float b)->a*b;
        Matematicas division =(float a, float b)->a/b;
        
        /*Matematicas suma    = (float a, float b)->a+b;//esta declaración es equivalente a la declaración de abajo
        Matematicas suma2 = new Matematicas(){
            @Override
            public float operacion(float a, float b){
                return a+b;
            }
        };*/
        
        System.out.println("Suma de 10 + 20 = "+suma.operacion(10,20));
        System.out.println("Resta de 10 - 20 = "+realizaOperacion(10f,20f,resta) );
        System.out.println("Multiplicacion de 10 * 20 = "+realizaOperacion(10f,20f,multiplicacion));
        System.out.println("Division de 10 / 20 = "+realizaOperacion(10f,20f,division));
    }
    
    static float realizaOperacion(float a, float b, Matematicas operacion){
        return operacion.operacion(a,b);
    }
    
}
