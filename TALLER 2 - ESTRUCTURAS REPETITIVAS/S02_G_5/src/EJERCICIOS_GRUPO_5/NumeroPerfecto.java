/*
Un número perfecto es un entero positivo igual a la suma de sus divisores propios.
Un divisor propio es un entero positivo distinto que el número en sí mismo, 
que divide al número de forma exacta (es decir, sin resto). Por ejemplo, 
6 es un número perfecto, porque la suma de sus divisores propios 1, 2 y 3 es igual a 6. 
Escribir un algoritmo que acepte un número positivo y determine si es un número perfecto, 
mostrando todos los divisores propios del número.
 */

package EJERCICIOS_GRUPO_5;
import javax.swing.JOptionPane;

/**
 *
 * @author IRVIN
 */
public class NumeroPerfecto {
    static int num;
    public static int ingresoDato(){
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \n[Num>0]",
                    "Ingreso de número", 3));
        }while(num<0);
        return num;
    } 
    
    public static void proceso(){
        	int a,i, perfecto;
                String resultado="";
                i = 0;
	        a = 2;
	        perfecto = 0;
        if (num>0) {
			do 
			{
				if (num%a==0)
				{ 
					perfecto = perfecto+(num/a);
				}
				a = a+1;
			} while (a<=num);
			
			if (perfecto==num) {
                                JOptionPane.showMessageDialog(null,"El numero "+num+" es perfecto\n"+resultado,"resultado",1);
				do 
				{
					i = i+1;
					if (num%i==0) 
					{
                                                resultado+= String.valueOf(i)+"\n";  
					}
				} while (i+1<num);
                                JOptionPane.showMessageDialog(null,"\n sus divisores son: \n"+resultado+"Las sumas de sus divisores es: "+perfecto,"RESULTADOS",1);
		
			} 
			else 
			{
				
                                JOptionPane.showMessageDialog(null,"El numero "+num+" no es perfecto\n sus divisores son",resultado,1);
				
				do 
				{
					i = i+1;
					if (num%i==0) 
					{
						
                                                resultado+= String.valueOf(i)+"\n";
					}
				} while (i+1<num);
                                 JOptionPane.showMessageDialog(null,"Las sumas de sus divisores es: "+perfecto+""+"\n sus divisores son: \n"+resultado,"RESULTADOS",1);
				
                                
			}
		} 
    }
    public static void main(String[] args){
        int rt;
        do{
            JOptionPane.showMessageDialog(null, "Números perfectos","Ejercicio 11", 1);
            ingresoDato();
            proceso();
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1); 
        
    }
}
    