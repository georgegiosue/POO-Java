
package run.app;

import entindades.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GEORGE NAMOC
 */
public class AppEmpresa {
    private static Contratado listaContratados=new Contratado();
    private static ADestajo listaADestajo=new ADestajo();
    private static Contratado contratado;
    private static ADestajo adestajo;
    
    public static void main(String[] args) {
        boolean control=true;
        Metodos.bienvenida();
        do{
            switch(Metodos.menu()){
                case 1:
                        while(control){
                        Contratado.setSueldoBasico(Float.parseFloat(JOptionPane.showInputDialog(null,""
                                + "Digite el Sueldo Basico para todo el Personal CONTRATADO","SUELDO BASICO - "
                                + "Personal Contratado",JOptionPane.QUESTION_MESSAGE)));control=false;};
                        contratado=Metodos.registroDatosContratado(contratado);
                        Metodos.agregarPersonal(listaContratados,contratado);break;
                case 2: 
                        adestajo=Metodos.registroDatosADestajo(adestajo);
                        Metodos.agregarPersonal(listaADestajo,adestajo);break;
                case 3:
                        Metodos.listarDatos(listaContratados);break;
                case 4:
                        Metodos.listarDatos(listaADestajo);break;
                case 5: Metodos.modificarDatosADestajo_DNI(listaADestajo);break;
            } 
        }while(Metodos.ciclo());
        
    }
}