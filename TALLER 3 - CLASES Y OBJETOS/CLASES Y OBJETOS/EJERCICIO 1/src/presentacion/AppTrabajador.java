
package presentacion;
import entindades.Trabajador;
import javax.swing.JOptionPane;
/**
 * @author G E O R G E 
 */
public class AppTrabajador {
    private static Trabajador t1;
   
    
    public static void ingresoDatos(){
        t1.setNombre(JOptionPane.showInputDialog(null,"Digite el Nombre del Trabajador","NOMBRE",JOptionPane.QUESTION_MESSAGE));
       do{
        t1.setHorasLaboradas(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite las horas laboradas","HORAS LABORADAS",JOptionPane.QUESTION_MESSAGE)));
        if(t1.getHorasLaboradas()<0){
            JOptionPane.showMessageDialog(null,"El valor ingresado: "+t1.getHorasLaboradas()+" es incorrepto\n"+"Intentelo denuevo","ADVERTECIA",JOptionPane.WARNING_MESSAGE);
        }
       }while((t1.getHorasLaboradas())<0);
       
       do{
           t1.setSalarioHora(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el salario por hora","SALARIO",JOptionPane.QUESTION_MESSAGE)));
           if(t1.getSalarioHora()<0){
                JOptionPane.showMessageDialog(null,"El salario ingresado: "+t1.getSalarioHora()+" es incorrepto\nIntentelo denuevo","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
           }
       }while(t1.getSalarioHora()<0);
    }
    
    public static void mostrarDatos(){
        String resultados="Los resultados son:\n";
        resultados+=t1.toString()+"\nSueldo Bruto: S/."+t1.getSueldoBruto()+"\nDescuento ( "+Trabajador.DSCT*100+"% ) -> S/."+t1.getDescuento()+"\nSueldo neto: "+t1.getSueldoNeto();
        JOptionPane.showMessageDialog(null,resultados,"RESULTADOS",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        t1 =new Trabajador();
        JOptionPane.showMessageDialog(null,"SISTEMA DE GESTION DE EMPLEADOS","BIENVENIDO",1);
        ingresoDatos();
        mostrarDatos();
        
    }
   
}
