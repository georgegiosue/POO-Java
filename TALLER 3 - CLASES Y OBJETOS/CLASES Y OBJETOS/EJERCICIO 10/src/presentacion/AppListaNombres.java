/*
De manera similar al problema anterior, genere una clase ListaNombres,
la cual tenga como atributo un arreglo que puede contener hasta 20 nombres.
En la clase se deben implementar los siguientes métodos:


a. Agregar un nombre.
b. Eliminar un nombre, si ingresa su posición.
c. Obtener un nombre dada su posición.
d. Dado un nombre cualquiera, verificar si se encuentra en el arreglo.
e. Insertar un nombre dada su posición.
f. Listar los nombres ordenados en forma ascendente.
 */
package presentacion;
import entidad.ListaNombres;
import static entidad.ListaNombres.TAM;
import javax.swing.JOptionPane;
/**
 *
 * @author GEORGE
 */
public class AppListaNombres {
    private static ListaNombres nombre;
    private static ListaNombres lista=new ListaNombres();
    
    public static int menu(){
        int opc;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"            \t          \t\tMENU\n"
                    + "1. Agregar un nombre.\n"
                    + "2. Eliminar un nombre, si ingresa su posición.\n"
                    + "3. Obtener un nombre dada su posición.\n"
                    + "4. Dado un nombre cualquiera, verificar si se encuentra en el arreglo.\n"
                    + "5. Insertar un nombre dada su posición.\n"
                    + "6. Listar los nombres ordenados en forma ascendente.\n"
                    + "7. SALIR\n","\t\t\tMENU",JOptionPane.QUESTION_MESSAGE));
        }while(opc<1||opc>7);
        return opc;
    }
    
    
    public static String ingresoDatos(){
        String nombre1=JOptionPane.showInputDialog(null,"Ingrese el nombre","INGRESO DE DATOS",JOptionPane.QUESTION_MESSAGE);
        return nombre1;
    }
    
    public static void main(String[] args) {
       int opc_;
       JOptionPane.showMessageDialog(null,"App Lista de Nombres","Bienvenido",JOptionPane.QUESTION_MESSAGE); 
       do{
           int opc=menu();
           opc_=opc;
        switch(opc){
            case 1: nombre=new ListaNombres();
                    nombre.setNombre(ingresoDatos());
                    lista.setNombreToArray(nombre);
                    break;
            case 2: lista.deleteNombreOfArray_posicion(Integer.parseInt(JOptionPane.showInputDialog(null,lista.printLista()+"\nDigite la posicion "
                    + "para su posterior eliminacion","ELIMINAR NOMBRE",JOptionPane.QUESTION_MESSAGE))-1);
                    JOptionPane.showMessageDialog(null,"La eliminacion a concluido\n"+lista.printLista());break;
            case 3: lista.getNombreOfArray_posicion(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la posicion para buscar el nombre","BUSQUEDA POR POSICION",JOptionPane.QUESTION_MESSAGE)));break;
            case 4: int psOfNombre=lista.searchNombreInArray(JOptionPane.showInputDialog(null,"Ingrese el nombre","VERIFICAR SI UN NOMBRE ESTA EN EL ARREGLO",JOptionPane.QUESTION_MESSAGE));
                    if(psOfNombre!=-1){
                        JOptionPane.showMessageDialog(null, "\tResultado de busqueda exitoso\n"
                                + lista.getNombreOfArray_posicion(psOfNombre).toString(),"BUSQUEDA DE NOMBRE EN EL ARREGLO",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "NO se han encontrado coincidencias :(","BUSQUEDA DE NOMBRE EN EL ARREGLO",JOptionPane.ERROR_MESSAGE);
                    }break;
            case 5: nombre=new ListaNombres();
                    nombre.setNombre(ingresoDatos());
                    lista.insertNombreInArray_posicion(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la posicion a insertar el nombre\n\n"
                            + lista.printLista(),"INSERTAR UN NOMBRE EN UNA POSICION",JOptionPane.QUESTION_MESSAGE))-1, nombre);
                    JOptionPane.showMessageDialog(null,"NOMBRE AGREGADO\n"+
                            lista.printLista(),"OPERACION EXITOSA",JOptionPane.INFORMATION_MESSAGE);break;
            case 6: JOptionPane.showMessageDialog(null,lista.printNombresAscendente(),"LISTA DE NOMBRES EN ORDEN ASCENDENTE",JOptionPane.INFORMATION_MESSAGE);
        }
       }while(opc_!=7);
    }
}
