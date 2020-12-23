/*
 Crear una clase ListaEnteros, la cual tenga como atributo un arreglo que puede contener hasta 20
números. La clase debe contener los siguientes métodos:
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
public class Entero {
    private int numEntero;

    public int getNumEntero() {
        return numEntero;
    }

    public void setNumEntero(int numEntero) {
        this.numEntero = numEntero;
    }
    
    @Override
    public String toString(){
        return numEntero+"";
    }
}
