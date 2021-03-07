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
public abstract class Empleado {
    protected String nombre,apellidos,dni,direccion,telefono,puestoEmpresa;
    protected int añosAntiguedad;
    protected float salario, incrementoAnual;
    protected EmpleadoSupervisor supervisor;

    public Empleado() {
        this.nombre="MA";
        this.apellidos="MA";
        this.dni="MA";
        this.direccion="MA";
        this.telefono="MA";
        this.puestoEmpresa="MA";
        this.añosAntiguedad=0;
        this.salario=0f;
        this.supervisor=new EmpleadoSupervisor();
    }

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, int añosAntiguedad, float salario, EmpleadoSupervisor supervisor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.añosAntiguedad = añosAntiguedad;
        this.salario = salario;
        this.supervisor=supervisor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPuestoEmpresa() {
        return puestoEmpresa;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void asignarSupervisor(EmpleadoSupervisor supervisor){
        this.supervisor=supervisor;
    }
    
    public void cambiarSupervisor(EmpleadoSupervisor supervisor){
        this.supervisor=supervisor;
    }
    
    public abstract String puesto();

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+"\n"
                + "Apellidos: "+getApellidos()+"\n"
                + "Dni: "+getDni()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Años de Antiguedad: "+getAñosAntiguedad()+"\n"
                + "Telefono: "+getTelefono()+"\n"
                + "Salario: "+getSalario()+"\n"
                + "               Supervisor\n"
                + supervisor.toString()+"\n\n";
    }
    
    
}
