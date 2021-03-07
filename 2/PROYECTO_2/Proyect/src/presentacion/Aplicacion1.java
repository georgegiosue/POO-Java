/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import entidades.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Aplicacion1 {
    private static ArrayList<Figura> listaRectangulos = new ArrayList<>();
    private static Iterator<Figura> iterator;
    private static Figura figura;
    
    public static int repertorio(){
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                  "[1]  Registrar los datos de una Figura.\n"
                + "[2]  Actualizar los datos de una Figura.\n"
                + "[3]  Listar las Figuras.\n"
                + "[4]  Salir.\n\n",
                 "[ Digite una Opción ]",1));
            
            if (opcion<1 || opcion>4){
            JOptionPane.showMessageDialog(null,"  Digito Incorrecto\n Ingrese una opción nuevamente","[ Error ]",2);
            }
        } while(opcion<1 || opcion>4);
        
        return opcion;
    }
    
    
    public static void ingresoDatos(){
        do{
            String nombre, color;
            float coordenada_X, coordenada_Y, ladoMenor, ladoMayor; 
            nombre = "Rectángulo";
            color = JOptionPane.showInputDialog(null, "  Digite el color de su figura: ","[ Registro de Datos ]", 3);
            coordenada_X = Float.parseFloat(JOptionPane.showInputDialog(null, "  Digite la coordenada X: ","[ Registro de Datos ]", 3));
            coordenada_Y = Float.parseFloat(JOptionPane.showInputDialog(null, "  Digite la coordenada Y: ","[ Registro de Datos ]", 3));
            ladoMayor = Float.parseFloat(JOptionPane.showInputDialog(null, "  Digite la medida del lado mayor: \n  Considere Centímetros.","[ Registro de Datos ]", 3));
            ladoMenor = Float.parseFloat(JOptionPane.showInputDialog(null, "  Digite la medida del lado menor: \n  Considere Centímetros.","[ Registro de Datos ]", 3));
            if(ladoMenor>ladoMayor){
                JOptionPane.showMessageDialog(null,"  Error \n  Vuelva a digitar la medida del lado menor.","[ Mensaje ]",2);
                ladoMenor = Float.parseFloat(JOptionPane.showInputDialog(null, "  Digite la medida del lado menor: ","[ Registro de Datos ]", 3));            
            }
            Punto coordenadas = new Punto(coordenada_X, coordenada_Y);
            Linea lado_Mayor = new Linea(ladoMayor, 0.0f);
            Linea lado_Menor = new Linea(ladoMenor, 90.0f);
            figura = new Rectangulo(lado_Menor, lado_Mayor, coordenadas, color, nombre);
            listaRectangulos.add(figura);
            JOptionPane.showMessageDialog(null,"  Registro Exitoso.","[ Mensaje ]",1);
        }while(ciclo());  
    }
    
    public static boolean ciclo(){
        boolean respuesta=true;
        if(JOptionPane.showConfirmDialog(null,"¿Desea realizar otra operación?")!=JOptionPane.YES_OPTION)
        {   
            respuesta=false;
        }
        return respuesta;
    }
    
    public static void actualizarDatos(){
        int opc;
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el N° del rectángulo a modificar: ","[ Actualizar Datos ]",3));
    }
    
    public static String listar(){
        String lista = "";    
        int n = 1;
        iterator = listaRectangulos.iterator();
        while(iterator.hasNext()) {
            lista += "[ "+ n + " ]  Rectángulo";
            lista += iterator.next().toString();
            n=n+1;
        }
        return lista; 
    }
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"                  INTEGRANTES\n\n"
                + "1. Cerna Alvarado, Jhon Segundo\n"
                + "2. Huacachi Garcia, Irvin Guillermo\n"
                + "3. Peraldo Namoc, George Giosue\n"
                + "4. Perez Vargas, Karen Priscilla\n"
                + "5. Romero Pretel, Luis Marco\n"
                + "6. Salazar Teran, Dalila Katherine\n\n","GRUPO-5",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "  Aplicación 1", "[ Datos de Figuras ]", 1);
        int rpta_;
        do{
            int rpta=repertorio();
            rpta_=rpta;
            switch(rpta){
                case 1: {
                    JOptionPane.showMessageDialog(null,"  Registro de Datos","[ Mensaje ]",1);
                    ingresoDatos();
                    break;
                }
                case 2: {
                    // No Disponible :(
                    JOptionPane.showMessageDialog(null,"  Actualizar Datos","[ Mensaje ]",1);
                    actualizarDatos();
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null, listar(),"[ Lista de Datos ]",1);
                    break;
                }
            }
        }while(rpta_!=4);
    }
}
