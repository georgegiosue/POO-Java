/*
 * En un cajero se muestra un menú de opciones: retiro, saldo, depósito y salir
 * Escriba un algoritmo que efectúe dichas operaciones, para un cliente 
 * con un saldo inicial de S/.2000.
 */
package presentacion;
import javax.swing.JOptionPane;
/**
 * 
 *
 * @author GEORGE
 */
public class AlgoritmoCajero {
    private static float saldo=2000f;
    public static int menu(){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Retiro\n2. Saldo\n3. Deposito\n4.Salir","MENU",JOptionPane.QUESTION_MESSAGE));
            if(op<1 || op>4){
                JOptionPane.showMessageDialog(null,"Numero Incorrepto\n Digite un numero entre 1 y 4","ADVERTENCIA",2);
            }
        }while(op<1 || op>4);
        return op;
    }
    
    public static void mostrarSaldo(){
        JOptionPane.showMessageDialog(null,"Su saldo es de: S/."+saldo,"SALDO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void retiro(){
        float r;
        if(saldo==0){
            JOptionPane.showMessageDialog(null,"Su saldo ya no tiene fondos para hacer retiros","Saldo Insuficiente",2);
        }else{
            do{
                r=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la cantidad de su retiro: ","Retiro",3));
                if(r>saldo || r<0){
                    JOptionPane.showMessageDialog(null,"No puede retirar una cantidad mayor que su saldo","ADVERTENCIA",2);
                }
            }while(r>saldo || r<0);
            saldo-=r;mostrarSaldo();
        }
    }
    
    public static void deposito(){
        float d;
        do{
            d=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite su deposito: ","DEPOSITO",JOptionPane.QUESTION_MESSAGE));
            if(d<=0f){
                JOptionPane.showMessageDialog(null,"Cantidad Incorrepta.\nVuelva a intentarlo","ADVERTENCIA",2);
            }
        }while(d<=0f);
        saldo+=d;mostrarSaldo();
    }
    
    public static void main(String[] args) {
        char rt='N';int op;
        JOptionPane.showMessageDialog(null,"Algoritmo de Cajero automatico","EJERCICIO 13",JOptionPane.INFORMATION_MESSAGE);
        
        do{
            op=menu();
            switch (op){
                case 1:retiro();break;
                case 2:mostrarSaldo();break;
                case 3:deposito();
                case 4:rt='N';
            }
            if (rt!='N'){
            rt=JOptionPane.showInputDialog(null,"¿Desea realizar otra operacion?\nSI / NO","SESION",3).toUpperCase().charAt(0);
            }
            }while(rt!='N');
    }
}
