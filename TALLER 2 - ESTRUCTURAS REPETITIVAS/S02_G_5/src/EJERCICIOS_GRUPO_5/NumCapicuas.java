/*
 Números capicuas entre dos rangos
 */
package EJERCICIOS_GRUPO_5;

/**
 *
 * @author luisr
 */

import javax.swing.*;

public class NumCapicuas {
    static int num;
    static int a;
    static int b;
    
    public static void ingresoValorA(){
        do{
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \n[Num>0]",
                    "Ingreso de rango mínimo", 3));
        }while(a<0);
    }
    
    public static void ingresoValorB(){
        do{
            b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \n[Num>0]",
                    "Ingreso de rango máximo", 3));
        }while(b<0);  
    }
    
    public static void procesoCapicua(){
        int i, i_2, i_3, RF, R, P, ep;	
        String resultado="";
        for (int cont=a; cont<b; cont++)
	{
		i=cont;
		i_2=cont;
		RF=0;
		P=0;
		
		while (i>0)
		{
			num=i%10;
			i=i/10;
			P+=1;
		}
		
		P-=1;
		
		while (i_2>0)
		{
			i_3=i_2%10;
			i_2=i_2/10;
			ep=(int)Math.pow(10,P);
			R=i_3*ep;
			RF+=R;
			P-=1;	
		}
		if (RF==cont)
		{
                    resultado+= String.valueOf(cont)+"\n";  
                }
	}
            JOptionPane.showMessageDialog(null, resultado,  "Resultados", 1);
           
    }    
    
    public static void main(String[] args){
        
        int rt;
        do{
           JOptionPane.showMessageDialog(null, "Números capicuas entre dos rangos","Ejercicio 18", 1);
            ingresoValorA();
            ingresoValorB();
            procesoCapicua();
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1); 
        
    }
}