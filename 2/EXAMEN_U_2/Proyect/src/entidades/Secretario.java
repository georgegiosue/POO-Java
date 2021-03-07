/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author GEORGE
 */
public class Secretario extends Empleado implements SalarioIncremento {

    private String numeroFax;
    private Oficina oficina;
    
    public Secretario(){
        super();
        this.numeroFax="NA";
        this.incrementoAnual=0f;
        this.oficina=new Oficina();
    }

    public Secretario(String numeroFax, Oficina oficina, String nombre, String apellidos, String dni, String direccion, String telefono, int añosAntiguedad, float salario,EmpleadoSupervisor supervisor) {
        super(nombre, apellidos, dni, direccion, telefono, añosAntiguedad, salario,supervisor);
        this.numeroFax = numeroFax;
        this.oficina = oficina;
    }

    public String getNumeroFax() {
        return numeroFax;
    }

    public void setNumeroFax(String numeroFax) {
        this.numeroFax = numeroFax;
    }

    public float getIncrementoAnual() {
        return incrementoAnual;
    }

    public void setIncrementoAnual(float incrementoAnual) {
        this.incrementoAnual = incrementoAnual;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
    
    @Override
    public String puesto() {
        puestoEmpresa="SECRETARIO";
        return puestoEmpresa;
    }
    
    @Override
    public float incrementoSalario() {
        this.incrementoAnual=0.05f;
        return salario+(salario*incrementoAnual*añosAntiguedad);
        
    }
    
    @Override
    public String toString(){
        return super.toString()+
                "Puesto en la empresa: "+puesto()+"\n"+
                "Numero de Fax: "+getNumeroFax()+"\n"
                +"Incremento Salario: "+incrementoSalario()+"\n"
                + "                 Oficina\n"
                + oficina.toString()+"\n";
    }

    
}
