/*
 */
package presentacion;
import entidades.CuentaAhorro;
import javax.swing.*;

/**
 *
 * @author luisr
 */
public class PruebaCuentaAhorro {
    private static CuentaAhorro t1;
    public static float tasaInteresAnual;
    public static float tasaInteresMensual;
    public static float saldoAhorros;
    
    public static void modificarTasaAnual(){
        do {
            tasaInteresAnual = Float.parseFloat(JOptionPane.showInputDialog(null, "Modifique la Tasa de Interés Anual: [%]", "Datos del Usuario", 3));
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente", "Mensaje", 1);
        }while(tasaInteresAnual<0);
        tasaInteresMensual = ((saldoAhorros * tasaInteresAnual)/100)+saldoAhorros;
        t1.setSaldoDeAhorros(saldoAhorros);
    }
    
    public static void ingresoDatos(){
        String nombre;
        
        nombre = JOptionPane.showInputDialog(null, "Nombre y apellidos:", "Datos del Usuario", JOptionPane.QUESTION_MESSAGE);
        
        do {
            saldoAhorros = Float.parseFloat(JOptionPane.showInputDialog(null, "Saldo en Ahorros:  [$]", "Datos del Usuario", 3));
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente", "Mensaje", 1);
        }while(saldoAhorros<0);
        
        tasaInteresMensual = ((saldoAhorros * tasaInteresAnual)/100)+saldoAhorros;
        
        t1.setNombre(nombre);
        t1.setSaldoDeAhorros(saldoAhorros);
    }
    
    public static void mostrarResultados() {
        String mensaje = "Los datos del Usuario son:\n";
        mensaje = mensaje + t1.toString();
        mensaje +=  "\nTasa de Interes Anual: " + tasaInteresAnual+" %"+
                "\nInteres Mensual: " + tasaInteresMensual+" $";
        JOptionPane.showMessageDialog(null, mensaje, "Reporte de datos del Usuario", 1);
    }
    
    public static void main(String[] args) {
        int rpta;
        t1 = new CuentaAhorro();
        JOptionPane.showMessageDialog(null, "Registro de datos de Usuarios", "Sistema de Gestión Bancario", 1);
        ingresoDatos();
        modificarTasaAnual();
        mostrarResultados();
        rpta = Integer.parseInt(JOptionPane.showInputDialog(null, "\"¿Desea  modificar el valor asignado a la tasa de interés anual?\n"
                + "1 = Si \n2 = No", "Mensaje", 2));
        if(rpta==1){
            modificarTasaAnual();
            mostrarResultados();
        }
    }
}
