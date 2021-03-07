/*
Modificar la clase MiFecha de modo que detecte errores en los valores
de los inicializadores para las variables de ejemplar (atributos) día, 
mes y año. También debe proporcionarse un método SiguienteDía para 
incrementar un día a la fecha guardada. Deben probarse los siguientes casos:



a. Incrementar un día pasando al siguiente mes.
b. Incrementar un mes pasando al siguiente año.

 */
package presentacion;
import entiidad.MiFechaModificado;
import javax.swing.JOptionPane;
/**
 *
 * @author GEORGE
 */
public class AppMiFechaModificado {
     static MiFechaModificado fecha;
    
     public static int ingresoDia(){
         int dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia","INGRESO DE DATOS",JOptionPane.QUESTION_MESSAGE));
         return dia;
     }
     public static int ingresoMes(){
         int mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el mes","INGRESO DE DATOS",JOptionPane.QUESTION_MESSAGE));
         return  mes;
     }
     public static int ingresoAnio(){
         int anio=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año","INGRESO DE DATOS",JOptionPane.QUESTION_MESSAGE));
         return anio;
     }
    
     public static int menu(MiFechaModificado fecha){
        int opc;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"                             MENU\n"
                    + fecha.toString()+"\n"
                            + "                           Metodos\n"
                            + "1. Incrementar un día pasando al siguiente mes.\n"
                            + "2. Incrementar un mes pasando al siguiente año.\n\n"
                            + "\t              Seleccione una opcion","MENU",JOptionPane.QUESTION_MESSAGE));
            if(opc<1 || opc>2){
                JOptionPane.showMessageDialog(null,"El valor ingresado es INCORREPTO\n"
                        + "\nVuelva a intentarlo denuevo","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            }
        }while(opc<1 || opc>2);
         return opc;
     }
     
    public static void main(String[] args) {
       int rt;
        do{ 
            JOptionPane.showMessageDialog(null,"         APP MI FECHA", "    Bienvenido",JOptionPane.INFORMATION_MESSAGE);
            fecha=new MiFechaModificado(ingresoDia(), ingresoMes(), ingresoAnio());
            
            switch(menu(fecha)){
                case 1: JOptionPane.showMessageDialog(null,fecha.unDiaIncrementadoPasadoMes(fecha).toString(),"  dia incrementado pasando al siguiente mes",JOptionPane.INFORMATION_MESSAGE);break;
                case 2: JOptionPane.showMessageDialog(null,fecha.unMesPasadoSiguienteAnio(fecha).toString(),"  mes incrementado pasando al siguiente año",JOptionPane.INFORMATION_MESSAGE);break;
            }
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1);
         
        
    }
}
