/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;
import javax.swing.*;
/**
 *

 */
public class HabitacionOcupadaException extends Exception{

    public HabitacionOcupadaException() {
        super("HABITACIÓN OCUPADA");
    }
    
   
    public HabitacionOcupadaException(String message) {
        super(message);
    }
    
    @Override
    public String toString(){
        return "Se ah producido una Excepción "+this.getClass().getName()
                +"\n con en siguiente mensaje: "+this.getMessage()+"\n";
    }
    
}
