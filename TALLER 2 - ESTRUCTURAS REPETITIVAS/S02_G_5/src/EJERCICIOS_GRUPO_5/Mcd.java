/*
 Mdc de 3 números
 */
package EJERCICIOS_GRUPO_5;

/**
 *
 * @author luisr
 */

import javax.swing.*;

public class Mcd {
    static int a, b, c, mcd;
    
    public static int ingresoA(){
        do {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un primer número: \n[Num>0]",
                    "Ingreso de datos", 3));
        }while(a<0);
    return a;    
    }
    
    public static int ingresoB(){
        do {
            b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un segundo número: \n[Num>0]",
                    "Ingreso de datos", 3));
        }while(b<0);
    return b;    
    }
    
    public static int ingresoC(){
        do {
            c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un tercer número: \n[Num>0]",
                    "Ingreso de datos", 3));
        }while(c<0);
    return c;    
    }
    
    public static void procesoMcd(){
        int i=0, menor=999999;
        do {
            i = i+1;
            if (a%i==0 && b%i==0 && c%i==0){
		mcd = i;
            }
	} while (i<menor);
        JOptionPane.showMessageDialog(null, "El MCD de los números  "+a+";  "+b+";  "+c+"   es:  \n              "+mcd+"",  "Resultados", 1);
    }
    
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "MCD de 3 números enteros",
                "Ejercicio 6", 1);
        int rt;
        do{
            ingresoA();
            ingresoB();
            ingresoC();
            procesoMcd();
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1);  
    }
}
