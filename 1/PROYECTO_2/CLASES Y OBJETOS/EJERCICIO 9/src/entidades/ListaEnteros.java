/*
Crear una clase ListaEnteros, la cual tenga como atributo un arreglo
que puede contener hasta 20 números. La clase debe contener los siguientes métodos:
a. Agregar un número entero.
b. Eliminar un número, si ingresa su posición.
c. Obtener un entero dada su posición.
d. Dado un número entero cualquiera, verificar si se encuentra en el arreglo.
e. Insertar un entero dada su posición.
f. Listar los números ordenados en forma descendente.
 */
package entidades;

/**
 *
 * @author luisr
 */
public class ListaEnteros {
    public static final int TAM=20;
    Entero listaDeEnteros[]=new Entero[TAM];
    private int posicion=-1;

    public Entero[] getListaDeEnteros() {
        return listaDeEnteros;
    }

    public void setListaDeEnteros(Entero[] listaDeEnteros) {
        this.listaDeEnteros = listaDeEnteros;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public int getTamaño(){
       return listaDeEnteros.length;
    }
    
    public int getNumeroElementos(){
       return getPosicion()+1;
    }
    
    public void setEntero(Entero entero){
        if(posicion==TAM-1){
            nuevaLista();
        }
        posicion++;
        listaDeEnteros[posicion]=entero;
    }
    
    public void nuevaLista(){
       Entero aux[]=new Entero[getTamaño()+TAM];
        for(int i=0;i<=posicion;i++){
            aux[i]=listaDeEnteros[i];
        }
        listaDeEnteros=aux;
    }
    
    public Entero getEntero(int posicion){
     if(posicion>=0 && posicion<=this.posicion){
        return listaDeEnteros[posicion];
        }
    return null;
    }
    
    public int buscarEntero(int numEntero){
        for(int i=0; i<=posicion; i++){
            if(numEntero == listaDeEnteros[i].getNumEntero()){
                return i;
            }
        }
        return -1;
    }
}
