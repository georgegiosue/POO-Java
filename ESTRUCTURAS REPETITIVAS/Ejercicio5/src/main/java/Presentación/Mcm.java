/*
 Mcm de 3 números 
 */
package Presentación;

/**
 *
 * @author luisr
 */

import javax.swing.*;

public class Mcm {
    static int a, b, c, mcm;
    
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
    
    public static void procesoMcm(){
        int i=2, mayor=a, x=a, y=b, z=c;
        if (y>mayor){
        	mayor = y;
        }
	if (z>mayor){
        	mayor = z;
	}
	mcm = 1;
	do{
            if (x%i==0 || y%i==0 || z%i==0){
            if (x%i==0){
		x = x/i;
            }
            if (y%i==0){
		y = y/i;
            }
            if (z%i==0){
		z = z/i;
            }
            mcm = mcm*i;
            i = 1;
            }
            if (z%i==0 || y%i==0 || z%i==0){
		mcm = mcm*i;
		i = 1;
            }
		i = i+1;
        } while (i<mayor);
        JOptionPane.showMessageDialog(null, "El MCM de los números  "+ a +"  ;"+ b +"  ;"+ c+ "   es:  \n              "+mcm+"",  "Resultados", 1);
    }
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "MCM de 3 números enteros",
                "Ejercicio 5", 1);
        int rt;
        do{
            ingresoA();
            ingresoB();
            ingresoC();
            procesoMcm();
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1);        
    }
}
