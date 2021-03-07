/*
La aplicación debe reflejar los conceptos desarrollados en el curso y permitir:


a. Registrar a un personal (empleado).
b. Registrar a un cliente.
c. Registrar una venta.
d. Listar los datos de los clientes ordenados por sus apellidos en orden descendente.
e. Listar los datos de las venta realizadas por un personal dado su número de DNI.
f. Listar los datos del personal ordenado en forma ascendente por el número de DNI, 
   mostrando el total que ganará cada uno de ellos


*/
package presentacion;

import entidades.Cliente;
import entidades.Personal;
import entidades.Ventas;
import javax.swing.JOptionPane;
/**
 *
 * @author GEORGE NAMOC
 */
public class AppEmpresa {
    
    private static Personal listaPersonal=new Personal();
    private static Personal personal;
    
    private static Cliente listaClientes=new Cliente();
    private static Cliente cliente;
    
    private static Ventas listaVentas=new Ventas();
    private static Ventas venta;
    
    public static int menu(){
        int menu;
        do{
            menu=Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t                                                                  "
                    + "                                                  MENU           \n"
                    + "1. Registrar Personal\n"
                    + "2. Registrar Cliente\n"
                    + "3. Registrar una Venta\n"
                    + "4. Listar los datos de los clientes ordenados por sus apellidos en orden descendente.\n"
                    + "5. Listar los datos de las venta realizadas por un personal dado su número de DNI.\n"
                    + "6. Listar los datos del personal ordenado en forma ascendente por el número de DNI, " +
                      "   mostrando el total que ganará cada uno de ellos\n"
                    + "7. Salir","BIENVENIDO - APP EMPRESA",JOptionPane.QUESTION_MESSAGE));
        }while(menu<1 || menu>7);
       return menu;
    }
    
    
    public static void ingresoDatosPersonal(Personal personal){
        personal.setApellidosPersonal(JOptionPane.showInputDialog(null,"Ingrese los apellidos","INGRESO DE DATOS DEL PERSONAL",JOptionPane.QUESTION_MESSAGE));
        personal.setNombresPersonal(JOptionPane.showInputDialog(null,"Ingrese los nombres del personal","INGRESO DE DATOS DEL PERSONAL",JOptionPane.QUESTION_MESSAGE));
        personal.setNumeroDNIPersonal(JOptionPane.showInputDialog(null,"Digite el numero de DNI","INGRESO DE DATOS DEL PERSONAL",JOptionPane.QUESTION_MESSAGE));
        personal.setAnioNacimientoPersonal(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de nacimiento","INGRESO DE DATOS DEL PERSONAL",JOptionPane.QUESTION_MESSAGE)));
        do{
        personal.setSueldoBasicoPersonal(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el sueldo Basico","INGRESO DE DATOS DEL PERSONAL",JOptionPane.QUESTION_MESSAGE)));
            if(personal.getSueldoBasicoPersonal()<0){
                JOptionPane.showMessageDialog(null,"EL SUELDO ES ERRONEO, Porfavor vuelva a intentarlo :(","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            }
        }while(personal.getSueldoBasicoPersonal()<0);
        personal.setAnioDeIngresoPersonal(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de ingreso","INGRESO DE DATOS DEL PERSONAL",JOptionPane.QUESTION_MESSAGE)));
    
    }
    
    public static void ingresoDatosClientes(Cliente cliente){
        cliente.setApellidosCliente(JOptionPane.showInputDialog(null,"Ingrese los apellidos del cliente","INGRESO DE DATOS DEL CLIENTE",JOptionPane.QUESTION_MESSAGE));
        cliente.setNombresCliente(JOptionPane.showInputDialog(null,"Ingrese los nombres del cliente","INGRESO DE DATOS DEL CLIENTE",JOptionPane.QUESTION_MESSAGE));
        cliente.setNumeroDNICliente(JOptionPane.showInputDialog(null,"Digite el numero de DNI","INGRESO DE DATOS DEL CLIENTE",JOptionPane.QUESTION_MESSAGE));
        cliente.setAnioRegistroCliente(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de registro del cliente","INGRESO DE DATOS DEL CLIENTE",JOptionPane.QUESTION_MESSAGE)));
        cliente.setDireccionCliente(JOptionPane.showInputDialog(null,"Ingrese la direccion del cliente","INGRESO DE DATOS DEL CLIENTE",JOptionPane.QUESTION_MESSAGE));
        cliente.setTelefonoCliente(JOptionPane.showInputDialog(null,"Digite el numeor de telefono del cliente","INGRESO DE DATOS DEL CLIENTE",JOptionPane.QUESTION_MESSAGE));
    }
    
    public static void ingresoDatosVentas(Ventas venta){
        venta.setDniCliente(JOptionPane.showInputDialog(null,"Digite el DNI del cliente","INGRESO DE DATOS DE LAS VENTAS",JOptionPane.QUESTION_MESSAGE));
        venta.setAnioVenta(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de venta del producto","INGRESO DE DATOS DE LAS VENTAS",JOptionPane.QUESTION_MESSAGE)));
        venta.setMontoTotalCompra(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el Monto Total de la compra","INGRESO DE DATOS DE LAS VENTAS",JOptionPane.QUESTION_MESSAGE)));
    }
    
    
    public static int seleccionPersonal(){
        int opc;
        
        String nombres_dni_personal="          PERSONAL\n";
        
        for(int i=0;i<=listaPersonal.getPosicionListaPersonal();i++){
            nombres_dni_personal+=(i+1)+". Nombre: "+listaPersonal.getListaDePersonal()[i].getNombresPersonal()+" DNI: "+listaPersonal.getListaDePersonal()[i].getNumeroDNIPersonal()+"\n";
        }
        
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,nombres_dni_personal+"\n"
                    + "SELECCIONE UN PERSONAL PARA AGREGAR UN PRODUCTO"));
           
            if(opc<1){
                JOptionPane.showMessageDialog(null,"Opcion no valida","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            }
        }while(opc<1);
        return opc-1; // retorna la posicion del personal
    }
    
    public static void main(String[] args) {
        int menu;
        do{
            int menu_=menu();
            menu=menu_;
            switch(menu){
                case 1 :
                            personal=new Personal();
                            ingresoDatosPersonal(personal);
                            listaPersonal.setPersonalToList(personal);
                            JOptionPane.showMessageDialog(null,"Personal Registrado con EXITO!","REGISTRO EXITOSO",JOptionPane.INFORMATION_MESSAGE);break;
                case 2: 
                            
                            cliente=new Cliente();
                            ingresoDatosClientes(cliente);
                            listaClientes.setClienteToList(cliente);
                            JOptionPane.showMessageDialog(null,"Cliente Registrado con EXITO!","REGISTRO EXITOSO",JOptionPane.INFORMATION_MESSAGE);break;
                case 3:     
                            int posicion3=seleccionPersonal();
                            
                            venta= new Ventas();
                            ingresoDatosVentas(venta);
                            listaPersonal.getListaDePersonal()[posicion3].setVentaToPersonal(venta);
                           

                            JOptionPane.showMessageDialog(null,"La venta se a registrado con EXITO!","REGISTRO EXITOSO",JOptionPane.INFORMATION_MESSAGE);break;
                case 4:
                            JOptionPane.showMessageDialog(null,listaClientes.printApellidosDescendienteClientes(),"DATOS DE CLIENTES",JOptionPane.INFORMATION_MESSAGE);break;
                            
                case 5:     
                           int posicion = listaPersonal.searchDNIinArray(JOptionPane.showInputDialog(null,"Digite el Numero de DNI del Personal a buscar","BUSQUEDA",JOptionPane.QUESTION_MESSAGE));
                           if(posicion!=-1){
                               JOptionPane.showMessageDialog(null,listaPersonal.getListaDePersonal()[posicion].toString());
                           }else{
                               JOptionPane.showMessageDialog(null,"No se ah encontrado coincidencias","ERROR DE BUSQUEDA",JOptionPane.ERROR_MESSAGE);
                           }break;
                           
                case 6:   
                            JOptionPane.showMessageDialog(null,listaPersonal.printDNIAscendentePersonal(),"DATOS DEL PERSONAL",JOptionPane.INFORMATION_MESSAGE);break;
                      
                            
            }
            
            
        }while(menu!=7);
        JOptionPane.showMessageDialog(null,"Muchas gracias por utilizar la aplicacion :D","GRACIAS",JOptionPane.INFORMATION_MESSAGE);
    }
}
