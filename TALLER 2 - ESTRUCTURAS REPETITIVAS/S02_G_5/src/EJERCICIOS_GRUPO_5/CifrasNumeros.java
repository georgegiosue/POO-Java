package EJERCICIOS_GRUPO_5;

import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/*
Determinar cuántos dígitos tiene un número entero ingresado por teclado y cuántos 
dígitos son impares. Por ejemplo, si se ingresa el número 3625, tiene 4 dígitos en 
total, y 2 dígitos impares.
 */

/**
 *
 * @author GEORGE
 */
public class CifrasNumeros {
    static String num_aux;static int num;
    public static void ingresoDato(){
        
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Calcular cuantos digitos tiene un numero y si son pares o impares\n  Digite el valor de N: ","INGRESO DE DATOS",3));
        num_aux=String.valueOf(num);
        
    }
    public static void cifrasNumero(){
        int longitud,a,i,pares=0,impares=0,cifras;String resultado="";
        ingresoDato();
        longitud=num_aux.length();
        for(a=0;a<longitud;a++){
            cifras=num%10;
            num/=10;
            resultado+=String.valueOf(cifras);
            if(cifras%2==0){
                resultado+="     Numero par \n";pares++;
            }else{
                resultado+="     Numero impar \n";impares++;
            }
        }
        JOptionPane.showMessageDialog(null,"  CIFRAS del numero "+num_aux+"\n"+resultado+"\n\n              Resumen\nTotal de numeros pares: "+pares+"\nTotal de numers impares: "+impares,"RESULTADO",1);
    }
    
    public static void main(String[] args) {
        
        int rt;
        do{
        cifrasNumero();
        rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        
        }while(rt!=1);
    }
}
