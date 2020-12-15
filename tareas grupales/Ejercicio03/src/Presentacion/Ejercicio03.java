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

public class Ejercicio03 {
    public static void procesoPrimos(){
        int a, conteo, start;
        String resultado="";
      for (int i=100;i<=999;i++)
	{
		conteo=0;
		
		for (a=1;a<=i;a++)
		{
			if (i%a==0)
			{
				conteo++;
			}
		}
		
		if (conteo==2)
		{
                        resultado+= String.valueOf(i)+"\n";  
                       JOptionPane.showMessageDialog(null, resultado,  "Resultados", 1);
                
		}
	}
      }
      
      public static void main(String[] args){
          JOptionPane.showMessageDialog(null, "Numeros Primos de tres digitos",
                "Ejercicio 03", 1);
          procesoPrimos();
      }
    }

