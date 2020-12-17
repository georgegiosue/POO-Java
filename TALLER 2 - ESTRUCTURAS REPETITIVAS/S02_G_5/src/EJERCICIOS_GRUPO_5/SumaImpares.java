package EJERCICIOS_GRUPO_5;
import javax.swing.JOptionPane;
/**
 *
 * @author GEORGE
 */
public class SumaImpares {
    
     public static int leerDato(){
        int n;
        String dato;
        do{
            dato=JOptionPane.showInputDialog(null,"INGRESE EL VALOR DE N [N>=1]: ","Ingreso de datos",3);n=Integer.parseInt(dato);
            if (n<=0){
                JOptionPane.showMessageDialog(null,"\tEl valor de N debe ser mayor o igual a 1 ","Tener en cuenta..",0);
            }
        }while(n<=0);
        return n;
    }
    public static int SumaImpares(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            if (i%2!=0){
                suma=suma+i;
            }
        }
        return suma;
    }
    public static void  mostrarResultados(int n,int suma){
        String mensaje="Los numeros impares son:\n";
        for (int i=1;i<=n;i+=2){
            mensaje+=i+"\n";
        }
        mensaje+="\nLa suma es: "+suma+"\n";
        JOptionPane.showMessageDialog(null,mensaje,"Tener en cuenta..",1);
    }
    public static void main(String[] args) {
        int n,suma=0,rt;
        String dato;
        
        
         do{
            JOptionPane.showMessageDialog(null,"\t\tSuma de numeros impares comprendidos entre 1 y N","Estructuras Repetitivas",1);
            n=leerDato();
            suma=SumaImpares(n);
            mostrarResultados(n,suma);
            
            rt=JOptionPane.showConfirmDialog(null,"¿Desea realiza una nueva suma?\n   Si / NO");
        }while(rt!=1);
    }
}
