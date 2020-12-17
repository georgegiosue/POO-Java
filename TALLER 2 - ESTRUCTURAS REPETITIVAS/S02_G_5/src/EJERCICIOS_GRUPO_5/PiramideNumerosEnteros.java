

package EJERCICIOS_GRUPO_5;
/*Ingresar un número N y mostrar por pantalla la siguiente ejecución:
1
1 2
1 2 3
…
1 2 3 … N
*/
import javax.swing.*;

/**
 *
 * @author IRVIN
 */
public class PiramideNumerosEnteros {
    
  public static int ingresoNumero(){
       int num;
       num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero para mostrar en pantalla de forma piramidal: ","INGRESO DE DATOS",3));
       return num;
   }
   
   public static void piramide(){
        int i=1, j, num;
        String resultado="";
       num=ingresoNumero();
		
		if (num>=1) 
		{	do {
				j = 1;
				do {
					resultado+=String.valueOf(j)+" ";
					j++;
				} while ((j<=i));
				resultado+="\n";
				i++;
			} while ((i<=num));
			JOptionPane.showMessageDialog(null,resultado,"RESULTADOS",JOptionPane.INFORMATION_MESSAGE);
		} else 
			{
			JOptionPane.showMessageDialog(null, "Los datos ingresados son incorreptos","ADVERTENCIA",2);
	
                        }
   }
   
	
    public static void main(String[] args) {
        
        int rt;
        do{
            piramide();
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1); 
        
    }
}

