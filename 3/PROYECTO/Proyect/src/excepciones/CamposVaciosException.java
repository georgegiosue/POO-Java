/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *

 */
public class CamposVaciosException extends Exception{

    public CamposVaciosException() {
        super("El campo de texto no puede quedar vacio");
    }

    public CamposVaciosException(String message) {
        super(message);
    }
    
    @Override
    public String toString(){
        return "Se ah producido una Excepción "+this.getClass().getName()
                +"\n con en siguiente mensaje: "+this.getMessage()+"\n";
    }
    
}
