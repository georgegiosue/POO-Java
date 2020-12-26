/*
GUIA DEFINITIVA DE COMO CREAR UN ARREGLO DE OBJETOS
 */
package entidad;

/**
 *
 * @author GEORGE NAMOC
 */
public class Arreglo {
    /* PRIMERO SE CREA EL ARREGLO DE INSTANCIA 
     COMO ATRIBUTO DE LOS OBJETOS [VISIBILIDAD : PRIVATE]*/
    
    
    // Y UNA CONSTANTE QUE DEFINA SU TAMAÑO.       [VISIBILIDAD: PUBLIC]
    
    
    
    public final int TAMAÑO=16;
                        
    private Arreglo arreglo_1[]=new Arreglo[16];
    
    // Ahora que ya tenemos el arreglo, lo siguiente es crear una variable de
    // instancia [Pertenece a cada uno de los objetos] que nos defina la
    // posicion de cada objeto en el Arreglo [VISIBILIDAD: PRIVATE]
    
    private int posicion=-1; // Lo inicializamos en -1; ya que al crear nuestro
                             // primer objeto el valor por defecto en el arreglo
                             // sera el indice 0. Osea ocupara la primera posicion.
    
    //  Creamos un metodo que nos devuelva el arreglo cada vez que lo solicitamos
    //  al objeto que lo va a contener.
    
    public Arreglo[] getArreglo_1() {
        return arreglo_1;
    }

    // Creamos otro metodo que nos devuelva cuantos objetos tenemos creados.

    public int getPosicion() {
        return posicion;
    }
    
    // Metodo que permite GUARDAR UN OBJETO DENTRO DEL ARREGLO
    
    public void setObjectInArray(Arreglo objeto){ // Enviamos como argumento un
                                                  // objeto de la clase Arreglo
                                                  
                                                  
        
        posicion ++; // AUMENTAMOS LA POSICION EN 1
        
        getArreglo_1()[posicion]=objeto; // LUEGO INVOCAMOS AL METODO getArreglo_1
                                         // EL CUAL NOS DEVOLVERA EL ARREGLO
                                         // getArreglo_1() === arreglo_1
                                         
                                         // POR LO TANTO ABRIMOS CORCHETES Y 
                                         // ASIGNAMOS A LA VARIABLE POSICION COMO
                                         // INDICE DEL ARREGLO: NOS QUEDARIA ASI:
                                         
                                         // getArreglo_1()[posicion] == arreglo_1[posicion]
    }
    
    
    
}
