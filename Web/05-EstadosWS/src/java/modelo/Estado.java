/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gi.lino
 */
public class Estado {
   private int idEstado; 
   private String nombre;
   private int municipios;
   private String capital;
   private String comidaTipica;
   private int poblacion;

    public Estado(int idEstado, String nombre, int municipios, String capital, String comidaTipica, int poblacion) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.municipios = municipios;
        this.capital = capital;
        this.comidaTipica = comidaTipica;
        this.poblacion = poblacion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMunicipios() {
        return municipios;
    }

    public void setMunicipios(int municipios) {
        this.municipios = municipios;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getComidaTipica() {
        return comidaTipica;
    }

    public void setComidaTipica(String comidaTipica) {
        this.comidaTipica = comidaTipica;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
   
    
    
}
