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
import operacionesArreglo.OperacionesArreglo;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int arregloEnteros[];
        OperacionesArreglo arregloOp = new OperacionesArreglo();
        
        int opcion;
        
        do{
        System.out.println("Captura la opción a ejecutar: 0. Captura de nombres, 1.Suma del arreglo, 2. Calcular Media, 3. Número mayor en arreglo, 5. Salir ");
        opcion= s.nextInt();
        switch (opcion){
            case 0:{
                capturaNombres();
            }
            break;
            case 1:{
                arregloEnteros = llenaArreglo(creaArreglo());
                System.out.println("La suma es: "+arregloOp.sumaArreglo(arregloEnteros));
             }
            break;
            case 2:{
                arregloEnteros = llenaArreglo(creaArreglo());
                System.out.println("La media es: "+arregloOp.mediaArreglo(arregloEnteros));
             }
            break;
            case 3:{
                arregloEnteros = llenaArreglo(creaArreglo());
                System.out.println("El número mayor es: "+arregloOp.mayorArreglo(arregloEnteros));
            }
            break;

        }
        }while(opcion != 5);
                

        
        
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
