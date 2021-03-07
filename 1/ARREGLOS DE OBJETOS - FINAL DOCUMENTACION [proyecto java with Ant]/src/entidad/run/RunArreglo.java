/*
GUIA DEFINITIVA DE COMO CREAR UN ARREGLO DE OBJETOS
 */
package entidad.run;
import entidad.Arreglo; // IMPORTAMOS LA CLASE
/**
 *
 * @author GEORGE NAMOC
 */
public class RunArreglo {
    // COMO EN LA CLASE Arreglo HABIAMOS CREADO COMO ATRIBUTO UN ARREGLO DE INSTANCIA 
    
    // ARREGLO DE INSTANCIA QUIERE DECIR QUE CADA OBJETA TENDRA COMO ATRIBUTO UN ARREGLO
    
    
    // AHORA necesitamos crear 1 OBJETO DE MANERA GLOBAL [STATIC], EL CUAL
    // LO UTILIZAREMOS SOLO PARA GUARDAR EN SU ATRIBUTO (QUE CONSISTE EN UN ARREGLO)
    // OBJETOS DE LA CLASE Arreglo.
    
    private static Arreglo lista=new Arreglo(); // OBJETO CREADO
    
    
    // Creamos una referencia [STATIC] de la clase Arreglo el cual nos permite almacenar
    // TEMPORALMENTE objetos, que despues nosotros asignaremos al Arreglo del
    // objeto ( lista ).
    
    private static Arreglo objeto; // REFERENCIA CREADA
    
    
    // IMPORTANTE: Se definieron como STATIC, la referencia como el objeto para
    // ser utilizados por el metodo main, el cual es static.
    
    
    public static void main(String[] args) {
        
        // CREANDO OBJETOS Y ALMACENANDOLOS EN EL ARREGLO
        
                            // PASOS
                            
        // 1. Utilizamos la referencia creada globalmente para crear un objeto
        //    de manera local
        
        objeto = new Arreglo(); // Objeto creado
        
        // 2. Luego mediante cualquier metodo que defina usted para rellenar los
        //    atributos, se procede a almacenar el objeto en el arreglo del
        //    OTRO OBJETO DE MANERA GLOBAL QUE UTILIZAMOS SOLO PARA EL ARREGLO.
        //                                                            ( lista )
        
        
        lista.setObjectInArray(objeto);                       
   //   objeto              obejto creado
   // que contiene         con todos su atributos
   //  el arreglo
        
   //               EL OBJETO SE ALMACENO EN EL ARREGLO DEL OTRO OBJETO
   //                              EN LA POSICION 0
   
        
    }
    
}
