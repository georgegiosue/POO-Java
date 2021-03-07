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
public class Habitacion_Triple extends Habitacion implements Tipo_Habitacion {

    public Habitacion_Triple() {
        super();
    }

    public Habitacion_Triple(String numero, boolean disponibilidad, float precio_noche, Reserva reserva) {
        super(numero, disponibilidad, precio_noche, reserva);
    }
    
    @Override
    public String getTipo() {
        return tipos_Habitaciones[2];
    }
    
    @Override
    public String toString(){
        return "Tipo: "+getTipo()
                +super.toString();
    }
}
