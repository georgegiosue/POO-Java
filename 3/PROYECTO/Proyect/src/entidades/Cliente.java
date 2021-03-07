/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *

 */
public class Cliente extends Persona{
    
    private String nacionalidad;
    private String tel_contacto;

    public Cliente(){
        super();
        this.nacionalidad = "NN";
        this.tel_contacto = "NN";
    }
    
    public Cliente(String nacionalidad, String tel_contacto,String nombre, String apellidos, Doc_Identidad doc_Identidad) {
        super(nombre, apellidos, doc_Identidad);
        this.nacionalidad = nacionalidad;
        this.tel_contacto = tel_contacto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTel_contacto() {
        return tel_contacto;
    }

    public void setTel_contacto(String tel_contacto) {
        this.tel_contacto = tel_contacto;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"Nacionalidad: "+getNacionalidad()
                +"\nTelefono de contacto: "+getTel_contacto()+"\n";
    }
    
}
