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
public class PersonaNatural extends Propietario{
    
    private String dni;

    public PersonaNatural() {
        super();
        this.dni = "NN";
    }

    public PersonaNatural(String dni, int codigo, String numero_telefono, String correo_electronico, String apellidos, String nombres) {
        super(codigo, numero_telefono, correo_electronico, apellidos, nombres);
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString(){
        return super.toString()+"DNI: "+getDni()+"\n";
    }

}
