/*
 Sumatoria
 */
package EJERCICIOS_GRUPO_5;

/**
 *
 * @author luisr
 */

import javax.swing.*;

public class Sumatoria {
    static float resultado;
    static int x;
    static int n;
    
    public static void ingresoX(){
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \n[X>0]",
                    "Ingreso de valores", 3));
        }while(x<0);
    }
    
    public static void ingresoN(){
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \n[N>0]",
                    "Ingreso de valores", 3));
        }while(n<0);
    }
        
    public static float sumatoria(){
        int a;
        int i;
        float denominador;
        float factorial;
        float numerador;
        float sumatoria = 0;
	denominador = 2;
	factorial = 1;
	a = 1;
        i=0;
	do{
            i = i+1;
            if (i==1) 
            {
			numerador = x;
			sumatoria=(numerador/denominador);
                        resultado = sumatoria;
		} 
		else 
		{
			denominador = denominador+2;
			do 
			{
				a = a+1;
				factorial = factorial*a;
			} while (a<denominador);
			numerador = (float) ((Math.pow(x,i))*i);
			sumatoria+=(numerador/factorial);
                        resultado = sumatoria;
		}
	} while (i<n);
        return resultado;
    }    
    
    public static void darResultado(){
        String mensaje = "El resultado de la sumatoria es: \n";
        mensaje = mensaje + sumatoria();
        JOptionPane.showMessageDialog(null, mensaje,  "Resultados", 1);
    }
    
    public static void main(String[] args){
        
        int rt;
        do{
           JOptionPane.showMessageDialog(null, "Sumatoria: \n\n"+
                " X         2X^2         3X^3                  NX^N\n"+
                "---  +  ----------  +  ----------  +  ... +  ----------\n"+
                " 2!           4!                 6!                     2N!",
                "Ejercicio 15", 1);
        ingresoX();
        ingresoN();
        darResultado();
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1); 
    }
}