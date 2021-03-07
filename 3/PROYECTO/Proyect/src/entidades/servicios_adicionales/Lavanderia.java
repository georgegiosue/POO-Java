/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.servicios_adicionales;

import entidades.*;

/**
 *

 */
public class Lavanderia {
    
    private String numero_habitacion;
    private Fecha fecha;
    private String descripcion;
    private float costo;

    public Lavanderia() {
        numero_habitacion = "NN";
        fecha = new Fecha();
        descripcion = "NN";
        costo = 0f;
    }

    public Lavanderia(String numero_habitacion, Fecha fecha, String descripcion, float costo) {
        this.numero_habitacion = numero_habitacion;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public String getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(String numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    @Override
    public String toString(){
        return "Numero de Habitacion: "+getNumero_habitacion()
               +"\nFecha de Servicio: "+getFecha().toString()
               +"\nDescripcion: "+getDescripcion()
               +"\nCosto: S/."+getCosto()+"\n";
    }
   
}
