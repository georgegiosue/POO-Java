/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Jhon
 */
import javax.swing.*;

public class Ejercicio20 {
    static int num;
    public static void ingresoDato(){
       do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \n[Num>0]",
                    "Ingreso De Numero", 3));
        }while(num<0);  
    }
    public static void procesoEntero(){
        int a, b10;
        for (int i=1;i<2;i++)
		{
			a=num;
			b10=0;
			i=1;
			
			while (a!=1)
			{
				b10+=(a%10)*i;
				a/=10;
				i*=2;
			}
			
			b10+=(a%10)*i;
			JOptionPane.showMessageDialog(null, b10,  "Resultados", 1);
		}
    }
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Convertir Numero Binario a Entero",
                "Ejercicio 20", 1);
        ingresoDato();
        procesoEntero();
    }
}

