// Se uso NetBeans 8.2 && JDK 1.8
package presentacion;
import entidades.*;
import javax.swing.JOptionPane;
import java.util.*;
public class AppEmpresa {
    private static Empleado empleado;
    private static ArrayList<Empleado> listaEmpleados=new ArrayList<>();
    private static Iterator<Empleado> iterador;
    
    public static  int menu(){
        int opcion;
        
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t          "
                    + "                     MENU\n\n\n"
                + "1. Registrar Empleado.          \n\n"
                + "2. Listar empleados.           \n\n"
                + "3. Cambiar supervisor de un empleado\n\n"
                + "4. Incrementar Salario a un empleado\n\n"
                + "5. Menu Vendedores\n\n"
                + "6. Menu Jefe de Zona\n\n\n"
                + "\t\tSleccione una opcion","MENU - APP EMPRESA",JOptionPane.INFORMATION_MESSAGE));
        if(opcion<1 || opcion>6)
            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto\n"
            + "\t     Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        } while(opcion<1 || opcion>6);
        return opcion;
    }
    
     public static boolean ciclo(){
        boolean respuesta=true;
        if(JOptionPane.showConfirmDialog(null,"¿Desea realizar otra operación?")!=JOptionPane.YES_OPTION)
        {   
            respuesta=false;
        }
        return respuesta;
    }
     
     
    public static void registrarDatos(byte opc){
         String nombre,apellidos,dni,direccion,telefono;
        int añosAntiguedad;
        float salario;
        EmpleadoSupervisor supervisor;
        Oficina oficina;
        String nombreS,apellidosS,dniS;
        
        nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
        apellidos=JOptionPane.showInputDialog(null,"Ingrese apellidos");
        dni=JOptionPane.showInputDialog(null,"Ingrese DNI");
        direccion=JOptionPane.showInputDialog(null,"Ingrese Direccion");
        telefono=JOptionPane.showInputDialog(null,"Ingrese telefono");
        do{
            añosAntiguedad=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite los años de antiguedad"));
        }while(añosAntiguedad<0);
        salario=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el salario"));
                 JOptionPane.showMessageDialog(null,"Asignar Supervisor");
        nombreS=JOptionPane.showInputDialog(null,"Ingrese el nombre del supervisor");
        apellidosS=JOptionPane.showInputDialog(null,"Ingrese los apellidos del supervisor");
        dniS=JOptionPane.showInputDialog(null,"Ingrese el DNI del supervisor");
        
        supervisor=new EmpleadoSupervisor(nombreS, apellidosS, dniS);
        switch(opc){
            case 1:
                   JOptionPane.showMessageDialog(null,"Registrar Oficina");
                   String nombreOficina=JOptionPane.showInputDialog(null,"Ingrese el nombre de la oficina");
                   String numeroFax=JOptionPane.showInputDialog(null,"Digite el numero de FAX");
                   oficina=new Oficina(nombreOficina);
                   
                   empleado = new Secretario(numeroFax, oficina, nombre, apellidos, dni, direccion, telefono, añosAntiguedad, salario,supervisor);
                   listaEmpleados.add(empleado);
                   JOptionPane.showMessageDialog(null,"Empleado creado con exito");break;
            case 2:
                   JOptionPane.showMessageDialog(null,"Registrar Oficina");
                   String nombreOficina_=JOptionPane.showInputDialog(null,"Ingrese el nombre de la oficina");
                   Oficina oficinaJefe=new Oficina(nombreOficina_);
                    
                                            // Crear Secretario
                    int añosAntiguedadSE;
                    String nombreSE=JOptionPane.showInputDialog(null,"Ingrese nombre");
                    String apellidosSE=JOptionPane.showInputDialog(null,"Ingrese apellidos");
                    String dniSE=JOptionPane.showInputDialog(null,"Ingrese DNI");
                    String direccionSE=JOptionPane.showInputDialog(null,"Ingrese Direccion");
                    String telefonoSE=JOptionPane.showInputDialog(null,"Ingrese telefono");
                    do{
                        añosAntiguedadSE=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite los años de antiguedad"));
                    }while(añosAntiguedad<0);
                    float salarioSE=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el salario"));
                            JOptionPane.showMessageDialog(null,"Registrar Oficina Secretario");
                    String nombreOficinaSE=JOptionPane.showInputDialog(null,"Ingrese el nombre de la oficina");
                    Oficina oficinaSecretario=new Oficina(nombreOficinaSE);
                    String numeroFaxSE=JOptionPane.showInputDialog(null,"Digite el numero de FAX");
                    
                                            // Supervisor del secretario
                    String nombreSE_Supervisor=JOptionPane.showInputDialog(null,"Ingrese el nombre del supervisor");
                    String apellidosSE_Supervisor=JOptionPane.showInputDialog(null,"Ingrese los apellidos del supervisor");
                    String dniSE_Supervisor=JOptionPane.showInputDialog(null,"Ingrese el DNI del supervisor");
                    supervisor= new EmpleadoSupervisor(nombreSE_Supervisor, apellidosSE_Supervisor, dniSE_Supervisor);
                    Secretario secretarioJ= new Secretario(numeroFaxSE, oficinaSecretario, nombreSE, apellidosSE, dniSE, direccionSE, telefonoSE, añosAntiguedadSE, salarioSE, supervisor);
                    
                                                            // Crear Vendedores
                                            JOptionPane.showMessageDialog(null,"Registrar Vendedor");
                                ArrayList<Vendedor> listaVendedores=new ArrayList<>();
                                do{
                                    String nombreV=JOptionPane.showInputDialog(null,"Ingrese nombre");
                                    String apellidosV=JOptionPane.showInputDialog(null,"Ingrese apellidos");
                                    String dniV=JOptionPane.showInputDialog(null,"Ingrese DNI");
                                    String direccionV=JOptionPane.showInputDialog(null,"Ingrese Direccion");
                                    String telefonoV=JOptionPane.showInputDialog(null,"Ingrese telefono");
                                    int añosAntiguedadV;
                                    do{
                                        añosAntiguedadV=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite los años de antiguedad"));
                                    }while(añosAntiguedadV<0);
                                    float salarioV=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el salario"));

                                    // Supervisor del vendedor
                                    String nombreV_Supervisor=JOptionPane.showInputDialog(null,"Ingrese el nombre del supervisor");
                                    String apellidosV_Supervisor=JOptionPane.showInputDialog(null,"Ingrese los apellidos del supervisor");
                                    String dniV_Supervisor=JOptionPane.showInputDialog(null,"Ingrese el DNI del supervisor");
                                    EmpleadoSupervisor supervisorV= new EmpleadoSupervisor(nombreV_Supervisor, apellidosV_Supervisor, dniV_Supervisor);

                                    //Automovil de Vendedor

                                     String matriculaV,marcaV,modeloV;
                                     matriculaV=JOptionPane.showInputDialog(null,"Ingrese la matricula");
                                     marcaV=JOptionPane.showInputDialog(null,"Ingrese la marca");
                                     modeloV=JOptionPane.showInputDialog(null,"Ingrese modelo");

                                     Automovil automovilV=new Automovil(matriculaV, marcaV, modeloV);

                                     //Area de ventas

                                     String areaV=JOptionPane.showInputDialog(null,"Ingrese el area de ventas");


                                      // Lista de clientes

                                      String nombreCliente;
                                      ArrayList<String> nombresClientes=new ArrayList<>();
                                      do{
                                          nombreCliente=JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente");
                                          nombresClientes.add(nombreCliente);
                                          JOptionPane.showMessageDialog(null,"Cliente registrado con exito");
                                      }while(ciclo());

                                      //Porcentaje de ventas
                                      float porcetajeV=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el porcentaje de ventas"));

                                      Vendedor vendedor = new Vendedor(automovilV, areaV, nombresClientes, porcetajeV, nombreV, apellidosV, dniV, direccionV, telefonoV, añosAntiguedadV, salarioV, supervisorV);
                                      listaVendedores.add(vendedor);
                                      JOptionPane.showMessageDialog(null,"Vendedor registrado con exito");
                                }while(ciclo());

                                                    //Automovil JefeZona
                                     String matriculaJ,marcaJ,modeloJ;
                                     matriculaJ=JOptionPane.showInputDialog(null,"Ingrese la matricula");
                                     marcaJ=JOptionPane.showInputDialog(null,"Ingrese la marca");
                                     modeloJ=JOptionPane.showInputDialog(null,"Ingrese modelo");
                                
                                     Automovil automovilJZ = new Automovil(matriculaJ, marcaJ, modeloJ);
                                
                                
                                
                                           // Asignar Secretario a Jefe de Zona & Lista de Vendedores && Veiculo
                    
                    empleado=new JefeZona(oficinaJefe, secretarioJ, listaVendedores, nombre, apellidos, dni, direccion, telefono, añosAntiguedad, salario, supervisor,automovilJZ);
                    listaEmpleados.add(empleado);
                    JOptionPane.showMessageDialog(null,"Empleado creado con exito");break;
                    
            
            
            case 3:
                                                    // Registro De Vendedor
                
                // Automovil 
                
                                     String matriculaV_,marcaV_,modeloV_;
                                     matriculaV_=JOptionPane.showInputDialog(null,"Ingrese la matricula");
                                     marcaV_=JOptionPane.showInputDialog(null,"Ingrese la marca");
                                     modeloV_=JOptionPane.showInputDialog(null,"Ingrese modelo");

                                     Automovil automovilV_global=new Automovil(matriculaV_, marcaV_, modeloV_);
                                     
                String areaventas_VG=JOptionPane.showInputDialog(null,"Ingrese el area de ventas");
                
                // Lista de clientes

                                      String nombreClienteG;
                                      ArrayList<String> nombresClientesG=new ArrayList<>();
                                      do{
                                          nombreClienteG=JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente");
                                          nombresClientesG.add(nombreClienteG);
                                          JOptionPane.showMessageDialog(null,"Cliente registrado con exito");
                                      }while(ciclo());
                //Porcentaje de ventas
                                      
                                      float porcetajeVG=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el porcentaje de ventas"));
                                      
                empleado=new Vendedor(automovilV_global, areaventas_VG, nombresClientesG, porcetajeVG, nombre, apellidos, dni, direccion, telefono, añosAntiguedad, salario, supervisor);
                listaEmpleados.add(empleado);
                JOptionPane.showMessageDialog(null,"Empleado creado con exito");break;
                                      
        }
        
    }
    
    
    
    public static String listarEmpleados(){
        String datos=null;
        iterador=listaEmpleados.iterator();
        while(iterador.hasNext()){
            int i=1;
            datos+=(i)+". "+iterador.next().toString()+"\n";
            i++;
        }
        return datos;
    }
    
    
    
    public static void main(String[] args) {
        do{
            switch (menu()) {
                case 1: 
                        byte opcion;
                        do{
                        opcion=Byte.parseByte(JOptionPane.showInputDialog(null,"Seleccione el tipo de empleado a registrar\n"
                                + "1. Secretario\n"
                                + "2. Jefe de Zona\n"
                                + "3. Vendedor\n","Registro",JOptionPane.QUESTION_MESSAGE));
                        }while(opcion <1 || opcion >3);
                        registrarDatos(opcion);break;
                case 2: JOptionPane.showMessageDialog(null,"Lista de Empleados\n"+listarEmpleados());break; // Muestra toda la informacion, incluido el aumento
                                                                                                            // del Salario de acuerdo a la antiguedad del Empleado.
                
            }
        JOptionPane.showConfirmDialog(null, "A continuacion se le consultara si desea abandonar el menu");
        }while(ciclo());
        JOptionPane.showMessageDialog(null,"¡Muchas gracias por utilizar la App! :)","SESION FINALIZADA",JOptionPane.INFORMATION_MESSAGE);
    }
}
