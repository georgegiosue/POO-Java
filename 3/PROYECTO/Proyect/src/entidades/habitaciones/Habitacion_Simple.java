/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.habitaciones;
import entidades.*;
/**
 *

 */
public class Habitacion_Simple extends Habitacion implements Tipo_Habitacion {

    public Habitacion_Simple() {
        super();
    }

    public Habitacion_Simple(String numero, boolean disponibilidad, float precio_noche, Reserva reserva) {
        super(numero, disponibilidad, precio_noche, reserva);
    }
    
    @Override
    public String getTipo() {
        return tipos_Habitaciones[0];
    }
    
    @Override
    public String toString(){
        return "Tipo: "+getTipo()
                +super.toString();
    }
    
}
