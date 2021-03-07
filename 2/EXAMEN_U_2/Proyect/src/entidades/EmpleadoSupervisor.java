/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author GEORGE
 */
public class EmpleadoSupervisor {
    private String nombre,apellidos,dni;
    
    public EmpleadoSupervisor(){
        this.nombre="NA";
        this.apellidos="NA";
        this.dni="MA";
    }

    public EmpleadoSupervisor(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\n"
                + "Apellidos: "+getApellidos()+"\n"
                + "DNI: "+getDni()+"\n";
    }
}
