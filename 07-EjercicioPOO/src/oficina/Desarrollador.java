/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

/**
 *
 * @author gi.lino
 */
public class Desarrollador extends Empleado {

    public Desarrollador(String nombre, String apellido, int edad, int cveEmpleado, float salario) {
        super(nombre, apellido, edad, cveEmpleado, salario);
    }

    
    @Override
    public void trabajar() {
        System.out.println("Codifica, Desarrolla, etc.");
    }

    @Override
    public void transporteTorta() {
        System.out.println("Trafica con tortas con sobres amarillos.");
    }
    
    
}
