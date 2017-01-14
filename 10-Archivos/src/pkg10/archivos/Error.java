/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.archivos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 *
 * @author gi.lino
 */
public class Error implements Escribible{
 
    private long timeStamp;
    private int codigoError;
    private String descripcion;

    public Error(int codigoError, String descripcion) {
        this.timeStamp = new Date().getTime();
        this.codigoError = codigoError;
        this.descripcion = descripcion;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void escribir(String url) {
        try{
            FileOutputStream f0 = new FileOutputStream(url, true);
            OutputStreamWriter oS = new OutputStreamWriter (f0, "UTF-8");
            BufferedWriter bW= new BufferedWriter(oS);
            
            String linea = timeStamp +" | "+codigoError+" | "+ descripcion +"\n";
            bW.write(linea);
            bW.close();
            
        }catch (FileNotFoundException ex){
            System.out.println("Archivo no encontrado");
        }catch (UnsupportedEncodingException ex){
            System.out.println("TIpo de codificación no soportada");
        }catch(IOException ex){
            System.out.println("Error IO");
        }catch(Exception ex){
            System.out.println("Otro error");
        }
        
    }
    /* @Override
    //Este tipo de escritura no se recomienda
    public void escribir(String url) {
        FileWriter fw;
        try{
            
            fw = new FileWriter(url, true);
            String linea = timeStamp + " | " + codigoError + " | " + descripcion + "\n";
            fw.append(linea);
            fw.close();
        }
        catch(IOException ex){
            System.out.println("El archivo no existe");
        }
        
    }*/

    @Override
    public Escribible leer(String url, long timeStamp) {
 
       return new Error (3, "Error para");
    }
    
    
    
}
