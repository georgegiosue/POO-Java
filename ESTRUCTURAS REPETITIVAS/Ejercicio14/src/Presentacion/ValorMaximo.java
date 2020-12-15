/*
Leer un número positivo y partirlo en 2 sumandos de forma que su producto tenga
un valor máximo.
 */

package Presentacion;
import javax.swing.*;
/**
 *
 * @author IRVIN
 */
public class ValorMaximo {
    static int num;
    public static int ingresoDato(){
    do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \n[Num>0]",
                    "Ingreso de número", 3));
        }while(num<0);
        return num;
    } 
    
    
    public static void proceso(){
        int s1=0, s2=0, p, i=0, j=num, m=0;
        do
    {
        i++;
        j-=1;
        p=i*j;
        if (p>=m)
        {
            m=p;
            s1=i;
            s2=j;
        }
    } while (j>1);
        
        JOptionPane.showMessageDialog(null,"El primer sumando es:\n"+"\t"+s1,"SUMANDOS",1);
        JOptionPane.showMessageDialog(null,"El segundo sumando es:\n"+"\t"+s2,"SUMANDOS",1);
        JOptionPane.showMessageDialog(null,"El Producto de los sumandos "+s1+" y "+s2+" es: "+m,"PRODUCTO DE SUMANDOS",1);
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Valor máximo",
                "Ejercicio 14", 1);
         ingresoDato();
          proceso();
    }
}
