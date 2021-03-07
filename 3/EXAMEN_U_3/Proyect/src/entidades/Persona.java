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
public class Persona {
    
    private String apellidos,nombres;
    
     public Persona() {
        this.apellidos = "NN";
        this.nombres = "NN";
    }

    public Persona(String apellidos, String nombres) {
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    @Override
    public String toString(){
        return "Apellidos: "+getApellidos()
                +"\nNombres: "+getNombres()+"\n";
    }

}
