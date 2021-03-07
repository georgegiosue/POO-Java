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
public class Inmuebles implements Impuesto{
    
    private int codigo;
    private float extensionT;
    private float areaConstruida;
    private Fecha fecha;
    private String materialVivienda;
    private String zonificacion;
    private Direccion direccion;
    private ArrayList <Propietario> lista_Propietarios = new ArrayList<>();
    private Iterator <Propietario> iterador_propietarios;
    
    public static final String tipos_Zonificacion[] = {"URBANA","RURAL"};

    public Inmuebles() {
        this.codigo = 0;
        this.extensionT = 0f;
        this. areaConstruida = 0f;
        this.materialVivienda = "NN";
        this.zonificacion = "NN";
        direccion = new Direccion();
        lista_Propietarios = new ArrayList<>();
    }

    public Inmuebles(int codigo, float extensionT, float areaConstruida, String materialVivienda, byte zonificacion, Direccion direccion,ArrayList <Propietario> lista_Propietarios) {
        this.codigo = codigo;
        this.extensionT = extensionT;
        this.areaConstruida = areaConstruida;
        this.materialVivienda = materialVivienda;
        this.zonificacion = tipos_Zonificacion[zonificacion];
        this.direccion = direccion;
        this.lista_Propietarios = lista_Propietarios;
    }

    public ArrayList<Propietario> getLista_PropietariosArray() {
        return lista_Propietarios;
    }

    public void setLista_Propietarios(ArrayList<Propietario> lista_Propietarios) {
        this.lista_Propietarios = lista_Propietarios;
    }
    
    public String listarPropietarios(){
        
        String datos = "";
        iterador_propietarios = lista_Propietarios.iterator();
        
        while(iterador_propietarios.hasNext()){
            datos+=iterador_propietarios.next().toString();
        }
        
        return datos;
    }
    
    public ArrayList<Propietario> getListaPropietarios(){
        return lista_Propietarios;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getExtensionT() {
        return extensionT;
    }

    public void setExtensionT(float extensionT) {
        this.extensionT = extensionT;
    }

    public float getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(float areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public String getMaterialVivienda() {
        return materialVivienda;
    }

    public void setMaterialVivienda(String materialVivienda) {
        this.materialVivienda = materialVivienda;
    }

    public String getZonificacion() {
        return zonificacion;
    }

    public void setZonificacion(String zonificacion) {
        this.zonificacion = zonificacion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
    @Override
    public float impuestoPagar(float m2Construido) {
        switch (zonificacion) {
            case "URBANA": return m2Construido*zonaUrbana;
            case "RURAL": return m2Construido*zonaRural;
                default: return 0f;
        }
    }
    
    @Override
    public String toString(){
        return "Codigo: "+getCodigo()
               +"\nExtension Total: "+getExtensionT()+"m^2"
               +"\nArea Construida: "+getAreaConstruida()+"m^2"
               +"\nMaterial: "+getMaterialVivienda()
               +"\nZonificacion: "+getZonificacion()
               +"\n"+getDireccion().toString()
               +"\n         Propietarios"
               +"\n"
               +listarPropietarios()+"\n"
               +"Impuesto: S/."+impuestoPagar(areaConstruida)
               +"Fecha de Registro: "+getFecha().toString();
    }

}
