/*
 * En una universidad se pueden llevar hasta 22 créditos en un ciclo. Escribir un algoritmo que permita a un alumno matricularse
 * sin pasarse del límite de créditos permitido. Ingresar el nombre y el número de créditos de cada curso
 * en el que se registrará y mostrar el total de créditos matriculados.
 */
package Presentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen
 */
public class SistemaMatricula {
    
    public static void matricula(){
        int c,tc=0;String nombreCurso;
        do{
            nombreCurso=JOptionPane.showInputDialog(null,"\t\t           Sistema de Matricula\n\nMaximo de creditos a Matricularse: 22\n\nDigite el nombre del curso","SISTEMAS DE MATRICULA - Ejercicio 12",JOptionPane.QUESTION_MESSAGE);
            c=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de creditos","CREDITOS",3));
            tc+=c;
            if(tc>22){
                tc-=c;
                JOptionPane.showMessageDialog(null,"\tCurso "+nombreCurso+" NO MATRICULADO\n"+"Usted a sobrepasado el Limite de los 22 creditos"+"\n\tMATRICULESE EN OTRO CURSO","ADVERTENCIA",2);
            }else{
                JOptionPane.showMessageDialog(null,"\t   Curso "+nombreCurso+" \n\nMATRICULADO CON EXITO\n\nTotal de creditos acumulados: "+tc,nombreCurso,1);
            }
            if(tc==22){
                JOptionPane.showMessageDialog(null, "\tMATRICULA a FINALIZADO CON EXITO");
            }
            
        }while(tc<22);
    }
    
    public static void main(String[] args) {
        int rt;
        do{
            matricula();
        rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        
        }while(rt!=1);
        
    }
}
