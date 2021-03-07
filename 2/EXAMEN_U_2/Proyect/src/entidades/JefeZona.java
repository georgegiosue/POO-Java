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
public class JefeZona extends Empleado implements SalarioIncremento {
    private Oficina oficina;
    private Secretario secretario;
    private ArrayList<Vendedor> vendedores;
    private Automovil automovil;

    public JefeZona(){
        super();
        this.oficina=new Oficina();
        this.secretario=new Secretario();
        this.vendedores=new ArrayList<>();
    }

    public JefeZona(Oficina oficina, Secretario secretario, ArrayList<Vendedor> vendedores, String nombre, String apellidos, String dni, String direccion, String telefono, int añosAntiguedad, float salario,EmpleadoSupervisor supervisor,Automovil automovil) {
        super(nombre, apellidos, dni, direccion, telefono, añosAntiguedad, salario,supervisor);
        this.oficina = oficina;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.automovil=automovil;
    }
    
    public void cambiarSecretario(Secretario secretario){
        this.secretario=secretario;
    }
    
    public void cambiarCoche(Automovil automovil){
        this.automovil=automovil;
    }
    
    public void darBajaVendedor(Vendedor vendedor){
        vendedores.remove(vendedor);
    }
    
    @Override
    public String puesto() {
        puestoEmpresa="JEFE_ZONA";
        return  puestoEmpresa;
    }

    @Override
    public float incrementoSalario() {
        incrementoAnual=0.20f;
        return salario+(salario*incrementoAnual*añosAntiguedad);
    }
    
    public String listarVendedores(){
        Iterator<Vendedor> iterador=vendedores.iterator();
        String datos=null;
        while(iterador.hasNext()){
            datos+=iterador.next().toString()+"\n";
        }
        return datos;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"Incremento Salario: "+incrementoAnual+"\n"
                +"Puesto en la empresa: "+puesto()+"\n"
                +"     Oficina\n"
                +oficina.toString()+"\n"
                + "    Secretario\n"
                +secretario.toString()+"\n"
                +"     Vendedores\n"
                +listarVendedores()+"\n"
                + "     Automovil\n"
                +automovil.toString();
    }
    
}
