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
package presentacion;

import entidades.*;
import javax.swing.*;

/**
 *
 * @author luisr
 */
public class appEnteros {
    static Entero entero;
    static ListaEnteros lista=new ListaEnteros();
    static Entero entero_aux;
    
    public static int menu(){
        int rpta;
        do{
        rpta=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la opcion correspondiente\n"
                + "\n[1]  Agregar un Número Entero\n"
                + "[2]  Eliminar un Número Entero\n"
                + "[3]  Buscar un Número Entero dada su Posición\n"
                + "[4]  Verificar si un Número Entero está en el Arreglo\n"
                + "[5]  Insertar un Número Entero dada su Posición\n"
                + "[6] Listar los Números Enteros en Forma Descendente","MENU ",1));
        if (rpta<1 || rpta>6){
            JOptionPane.showMessageDialog(null,"Digito Incorrepto\n Vuelva a intentarlo","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
        }while(rpta<1 || rpta>7);
        return rpta;
    }
    
    public static void ingresoDatos(){
        do{
            entero.setNumEntero(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero: \n","Ingreso de datos", 3)));
        }while((entero.getNumEntero())<0);
    }
    
    public static void eliminarEntero(int posicion){
        int ps=posicion;
        for(int i=ps;i<=lista.getPosicion()-1;i++){
            lista.getListaDeEnteros()[i]=lista.getListaDeEnteros()[i+1];
        }
        lista.setPosicion(lista.getPosicion()-1);
        JOptionPane.showMessageDialog(null,"El número entero a sido eliminado con éxito","Eliminar Número Entero",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void insertarEntero(int posicion, Entero entero){
        lista.setPosicion(lista.getPosicion()+1);
        for(int i=posicion;i<=lista.getPosicion();i++){
            lista.getListaDeEnteros()[i+1]=lista.getListaDeEnteros()[i];
        }
        lista.getListaDeEnteros()[posicion]=entero;
    }
    
    public static int buscarEntero(){
        int rpt;
        String enteros="Lista de Números Enteros\n";
        for(int i=0;i<=lista.getPosicion();i++){
            enteros+=(i+1)+"°.        "+lista.getEntero(i)+"\n";
        }
        rpt=Integer.parseInt(JOptionPane.showInputDialog(null,enteros+"\nIngrese la posición del número: ","Buscar Número Entero",JOptionPane.INFORMATION_MESSAGE));
        return rpt-1;   
    }
    
    public static void buscarEntero2(){
        int ps= lista.buscarEntero(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero: \n","Buscar Número Entero", 3)));
        if(ps!=-1){
            JOptionPane.showMessageDialog(null,"Busqueda Exitosa\n"+lista.getEntero(ps)+"\nNumero Entero: ","Buscar Número Entero",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"No se encontró coincidencias","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static int buscarEntero3(){
        int rpt;
        rpt=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la posición del número: ","Buscar Número Entero",JOptionPane.INFORMATION_MESSAGE));
        return rpt-1;   
    }
    
    public static void ordenarEnteros(){
        for(int i=0;i<=lista.getPosicion();i++){
            for(int j=0;i<=lista.getPosicion() && i!=j;j++){
                if(lista.getListaDeEnteros()[i].getNumEntero()>lista.getListaDeEnteros()[j].getNumEntero()){
                    entero_aux=lista.getListaDeEnteros()[j];
                    lista.getListaDeEnteros()[j]=lista.getListaDeEnteros()[i];
                    lista.getListaDeEnteros()[i]=entero_aux;
                }
            }
        }
        
        String Enteros="\n";
        for(int i=0;i<=lista.getPosicion();i++){
            Enteros+=(i+1)+"°.        "+lista.getEntero(i)+"\n";
            
        }
        JOptionPane.showMessageDialog(null,"Lista de números enteros ordenados en forma descendente\n"+Enteros,"Orden Descendente",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        int rt;
        JOptionPane.showMessageDialog(null, "Arreglo de Números Enteros", "Ejercicio 09", 1);
        do{
            switch(menu()){
                case 1: entero=new Entero();
                        ingresoDatos();
                        lista.setEntero(entero);
                        JOptionPane.showMessageDialog(null,"\tEl registro a sido exitoso\n","Registro de Datos",JOptionPane.INFORMATION_MESSAGE);break;
                case 2: eliminarEntero(buscarEntero3());break;
                case 3: entero=lista.getEntero(buscarEntero3());
                        JOptionPane.showMessageDialog(null,"Numero Entero: "+entero.getNumEntero(),"Resultados",JOptionPane.INFORMATION_MESSAGE);break;
                case 4: buscarEntero2();break;
                case 5: entero=new Entero();
                        ingresoDatos();
                        insertarEntero(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la Posición","Ingreso Número Entero",1)), entero);
                        JOptionPane.showMessageDialog(null,"\tEl registro a sido exitoso\n","Registro de Datos",JOptionPane.INFORMATION_MESSAGE);break;
                case 6: ordenarEnteros();break;
            }
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra Operación?\n");
        }while(rt!=1);     
    }
}
