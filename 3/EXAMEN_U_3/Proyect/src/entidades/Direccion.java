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
public class Direccion {
    
    private String calle;
    private String urbanizacion;
    private int numero;
    private String interior_piso;

    public Direccion() {
        this.calle = "NN";
        this.urbanizacion = "NN";
        this.interior_piso = "NN";
        this.numero = 0;
    }

    public Direccion(String calle, String urbanizacion, int numero, String interior_piso) {
        this.calle = calle;
        this.urbanizacion = urbanizacion;
        this.numero = numero;
        this.interior_piso = interior_piso;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getInterior_piso() {
        return interior_piso;
    }

    public void setInterior_piso(String interior_piso) {
        this.interior_piso = interior_piso;
    }
    
    @Override
    public String toString(){
        return "Calle: "+getCalle()
               +"\nUrbanizacion: "+getUrbanizacion()
               +"\nNumero: "+getNumero()
               +"\nInterior o Piso: "+getInterior_piso()+"\n";
    }
    
}
