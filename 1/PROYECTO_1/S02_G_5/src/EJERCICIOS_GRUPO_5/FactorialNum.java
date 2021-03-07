/*
 Factorial de un número
 */
package EJERCICIOS_GRUPO_5;

/**
 *
 * @author luisr
 */

import javax.swing.*;

public class FactorialNum {
    static int num;
    static int factorial;
    
    public static void ingresoNumero(){
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \n[Num>0]",
                    "Ingreso de número", 3));
        }while(num<0);
    }
    
    public static int procesoFactorial(){
        factorial = 1;
        for(int i=1; i<=num; i++) {
            factorial = factorial * i;
            }
        return factorial;
        }
    
    public static void mostrarFactoriales(){
        String mensaje = "El factorial del número " + num + "! es: ";
        mensaje = mensaje + procesoFactorial();
        JOptionPane.showMessageDialog(null, mensaje,  "Resultado", 1); 
    }
    
    public static void main(String[] args){
        int rt;
        do{
            JOptionPane.showMessageDialog(null, "Factoriales de un número entero",
                "Ejercicio 4", 1);
            ingresoNumero();
            mostrarFactoriales();
            
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1);
    }
}
