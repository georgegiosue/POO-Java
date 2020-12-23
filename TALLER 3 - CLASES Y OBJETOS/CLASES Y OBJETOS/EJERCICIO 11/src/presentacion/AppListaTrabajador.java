/*
 * Implementar una clase coleccionadora ListaTrabajadores. Reutilice la clase Trabajador, 
   implementada en el ejercicio 1. La clase debe ser capaz de:

a. Ingresar un trabajador dado.
b. Eliminar un trabajador dada su posición.
c. Obtener el trabajador dada su posición.
d. Buscar si un trabajador existe dado su nombre.
e. Reportar la relación de trabajadores ordenados en forma ascendente por el nombre.
f. Reportar la relación de trabajadores ordenados en forma descendente por el sueldo neto.

 */
package presentacion;
import entidad.ListaTrabajadores;
import entindades.Trabajador;
import javax.swing.JOptionPane;
/**
 *
 * @author GEORGE NAMOC
 */
public class AppListaTrabajador {
    static Trabajador trabajador;
    static ListaTrabajadores lista=new ListaTrabajadores();
    static Trabajador trabajador_aux;
    public static int menu(){
        int opc;
        do{
        opc=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la opcion correspondiente\n"
                + "1. Registrar trabajador\n"
                + "2. Listar Trabajadores\n"
                + "3. Optener los datos de un trabajador\n"
                + "4. Eliminar a un Trabajador\n"
                + "5. Buscar a un trabajador por nombre\n"
                + "6. Reportar la relación de trabajadores ordenados en forma ascendente por el nombre\n"
                + "7. Reportar la relación de trabajadores ordenados en forma descendente por el sueldo neto","App Trabajadores                                                          MENU ",JOptionPane.QUESTION_MESSAGE));
        if (opc<1 || opc>7){
            JOptionPane.showMessageDialog(null,"Digito Incorrepto\n Vuelva a intentarlo","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
        }while(opc<1 || opc>7);
        return opc;
    }
    
    
    
    public static void ingresoDatos(){
       trabajador.setNombre(JOptionPane.showInputDialog(null,"Digite Nombres y apellidos del Trabajador","NOMBRE",JOptionPane.QUESTION_MESSAGE));
       do{
        trabajador.setHorasLaboradas(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite las horas laboradas","HORAS LABORADAS",JOptionPane.QUESTION_MESSAGE)));
        if(trabajador.getHorasLaboradas()<0){
            JOptionPane.showMessageDialog(null,"El valor ingresado: "+trabajador.getHorasLaboradas()+" es incorrepto\n"+"Intentelo denuevo","ADVERTECIA",JOptionPane.WARNING_MESSAGE);
        }
       }while((trabajador.getHorasLaboradas())<0);
       
       do{
           trabajador.setSalarioHora(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el salario por hora","SALARIO",JOptionPane.QUESTION_MESSAGE)));
           if(trabajador.getSalarioHora()<0){
                JOptionPane.showMessageDialog(null,"El salario ingresado: "+trabajador.getSalarioHora()+" es incorrepto\nIntentelo denuevo","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
           }
       }while(trabajador.getSalarioHora()<0);
    }
    
    public static void listarTrabajadores(){
        String mensaje="Lista de Trabajadores\n";
        for(int i=0;i<=lista.getPosicion();i++){
            mensaje+=(i+1)+". "+lista.getTrabajador(i).getNombre()+"\n";
        }
        JOptionPane.showMessageDialog(null,mensaje+"El listado de trabajadores a finalizado con exito","LISTADO DE TRABAJADORES",JOptionPane.INFORMATION_MESSAGE);
    }
    public static int optenerDatosT(){
        
        int rpt;
        String trabajadores="Lista de Trabajadores\n";
        for(int i=0;i<=lista.getPosicion();i++){
            trabajadores+=(i+1)+". "+lista.getTrabajador(i).getNombre()+"\n";
        }
        rpt=Integer.parseInt(JOptionPane.showInputDialog(null,trabajadores+"\nIngrese el numero del trabajador","TRABAJADORES",JOptionPane.INFORMATION_MESSAGE));
        return rpt-1;
        
    }
    
    public static void eliminarTrabajador(int posicion){
        int ps=posicion;
        for(int i=ps;i<=lista.getPosicion()-1;i++){
            lista.getListaT()[i]=lista.getListaT()[i+1];
        }
        lista.setPosicion(lista.getPosicion()-1);
        JOptionPane.showMessageDialog(null,"El Trabajador a sido eliminado con exito","ELIMINACION DE TRABAJADOR",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void buscarNombre(){
        int ps=lista.buscarPorNombre(JOptionPane.showInputDialog(null,"Digite el nombre del trabajador","BUSCAR TRABAJADOR",JOptionPane.QUESTION_MESSAGE));
        if(ps!=-1){
            JOptionPane.showMessageDialog(null,"RESULTADO EXITOSO\n"+lista.getTrabajador(ps).toString()+"\nSueldo Bruto: S/."+trabajador.getSueldoBruto()
                                +"\nDescuento ( "+Trabajador.DSCT*100+"% ) -> S/."+trabajador.getDescuento()+"\nSueldo neto: "
                                +trabajador.getSueldoNeto(),"BUSCAR TRABAJADOR",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"No se ah encontrado coincidencias","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void ordenarPorNombre(){
        for(int i=0;i<=lista.getPosicion();i++){
            for(int j=0;i<=lista.getPosicion() && i!=j;j++){
                if((lista.getListaT()[i].getNombre()).compareToIgnoreCase(lista.getListaT()[j].getNombre())<0){
                    trabajador_aux=lista.getListaT()[i];
                    lista.getListaT()[i]=lista.getListaT()[j];
                    lista.getListaT()[j]=trabajador_aux;
                }
            }
        }
        String trabajadores="Lista de Trabajadores\n";
        for(int i=0;i<=lista.getPosicion();i++){
            trabajadores+=(i+1)+". "+lista.getTrabajador(i).getNombre()+"\n";
        }
        JOptionPane.showMessageDialog(null,"LISTA ORDENADA ALFABETICAMENTE\n"+trabajadores,"ORDENAMIENTO ALFABETICO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void ordenarSueldoN(){
        for(int i=0;i<=lista.getPosicion();i++){
            for(int j=0;i<=lista.getPosicion() && i!=j;j++){
                if((lista.getListaT()[i].getSueldoNeto())>lista.getListaT()[j].getSueldoNeto()){
                    trabajador_aux=lista.getListaT()[j];
                    lista.getListaT()[j]=lista.getListaT()[i];
                    lista.getListaT()[i]=trabajador_aux;
                }
            }
        }
        String trabajadores="Lista de Trabajadores\n";
        for(int i=0;i<=lista.getPosicion();i++){
            trabajadores+=(i+1)+". "+lista.getTrabajador(i).getNombre()+"\n";
        }
        JOptionPane.showMessageDialog(null,"LISTA ORDENADA EN FORMA DESCENDIENTE DE ACUERDO AL SUELDO NETO\n"+trabajadores,"ORDENAMIENTO ALFABETICO",JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    public static void main(String[] args) {
        int rt;
        do{
            switch(menu()){
                case 1: trabajador=new Trabajador();
                        ingresoDatos();
                        lista.setTrabajador(trabajador);
                        JOptionPane.showMessageDialog(null,"\tEl registro a sido exitoso\n"
                        + "          Gracias","REGISTRO DE TRABAJADOR",JOptionPane.INFORMATION_MESSAGE);break;
                case 2: listarTrabajadores();break;
                case 3: trabajador=lista.getTrabajador(optenerDatosT());
                        JOptionPane.showMessageDialog(null, trabajador.toString()+"\nSueldo Bruto: S/."+trabajador.getSueldoBruto()
                                +"\nDescuento ( "+Trabajador.DSCT*100+"% ) -> S/."+trabajador.getDescuento()+"\nSueldo neto: "
                                +trabajador.getSueldoNeto(),"RESULTADOS DEL TRABAJADOR ",JOptionPane.INFORMATION_MESSAGE);break;
                case 4: eliminarTrabajador(optenerDatosT());break;
                case 5: buscarNombre();break;
                case 6:ordenarPorNombre();break;
                case 7:ordenarSueldoN();break;
            }
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1); 
        
    }
}
