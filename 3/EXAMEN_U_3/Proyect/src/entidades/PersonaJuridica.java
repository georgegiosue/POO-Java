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
public class PersonaJuridica extends Propietario{
    
    private String ruc;
    private String razonSocial;
    private String nombreRepresentante;
    private String fax;

    public PersonaJuridica() {
        super();
        this.ruc = "NN";
        this.razonSocial = "NN";
        this.nombreRepresentante = "NN";
        this.fax = "NN";
    }

    public PersonaJuridica(String ruc, String razonSocial, String nombreRepresentante, String fax, int codigo, String numero_telefono, String correo_electronico, String apellidos, String nombres) {
        super(codigo, numero_telefono, correo_electronico, apellidos, nombres);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.nombreRepresentante = nombreRepresentante;
        this.fax = fax;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreRepresentante() {
        return nombreRepresentante;
    }

    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public String toString(){
        return super.toString()+"RUC: "+getRuc()
                +"\nRazon Social: "+getRazonSocial()
                +"\nNombres del Representante: "+getNombreRepresentante()
                +"\nFax: "+getFax()+"\n";
    }

}
