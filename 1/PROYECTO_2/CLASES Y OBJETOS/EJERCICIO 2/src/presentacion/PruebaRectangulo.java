/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import entidades.Rectangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author luisr
 */
public class PruebaRectangulo {
    private static Rectangulo t1;
    
    public static void ingresoDatos(){
        float longitud, ancho;
        
        do {
            longitud = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la medida [metros]: \n", "Ingreso de LONGITUD", 3));
            if(longitud<=0 || longitud>=20){
                JOptionPane.showMessageDialog(null, "La medida de la LONGITUD debe ser \nmayor a cero y menor a veinte", "Mensaje", 2);
            }
            else{
                JOptionPane.showMessageDialog(null, "La medida de la LONGITUD fue ingresada correctamente", "Mensaje", 1);
            }
        }while(longitud<0 || longitud>19);
        
        do {
            ancho = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la medida [metros]: \n", "Ingreso de ANCHO", 3));
        }while(ancho<0 || ancho>19);
        if(ancho<=0 || longitud>=20){
                JOptionPane.showMessageDialog(null, "La medida del ANCHO debe estar ser \nmayor a cero y menor a veinte", "Mensaje", 2);
        }
        else{
                JOptionPane.showMessageDialog(null, "La medida del ANCHO fue ingresada correctamente", "Mensaje", 1);
        }
        
        t1.setAncho(ancho);
        t1.setLongitud(longitud);
    }
    
    public static void mostrarResultados() {
        String mensaje = "Las medidas del rectágulo son:\n";
        mensaje = mensaje + t1.toString();
        mensaje += "\nAncho: " + t1.getAncho()+" metros."+ "\nLongitud: " + t1.getLongitud()+" metros."+
                "\n\nResultados"+
                "\n\nPerimetro: "+(2*t1.getAncho() + 2*t1.getLongitud())+" metros." 
                + "\nÁrea: " + (t1.getLongitud()*t1.getAncho())+" metros.";
        JOptionPane.showMessageDialog(null, mensaje, "Reporte de medidas", 1);
    }
    
    public static void main(String[] args) {
        t1 = new Rectangulo();
        JOptionPane.showMessageDialog(null, "Registro de medidas de un Rectángulo", "Ejercicio 02", 1);
        ingresoDatos();
        mostrarResultados();
    } 
}
