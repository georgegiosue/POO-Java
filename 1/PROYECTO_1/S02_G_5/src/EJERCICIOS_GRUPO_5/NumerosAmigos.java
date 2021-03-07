/*
 * Dos números son amigos cuando la suma de los divisores de uno de ellos es igual al otro y
 * viceversa. Muestre, si existen, los números amigos donde ambos números sean menores que N.
 * Por ejemplo: (220,284), (1184,1210), (2620,2924), (5020,5564), (6232,6368)
 */
package EJERCICIOS_GRUPO_5;
import javax.swing.JOptionPane;
/**
 *
 * @author Karen
 */
public class NumerosAmigos {
    
    public static int ingresoDato(){
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("    Numeros Amigos\n¿Que son los numeros amigos?\nLos numeros amigos son 2 numeros el cual la suma de los divisores de uno de ellos es igual al otro y viceversa.\n\nCalcular los numeros amigos menores que n \n\n     Digite el valor de n"));
        return n;
    }
    
    public static void numerosAmigos(int n){
        int i,i_2,i_3,i_4,a,b,c=0,d=0;String resultado="Los Numeros amigos menores que "+n+" son: \n";
        for(i=1;i<n;i++){
            a=0;
            for(i_2=1;i_2<i;i_2++){
                if(i%i_2==0){
                    a+=i_2;
                }
            }
            for(i_3=1;i_3<n;i_3++){
                b=0;
                for (i_4=1;i_4<i_3;i_4++){
                    if(i_3%i_4==0){
                        b+=i_4;
                    }
                }
                if(a==i_3 && b==i){
                    if(i!=d && i_3!=c){
                        resultado+=String.valueOf(i)+" y "+String.valueOf(i_3)+"\n";
                        c=i;d=i_3;
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null,resultado,"Numeros amigos",1);
    }
    
    public static void main(String[] args) {
       
        int rt;
        do{
        int n=ingresoDato();
            numerosAmigos(n);
        rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        
        }while(rt!=1);
    }
}
