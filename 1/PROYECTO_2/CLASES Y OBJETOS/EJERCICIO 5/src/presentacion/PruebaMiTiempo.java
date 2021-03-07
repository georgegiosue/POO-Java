/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import entidades.MiTiempo;
import javax.swing.*;

/**
 *
 * @author luisr
 */
public class PruebaMiTiempo {
    private static MiTiempo t1;
    public static int segundo, minuto, hora;
    
    public static void ingresoDatos(){
        
        do {
            hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor: \n",
                    "Ingreso de HORA", 3));
            if(hora<=0 || hora>=24){
                JOptionPane.showMessageDialog(null, "El valor de la HORA debe ser \n[0<=HORA<24]", "Mensaje", 2);
            }
            else{
                JOptionPane.showMessageDialog(null, "El valor de la HORA fue ingresada correctamente", "Mensaje", 1);
            }
            }while(hora<-1 || hora>23);
            
        do {
            minuto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor: \n",
                    "Ingreso de MINUTO", 3));
            if(minuto<=0 || minuto>=60){
                JOptionPane.showMessageDialog(null, "El valor del MINUTO debe ser \n[0<=MIN<60]", "Mensaje", 2);
            }
            else{
                JOptionPane.showMessageDialog(null, "El valor del MINUTO fue ingresada correctamente", "Mensaje", 1);
            }
            }while(minuto<-1 || minuto>59);
            
            
        do {
            segundo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor: \n0<=Seg<60",
                    "Ingreso de SEGUNDO", 3));
            if(segundo<=0 || segundo>=60){
                JOptionPane.showMessageDialog(null, "El valor del SEGUNDO debe ser \n[0<=SEG<=60]", "Mensaje", 2);
            }
            else{
                JOptionPane.showMessageDialog(null, "El valor del SEGUNDO fue ingresada correctamente", "Mensaje", 1);
            }
            }while(segundo<-1 || segundo>59);
        
        if(hora>=23){
            hora = 00;
                if(minuto>=59){
                    minuto=00;
                    hora=hora+1;
                        if(segundo>=59){
                            minuto=minuto+1;
                            segundo=00;
                        }
                    }
            }
        
        t1.setSegundo(segundo);
        t1.setMinuto(minuto);
        t1.setHora(hora);          
    }
    
    public static void mostrarResultados(){
        
        if(hora>=24 || hora<=12){
            String mensaje = "Los datos del Reloj son:\n";
                    mensaje = mensaje + t1.toString();
                    mensaje += "\n " + t1.getIncrementarHora()+ 
                            " : " + t1.getIncrementarMinuto()+
                            " : " + t1.getIncrementarSegundo()+" AM";
        JOptionPane.showMessageDialog(null, mensaje, "Reporte de datos", 1);
        }
        else{
            String mensaje = "Los datos del Reloj son:\n";
                    mensaje = mensaje + t1.toString();
                    mensaje += "\n\n " + t1.getIncrementarHora()+ 
                            " : " + t1.getIncrementarMinuto()+
                            " : " + t1.getIncrementarSegundo()+" PM";
        JOptionPane.showMessageDialog(null, mensaje, "Reporte de datos", 1);
        }
        
    }
    
    public static void main(String[] args) {
        t1 = new MiTiempo();
        JOptionPane.showMessageDialog(null, "   Registro de datos de un Reloj", "Ejercicio 05", 1);
        ingresoDatos();
        mostrarResultados();
    } 
}
