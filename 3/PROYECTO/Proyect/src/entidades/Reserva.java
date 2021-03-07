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
public class Reserva {
    
    private ArrayList <Cliente> huespedes;
    private Iterator <Cliente> iterador_huespedes;
    private Fecha fecha_reserva;
    private int numero_personas;
    private int numero_dias;
    private ArrayList <Object> servicios_adicionales;
    private Iterator <Object> iterador_servicios;
    
    //AGREGAR FECHA DE FIN DE RESERVA [PENDIENTE]
    public Reserva(){
        fecha_reserva = new Fecha();
        huespedes = new ArrayList<Cliente>();
        numero_dias = 0;
        numero_personas = huespedes.size();
        servicios_adicionales = new ArrayList<>();
    }

    public Reserva(ArrayList<Cliente> huespedes, Fecha fecha_reserva, int numero_dias) {
        this.huespedes = huespedes;
        this.fecha_reserva = fecha_reserva;
        this.numero_dias = numero_dias;
        numero_personas = huespedes.size();
    }
    
    public Reserva(ArrayList<Cliente> huespedes, Fecha fecha_reserva, int numero_dias, ArrayList <Object> servicios_adicionales) {
        this.huespedes = huespedes;
        this.fecha_reserva = fecha_reserva;
        this.numero_dias = numero_dias;
        numero_personas = huespedes.size();
        this.servicios_adicionales = servicios_adicionales;
    }

    public ArrayList<Cliente> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(ArrayList<Cliente> huespedes) {
        this.huespedes = huespedes;
    }

    public Fecha getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Fecha fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public int getNumero_personas() {
        return numero_personas;
    }

    public void setNumero_personas(int numero_personas) {
        this.numero_personas = numero_personas;
    }

    public int getNumero_dias() {
        return numero_dias;
    }

    public void setNumero_dias(int numero_dias) {
        this.numero_dias = numero_dias;
    }

    public void ampliarDias(int dias){  // Ampliar dias de reserva
        this.numero_dias += dias;
    }
    
    public String datosHuespedes(){
        String datos = "";
        iterador_huespedes = huespedes.iterator();
        
        while(iterador_huespedes.hasNext()){
            datos += iterador_huespedes.next().toString();
        }
        
        return datos;
    }
    
    public String datosServiciosAdicionales(){
        String datos_S = "";
        iterador_servicios = servicios_adicionales.iterator();
        
        while(iterador_servicios.hasNext()){
            datos_S += iterador_servicios.next().toString();
        }
        return datos_S;
    }
    
    @Override
    public String toString(){
        return "Fecha de Reserva: "+getFecha_reserva().toString()
               +"\nNumero de dias: "+getNumero_dias()
               +"\nNumero de personas: "+getNumero_personas()
               +"\n    Huespedes\n"
               +datosHuespedes()+"\n";
    }
    
}
