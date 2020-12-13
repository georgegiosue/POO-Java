package Presentacion;
import javax.swing.JOptionPane;
import static java.lang.Math. *;
/*
 * Un cubo perfecto o número de Amstrong es aquel que sumados los cubos de sus dígitos nos dan
 * el mismo número. Encuentre los 5 únicos cubos perfectos.
 */

/**
 * @author GEORGE
 */


public class CuboPerfecto {
    
    public static String CuboPerfecto(){
        int a,suma,ultimo_digito;
        String cubosPerfectos="";
        for(int i=0;i<1000;i++){
            suma=0;a=i;
            while (a!=0){
                ultimo_digito=a%10;
                suma+=(pow(ultimo_digito,3));
                a/=10;
            }
            if(suma==i && suma!=0){
                cubosPerfectos+=String.valueOf(suma)+"\n";
            }
        }
        return cubosPerfectos;
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Los 5 Unicos Cubos Perfectos\n"+"\n¿Que es un cubo perfecto?\n\nUn cubo perfecto o número de Amstrong es aquel que sumados los cubos de sus dígitos nos dan\n" +
"el mismo número."+"\n A continuacion los 5 unicos cubos perfectos:\n\n"+CuboPerfecto(),"Ejercicio 16",1);
        
    }
}
