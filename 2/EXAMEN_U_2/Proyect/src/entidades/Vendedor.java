/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.*;
/**
 *
 * @author GEORGE
 */
public class Vendedor extends Empleado implements SalarioIncremento{
    private Automovil automovil;
    private String areaVenta;
    private ArrayList<String> listaClientes;
    private float porcentajeV;
    
    public Vendedor(){
        super();
        this.automovil=new Automovil();
        this.areaVenta="NA";
        this.listaClientes=new ArrayList<>();
        this.porcentajeV=0f;
    }

    public Vendedor(Automovil automovil, String areaVenta, ArrayList<String> listaClientes, float porcentajeV, String nombre, String apellidos, String dni, String direccion, String telefono, int añosAntiguedad, float salario,EmpleadoSupervisor supervisor) {
        super(nombre, apellidos, dni, direccion, telefono,añosAntiguedad, salario,supervisor);
        this.automovil = automovil;
        this.areaVenta = areaVenta;
        this.listaClientes = listaClientes;
        this.porcentajeV = porcentajeV;
    }
    
    public void darBajaNuevoCliente(String cliente){
        listaClientes.remove(cliente);
    }
    
    public void cambiarAutomovil(Automovil automovil){
        this.automovil=automovil;
    }
    
    @Override
    public String puesto() {
        this.puestoEmpresa="VENDEDOR";
        return puestoEmpresa;
    }

    @Override
    public float incrementoSalario() {
        this.incrementoAnual=0.10f;
        return salario+(salario*incrementoAnual*añosAntiguedad);
    }
    
    public String listarClientes(){
        Iterator<String> iterador=listaClientes.iterator();
        String datos=null;
        while(iterador.hasNext()){
            datos+=iterador.next()+"\n";
        }
        return datos;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"Puesto en la empresa: "+puesto()+"\n"
                +"Incremento Salario: "+incrementoSalario()+"\n"
                +"    Automvil\n"
                +automovil.toString()
                +"      Area Venta\n"
                +areaVenta
                +"      Clientes\n"
                +listarClientes()+"\n"
                +"Porcentaje de las ventas: "+porcentajeV+"\n";
    }
    
}
