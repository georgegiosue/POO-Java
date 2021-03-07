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
public class Hotel {
    
    private Persona dueño;
    private String nombre_hotel;
    private final int numero_pisos = 4;
    private final int capacidadT_habitaciones = 30;
    public ArrayList <Piso> pisos;
    private Iterator <Piso> iterador_pisos; 
    
    
    
    public Hotel(){  // CONSTRUCTOR CREADOR HOTELES Y PISOS
        
        //Dueño
        
        dueño = new Persona();
        
        //
            
        //Pisos
        
        pisos = new ArrayList<Piso>(numero_pisos);
        
        for(int i=0;i<numero_pisos;i++)
        pisos.add(new Piso());
        
        //
        
        this.nombre_hotel = "NN";
        
        
    }

    public Hotel(Persona dueño, ArrayList <Piso> pisos, String nombre_hotel) {
        
        this.dueño = dueño;
        this.pisos = pisos;
        this.nombre_hotel = nombre_hotel;
    }
    
    // Inicio Clase Interna Piso
    
    public class Piso {
        
        private ArrayList <Habitacion> habitaciones;
        private Iterator <Habitacion> iterador_habitaciones;
        private int numero_piso;

        public Piso() { // CONSTRUCTOR CREADOR PISOS Y HABITACIONES
            
            this.numero_piso = 0;
            
            //Habitaciones
        
            habitaciones = new ArrayList<Habitacion>(capacidadT_habitaciones); // OBSERVACION

            //
        }
        
        public Piso(ArrayList<Habitacion> habitaciones, int numero_piso) {
            this.habitaciones = habitaciones;
            this.numero_piso = numero_piso;
        }

        public int numeroHabitaciones(){
            return habitaciones.size();
        }
        
        public String datos_habitaciones(){
            String datos="";
            iterador_habitaciones = habitaciones.iterator();
            
            while(iterador_habitaciones.hasNext()){
                datos+=iterador_habitaciones.next().toString();
            }
            
            return datos;
        }
        
        public String toString(){
            return  "Numero de piso: "+numero_piso
                    +"\n      Habitaciones\n"
                    +datos_habitaciones()+"\n";
        }
    }
    
    // Fin Clase Interna Piso
    
    public Persona getDueño() {
        return dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }

    public int getNumero_pisos(){
        return numero_pisos;
    }
    
    public int getNumero_Habitaciones(){
        return capacidadT_habitaciones;
    }
    
    public String datos_pisos(){
        String datos = "";
        iterador_pisos = pisos.iterator();
        
        while(iterador_pisos.hasNext()){
            datos+=iterador_pisos.next().toString();
        }
        
        return datos;
    }

    public String getNombre_hotel() {
        return nombre_hotel;
    }

    public void setNombre_hotel(String nombre_hotel) {
        this.nombre_hotel = nombre_hotel;
    }
    
    @Override
    public String toString(){
        return  "Nombre del Hotel: "+getNombre_hotel()
                +"\nDueño: "+getDueño().toString()
                +"\nNumero de pisos: "+getNumero_pisos()
                +"\nHabitaciones Totales: "+getNumero_Habitaciones()+"\n\n"
                +"      Pisos\n"
                +datos_pisos()+"\n\n";
    }
   
}
