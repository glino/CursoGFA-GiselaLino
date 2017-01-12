/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

import persona.Persona;

/**
 *
 * @author gi.lino
 */
public abstract class Empleado extends Persona {
    
    private int cveEmpleado;
    private float salario; 
    
    public Empleado(String nombre, String apellido, int edad,
                    int cveEmpleado, float salario) {
        super(nombre, apellido, edad);
        this.cveEmpleado = cveEmpleado;
        this.salario     = salario;
    }

    public abstract void trabajar();
    
    public abstract void transporteTorta();
    
    
    
}
