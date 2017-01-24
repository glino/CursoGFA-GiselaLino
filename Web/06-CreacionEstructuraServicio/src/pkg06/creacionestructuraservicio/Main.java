/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.creacionestructuraservicio;
import java.io.IOException;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
/**
 *
 * @author gi.lino
 */
public class Main {
    public static void main (String[]args){
        try{
            SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
            SOAPConnection conexion = factory.createConnection();
            String urlConexion = "http://localhost:8083/05-EstadosWS/Estados";
            SOAPMessage response = conexion.call(generarMensaje(), urlConexion);
            imprimirRespuesta(response);
            //generarMensaje();
            conexion.close();
        }
        catch(SOAPException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
    public static void imprimirRespuesta(SOAPMessage response) throws SOAPException{
        SOAPBody body = response.getSOAPBody();
        SOAPElement elemento = (SOAPElement) body.getChildElements(new QName("http://ws/","getCapitalResponse")).next();
        String elementos = ""+elemento.getChildNodes().getLength();
        SOAPElement elemento2 = (SOAPElement) elemento.getChildElements(new QName("return")).next();
        String mensaje = elemento2.getTextContent();
        System.out.println("\n"+mensaje);
        
    }
    
    public static SOAPMessage generarMensaje() throws SOAPException, IOException{
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage mensaje = factory.createMessage();
        SOAPPart soapPart = mensaje.getSOAPPart();
        String servicioUri = "http://ws/";
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ws", servicioUri);
        SOAPBody body = envelope.getBody();
        SOAPElement elemento = body.addChildElement("getCapital","ws");
        SOAPElement elementoInterno = elemento.addChildElement("nombre");
        elementoInterno.addTextNode("Jalisco");
        
        mensaje.saveChanges();
        mensaje.writeTo(System.out);
        
        return mensaje;
    }
    
}
