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
public class Habitacion_Matrimonial  extends Habitacion implements Tipo_Habitacion {

    public Habitacion_Matrimonial() {
        super();
    }

    public Habitacion_Matrimonial(String numero, boolean disponibilidad, float precio_noche, Reserva reserva) {
        super(numero, disponibilidad, precio_noche, reserva);
    }
    
    @Override
    public String getTipo() {
        return tipos_Habitaciones[3];
    }
    
    @Override
    public String toString(){
        return "Tipo: "+getTipo()
                +super.toString();
    }
}
