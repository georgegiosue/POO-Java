/*
 * Para simplificar una fracción, basta con dividir su numerador y denominador
 * entre el m.c.d. de ambos. Implementar un algoritmo que simplifique
 * una fracción haciendo uso de esta idea.
 */
package EJERCICIOS_GRUPO_5;
import javax.swing.JOptionPane;
/**
 *
 * @author GEORGE
 */
public class FraccionMCD {
    static int numerador,denominador,menor;
    
    public static void IngresoDatos_menor(){
        
        numerador=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Numerador de la fraccion: ","INGRESO DE DATOS",JOptionPane.QUESTION_MESSAGE));
        denominador=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el Denominador de la fraccion: ","INGRESO DE DATOS",JOptionPane.QUESTION_MESSAGE));
        if (numerador<denominador){
            menor=numerador;
        }
        else{
            menor=denominador;
        }
    }
    
    public static int Mcd(){
        int mcd=0,i;
        for(i=1;i<=menor;i++){
            if(numerador%i==0 && denominador%i==0){
                mcd=i;
            }
        }
        return mcd;
    }
    
    public static void main(String[] args) {
        int mcd,rt;
        
        do{
            JOptionPane.showMessageDialog(null, "Algoritmo que permite simplificar fraccion por MCD","EJERCICIO 7",JOptionPane.INFORMATION_MESSAGE);
            IngresoDatos_menor();
            JOptionPane.showMessageDialog(null, "La Fraccion simplificada es: \n"+numerador/Mcd()+" / "+denominador/Mcd()+"\n","RESULTADO",JOptionPane.INFORMATION_MESSAGE);
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1);
        
        
    }
}