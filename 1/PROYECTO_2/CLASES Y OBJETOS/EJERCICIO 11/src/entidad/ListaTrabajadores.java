/*
 * Implementar una clase coleccionadora ListaTrabajadores. Reutilice la clase Trabajador, 
   implementada en el ejercicio 1. La clase debe ser capaz de:
a. Ingresar un trabajador dado.
b. Eliminar un trabajador dada su posición.
c. Obtener el trabajador dada su posición.
d. Buscar si un trabajador existe dado su nombre.
e. Reportar la relación de trabajadores ordenados en forma ascendente por el nombre.
f. Reportar la relación de trabajadores ordenados en forma descendente por el sueldo neto.
 */
package entidad;
import entindades.Trabajador;
/**
 *
 * @author GEORGE
 */
public class ListaTrabajadores {
    public static final int TAM=16;
    Trabajador listaT[]=new Trabajador[TAM];
    private int posicion=-1;

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

   public void setListaT(Trabajador[] listaT){
       this.listaT=listaT;
   }
   
   public Trabajador[] getListaT(){
       return listaT;
   }
   
   public int getPosicion(){
       return posicion;
   }
   
   public int getTamaño(){
       return listaT.length;
   }
   
   public int getNumeroElementos(){
       return getPosicion()+1;
   }
   
   public void setTrabajador(Trabajador trabajador){
       if(posicion==TAM-1){
           nuevaLista();
       }
       posicion++;
       listaT[posicion]=trabajador;
   }
   
   public void nuevaLista(){
       Trabajador aux[]=new Trabajador[getTamaño()+TAM];
       for(int i=0;i<=posicion;i++){
           aux[i]=listaT[i];
       }
       listaT=aux;
   }
   
   public Trabajador getTrabajador(int posicion){
     if(posicion>=0 && posicion<=this.posicion){
        return listaT[posicion];
    }
    return null;
}
   public int buscarPorNombre(String nombre){
       for(int i=0;i<=posicion;i++){
           if(nombre.compareToIgnoreCase(listaT[i].getNombre())==0){
               return i;
           }
       }
       return -1;
   }
   

    
}
