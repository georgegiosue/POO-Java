/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *

 */
public class Persona {
    private String nombre;
    private String apellidos;
    private Doc_Identidad doc_Identidad;

    
    public Persona() {
        this.nombre = "NN";
        this.apellidos = "NN";
        this.doc_Identidad = new Doc_Identidad();
    }

    public Persona(String nombre, String apellidos, Doc_Identidad doc_Identidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.doc_Identidad = doc_Identidad;
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

    public Doc_Identidad getDoc_Identidad() {
        return doc_Identidad;
    }

    public void setDoc_Identidad(Doc_Identidad doc_Identidad) {
        this.doc_Identidad = doc_Identidad;
    }
    
    @Override
    public String toString(){
        return "Apellidos: "+getApellidos()
                +"\nNombres: "+getNombre()
                +"\n"+getDoc_Identidad().toString()+"\n";
    }
    
}
