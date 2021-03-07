/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.*;
/**
 *
 * @author GEORGE
 */
public class Propietario extends Persona{
    
    private int codigo;
    private String numero_telefono,correo_electronico;
    private ArrayList <Inmuebles> lista_inmuebles = new ArrayList<>();
    private Iterator <Inmuebles> iterador_inmuebles;
    
    public Propietario(){
        super();
        this.codigo = 0;
        this.numero_telefono = "NN";
        this.correo_electronico = "NN";
    }

    public Propietario(int codigo, String numero_telefono, String correo_electronico, String apellidos, String nombres) {
        super(apellidos, nombres);
        this.codigo = codigo;
        this.numero_telefono = numero_telefono;
        this.correo_electronico = correo_electronico;
    }

    public ArrayList<Inmuebles> getLista_inmuebles() {
        return lista_inmuebles;
    }

    public void setLista_inmuebles(ArrayList<Inmuebles> lista_inmuebles) {
        this.lista_inmuebles = lista_inmuebles;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
    
    public String listarInmuebles(){
        String datos = "";
        iterador_inmuebles = lista_inmuebles.iterator();
        
        while(iterador_inmuebles.hasNext()){
            datos += iterador_inmuebles.next().toString();
        }
        
        return datos;
    }
    
    @Override
    public String toString(){
        return super.toString()+"Codigo: "+getCodigo()
               +"\nNumero de Telefono: "+getNumero_telefono()
               +"\nCorreo Electronico: "+getCorreo_electronico()+"\n";
    }
    
}
