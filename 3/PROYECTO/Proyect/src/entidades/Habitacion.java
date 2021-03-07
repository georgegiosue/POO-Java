/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.*;
/**
 *
 */
public abstract class Habitacion    {

    private String numero;
    private boolean disponibilidad;
    private float precio_noche;
    private Reserva reserva;
            
    public Habitacion(){
        this.numero = "NN";
        this.disponibilidad = false;
        this.precio_noche  = 0f;
    }

    public Habitacion(String numero, boolean disponibilidad,float precio_noche, Reserva reserva) {
        this.numero = numero;
        this.disponibilidad = disponibilidad;
        this.precio_noche = precio_noche;
        this.reserva = reserva;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDisponibilidad() {
        String estado = (disponibilidad==true)?"disponible":"ocupada"; 
        return estado;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public float getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(float precio_noche) {
        this.precio_noche = precio_noche;
    }

    public String getReserva() {
        return reserva.toString();
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    
    @Override
    public String toString(){
        return  "\nNumero: "+getNumero()
                +"\nDisponibilidad: "+getDisponibilidad()
                +"\nPrecio por noche: S/."+getPrecio_noche()
                +"\n          Reserva"
                +"\n"+getReserva()+"\n";

    }

}
