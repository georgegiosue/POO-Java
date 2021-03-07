
package EJERCICIOS_GRUPO_5;

import javax.swing.JOptionPane;
/**
 *Mostrar los divisores de un numero
 * @author GEORGE
 */
public class DivisoresNumero {
    
    public static int ingresoDato(){
        int num;
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero que se encuentre en el intervalo <0,3000]","INGRESO DE DATOS",3));
            if(num<=0 || num>3000){
                JOptionPane.showMessageDialog(null,"El numero ingresado: "+num+" es incorrepto.\n\nPorfavor vuelva a intentarlo","ADVERTENCIA",2);
            }
        }while(num<=0 || num>3000);
        return num;
    }
    public static void divisores(){
        String resultado="";int numero;numero=ingresoDato();
        int i;
        for(i=1;i<=numero;i++){
            
            if (numero%i==0) {
                resultado+=i+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,"Los divisores del numero "+numero+" son \n"+resultado,"DIVISORES",1);
    }
    public static void main(String[] args) {
        int rt;
        do{
        divisores();
        rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        
        }while(rt!=1);
    }
}
