
package EJERCICIOS_GRUPO_5;

/**
 *
 * @author Jhon
 */
import javax.swing.*;

public class Base10_Base2 {
    static int num;
    public static void ingresoDato(){
       do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \n[Num>0]",
                    "Ingreso De Numero", 3));
        }while(num<0);  
    }
    public static void procesoBinario(){
        int a, b2;
        for (int i=1;i<num;i++)
		{
			a=num;
			b2=0;
			i=1;
			
			while (a!=1)
			{
				b2+=(a%2)*i;
				a/=2;
				i*=10;
			}
			
			b2+=(a%2)*i;
			JOptionPane.showMessageDialog(null, b2,  "Resultados", 1);
		}
        
    }
    public static void  main(String[] args){
        
        int rt;
        do{
            JOptionPane.showMessageDialog(null, "Convertir Numero Entero a binaro","Ejercicio 19", 1);
            ingresoDato();
            procesoBinario();
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1); 
       
        }
    }

