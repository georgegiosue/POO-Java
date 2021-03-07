
package run.app;
import javax.swing.JOptionPane;
import entindades.*;
/**
 *
 * @author GEORGE NAMOC
 */

public final class Metodos {
    
    public static void bienvenida(){
    JOptionPane.showMessageDialog(null,"\t                    Bienvenido a la app Empresa\n\n"
                + "                   ¿Que hace esta aplicación?\n"
                + ". Administra los datos del personal (Contratado o ADestajo)","INICIO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static  int menu(){
        int opcion;
        
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t          "
                    + "                     MENU\n\n\n"
                + "1. Registrar datos del personal contratado.          \n\n"
                + "2. Registrar datos del personal a destajo.           \n\n"
                + "3. Listar datos del personal contratado\n"
                + "   ordenados de forma ascendente por sus\n"
                + "   apellidos.                                        \n\n"
                + "4. Listar datos del personal a destajo\n"
                + "   ordenados en forma descendente por\n"
                + "   el numero de clientes captados.                   \n\n"
                + "5. Modificar los datos de un personal\n"
                + "   a destajo, dado su numero de DNI:               \n\n\n"
                + "\t\tSleccione una opcion","MENU - APP EMPRESA",JOptionPane.INFORMATION_MESSAGE));
        if(opcion<1 || opcion>5)
            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto\n"
            + "\t     Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        } while(opcion<1 || opcion>5);
        return opcion;
    }
    
    public static boolean ciclo(){
        boolean respuesta=true;
        if(JOptionPane.showConfirmDialog(null,"¿Desea realizar otra operación?")!=JOptionPane.YES_OPTION)
        {   
            respuesta=false;
            JOptionPane.showMessageDialog(null,"Gracias por utilizar la Aplicacion","SALIR",JOptionPane.INFORMATION_MESSAGE);
        }
        return respuesta;
    }
        
  
    
    public static void agregarPersonal(Contratado listaContratado,Contratado contratado){
        listaContratado.setContratadoToList(contratado);   
    }
    
    public static void agregarPersonal(ADestajo listaADestajo,ADestajo adestajo){
        listaADestajo.setADestajoToList(adestajo);
    }
    
    public static Contratado registroDatosContratado(Contratado contratado){
        String nombre,apellidos,numeroDni,titulo="REGISTRO - PERSONAL CONTRATADO";
        int fechaDeIngreso,tiempo_laborado,diasFaltados;
        float minutosTardanza;
        
        nombre=JOptionPane.showInputDialog(null,"Ingrese el nombre del personal",titulo,JOptionPane.QUESTION_MESSAGE).toUpperCase();
        apellidos=JOptionPane.showInputDialog(null,"Ingrese los apellidos del personal",titulo,JOptionPane.QUESTION_MESSAGE).toUpperCase();
        numeroDni=JOptionPane.showInputDialog(null,"Digite el numero de DNI del personal",titulo,JOptionPane.QUESTION_MESSAGE);
        fechaDeIngreso=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de ingreso del personal",titulo,JOptionPane.QUESTION_MESSAGE));
        
        contratado=new Contratado(nombre, apellidos, numeroDni, fechaDeIngreso);
        do{
            tiempo_laborado=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tiempo laborado en años",titulo,JOptionPane.QUESTION_MESSAGE));
            if(tiempo_laborado<0) JOptionPane.showMessageDialog(null,"El Tiempo laborado es incorrecto\n   Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        }while(tiempo_laborado<0);
        do{
            diasFaltados=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite los dias faltados",titulo,JOptionPane.QUESTION_MESSAGE));
            if(diasFaltados<0) JOptionPane.showMessageDialog(null,"Los dias faltados son incorrectos\n   Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        }while(diasFaltados<0);
        do{
            minutosTardanza=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite los minutos faltados",titulo,JOptionPane.QUESTION_MESSAGE));
            if(minutosTardanza<0) JOptionPane.showMessageDialog(null,"Los minutos de Tardanza son incorrectos\n  Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        }while(minutosTardanza<0);
        
        contratado.tiempoLaborado(tiempo_laborado);
        contratado.descuentosFalta(diasFaltados);
        contratado.descuentosTardanza(minutosTardanza);
        
        return contratado;
    }
    
    public static ADestajo registroDatosADestajo(ADestajo aDestajo){
        String nombre,apellidos,numeroDni,titulo="REGISTRO - PERSONAL A DESTAJO";
        int fechaDeIngreso,numeroClientesCaptados,diasFaltados;
        float minutosTardanza,montoTotalVentas,porcentajeVentasClientes;
        
        nombre=JOptionPane.showInputDialog(null,"Ingrese el nombre del personal",titulo,JOptionPane.QUESTION_MESSAGE).toUpperCase();
        apellidos=JOptionPane.showInputDialog(null,"Ingrese los apellidos del personal",titulo,JOptionPane.QUESTION_MESSAGE).toUpperCase();
        numeroDni=JOptionPane.showInputDialog(null,"Digite el numero de DNI del personal",titulo,JOptionPane.QUESTION_MESSAGE);
        fechaDeIngreso=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de ingreso del personal",titulo,JOptionPane.QUESTION_MESSAGE));
        
        do{
            numeroClientesCaptados=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de clientes captados por el personal",titulo,JOptionPane.QUESTION_MESSAGE));
            if(numeroClientesCaptados<0) JOptionPane.showMessageDialog(null,"El valor ingresado es incorrecto\n Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        }while(numeroClientesCaptados<0);
        
        do{
            diasFaltados=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite los dias faltados",titulo,JOptionPane.QUESTION_MESSAGE));
            if(diasFaltados<0) JOptionPane.showMessageDialog(null,"Los dias faltados son incorrectos\n  Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        }while(diasFaltados<0);
        
        do{
            minutosTardanza=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite los minutos de tardanza",titulo,JOptionPane.QUESTION_MESSAGE));
            if(minutosTardanza<0) JOptionPane.showMessageDialog(null,"Los minutos de tardanza son incorrectos\n Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        }while(minutosTardanza<0);
        
        do{
           montoTotalVentas=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el monto total de las ventas realizadas por el personal",titulo,JOptionPane.QUESTION_MESSAGE));
           if(montoTotalVentas<0) JOptionPane.showMessageDialog(null,"El valor ingresado es incorrecto\n Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        }while(montoTotalVentas<0);
        
        do{
            porcentajeVentasClientes=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el procentaje de las ventas realizadas a los clientes captados\n"
                    + "       Considere el valor [1% - 100%]",titulo,JOptionPane.QUESTION_MESSAGE));
            if(porcentajeVentasClientes<1 || porcentajeVentasClientes>100) JOptionPane.showMessageDialog(null,"El valor ingresado es incorecto\n Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        }while(porcentajeVentasClientes<1 || porcentajeVentasClientes>100);
        
        aDestajo=new ADestajo(nombre, apellidos, numeroDni, fechaDeIngreso, numeroClientesCaptados, montoTotalVentas, porcentajeVentasClientes);
        
        return aDestajo;
    }
    
    public static void listarDatos(Contratado listaContratados){
        
        // Datos ordenados de forma ascendente por sus apellidos
        
        String datos="\t\t           Personal Contratado\n"; Contratado apellidos_aux;
            for(int i=0;i<=listaContratados.getIndiceListaContratados();i++){
            for(int j=0;j<listaContratados.getIndiceListaContratados()&&i!=j;j++){
                if(listaContratados.getListaContratados()[i].getApellidos().compareToIgnoreCase(listaContratados.getListaContratados()[j].getApellidos())<0){
                    apellidos_aux=listaContratados.getListaContratados()[i];
                    listaContratados.getListaContratados()[i]=listaContratados.getListaContratados()[j];
                    listaContratados.getListaContratados()[j]=apellidos_aux;
                }
            }
        }
        for(int i=0;i<=listaContratados.getIndiceListaContratados();i++){
            datos+=(i+1)+". "+listaContratados.getListaContratados()[i].toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,datos,"\t DATOS - PERSONAL CONTRATADO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void listarDatos(ADestajo listaADestajo){
        
        // Datos ordenados de forma descendiente por el numero de clientes captados
        
        String datos="\t\t           Personal A Destajo\n"; ADestajo clientesCaptados_aux;
            for(int i=0;i<=listaADestajo.getIndiceListaADestajo();i++){
            for(int j=0;j<listaADestajo.getIndiceListaADestajo()&&i!=j;j++){
                if((listaADestajo.getListaADestajos()[i].getNumeroClientesCaptados())>(listaADestajo.getListaADestajos()[j].getNumeroClientesCaptados())){
                    clientesCaptados_aux=listaADestajo.getListaADestajos()[i];
                    listaADestajo.getListaADestajos()[i]=listaADestajo.getListaADestajos()[j];
                    listaADestajo.getListaADestajos()[j]=clientesCaptados_aux;
                }
            }
        }
        for(int i=0;i<=listaADestajo.getIndiceListaADestajo();i++){
            datos+=(i+1)+". "+listaADestajo.getListaADestajos()[i].toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,datos,"\t DATOS - PERSONAL A DESTAJO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void modificarDatosADestajo_DNI(ADestajo listaADestajo){
        String titulo="MODIFICAR DATOS - PERSONAL A DESTAJO";
        String dni=JOptionPane.showInputDialog(null,"Digite el numero de DNI del personal A Destajo",titulo,JOptionPane.QUESTION_MESSAGE);
        int indice=-1;
        for(int i=0;i<=listaADestajo.getIndiceListaADestajo();i++){
            if(dni.compareToIgnoreCase(listaADestajo.getListaADestajos()[i].getNumeroDni())==0){
                indice=i;
            }
        }
        if(indice!=-1){
            JOptionPane.showMessageDialog(null,"                               ¡Busqueda Exitosa!\n"
                    + listaADestajo.getListaADestajos()[indice].toString()+"\n"
                            + "Click en Ok para proceder a modificar los datos",titulo,JOptionPane.INFORMATION_MESSAGE);
            int numeroClientesCaptados;
            float montoTotalVentas,porcentajeVentasClientes;
            
            do{
                numeroClientesCaptados=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de clientes captados por el personal",titulo,JOptionPane.QUESTION_MESSAGE));
                if(numeroClientesCaptados<0) JOptionPane.showMessageDialog(null,"El valor ingresado es incorrecto\n Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
            }while(numeroClientesCaptados<0);
            
            do{
                montoTotalVentas=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el monto total de las ventas realizadas por el personal",titulo,JOptionPane.QUESTION_MESSAGE));
                if(montoTotalVentas<0) JOptionPane.showMessageDialog(null,"El valor ingresado es incorrecto\n Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
            }while(montoTotalVentas<0);
        
            do{
                porcentajeVentasClientes=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el procentaje de las ventas realizadas a los clientes cpatados\n"
                        + "       Considere el valor [1% - 100%]",titulo,JOptionPane.QUESTION_MESSAGE));
                if(porcentajeVentasClientes<1 || porcentajeVentasClientes>100) JOptionPane.showMessageDialog(null,"El valor ingresado es incorecto\n Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
            }while(porcentajeVentasClientes<1 || porcentajeVentasClientes>100);
        
            listaADestajo.getListaADestajos()[indice].setMontoTotalVentas(montoTotalVentas);
            listaADestajo.getListaADestajos()[indice].setNumeroClientesCaptados(numeroClientesCaptados);
            listaADestajo.getListaADestajos()[indice].setPorcentajeVentasClientes(porcentajeVentasClientes);
            
            JOptionPane.showMessageDialog(null,"Los datos del personal ADestajo fueron modificados satisfactoriamente\n"
                    +listaADestajo.getListaADestajos()[indice].toString(),titulo,JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"No se a encontrado coincidencias\n"
                    + "",titulo,JOptionPane.ERROR_MESSAGE);
        }
    }
}
