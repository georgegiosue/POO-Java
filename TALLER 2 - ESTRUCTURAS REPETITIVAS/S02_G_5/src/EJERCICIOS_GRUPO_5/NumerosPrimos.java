/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIOS_GRUPO_5;

/**
 *
 * @author Jhon && George
 */

import javax.swing.*;

public class NumerosPrimos {
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
                        
                        resultado+= String.valueOf(i)+", ";  
                       if(i==241 || i==419 || i==599 || i==773 || i==977){
                            resultado+="\n";
                        }
                
		}
	}
        JOptionPane.showMessageDialog(null, "                                                                          Los numeros primos de 3 digitos son: \n\n"+resultado,  "Resultados", 1);
      }
      
      public static void main(String[] args){
          JOptionPane.showMessageDialog(null, "Numeros Primos de tres digitos",
                "Ejercicio 03", 1);
          procesoPrimos();
      }
    }

