package presentacion;

import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.ArrayBufferView.length;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karen
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
