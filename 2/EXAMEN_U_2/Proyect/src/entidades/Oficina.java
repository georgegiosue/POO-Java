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
public class Oficina {
    private String nombre;
    
    public Oficina(){
        this.nombre="NA";
    }

    public Oficina(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Nombre de la oficina: "+getNombre()+"\n\n";
    }
}
