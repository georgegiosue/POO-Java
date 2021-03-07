
package entindades;

/**
 *
 * @author GEORGE NAMOC
 */
public abstract class Personal {
    protected String nombre;
    protected String apellidos;
    protected String numeroDni;
    protected int fechaDeIngreso;
    protected float Dct_diasFaltados;
    protected float Dct_minutosTardanza;
    
    public Personal(){
        this.nombre="NN";
        this.apellidos="NN";
        this.numeroDni="NN";
        this.fechaDeIngreso=0;
    };
    
    public Personal(String nombre,String apellidos,String numeroDni,int fechaDeIngreso){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numeroDni=numeroDni;
        this.fechaDeIngreso=fechaDeIngreso;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getNumeroDni(){
        return numeroDni;
    }
    
    public int getFechaDeIngreso(){
        return fechaDeIngreso;
    }
    
    public abstract float getSueldoNeto();

    public float getDct_diasFaltados() {
        return Dct_diasFaltados;
    }

    public float getDct_minutosTardanza() {
        return Dct_minutosTardanza;
    }
    
    @Override
    public String toString(){
        return "Nombres: "+getNombre()+"\n"
                + "Apellidos: "+getApellidos()+"\n"
                + "Numero de Dni: "+getNumeroDni()+"\n"
                + "Fecha de Ingreso: "+getFechaDeIngreso()+"\n";
    }
    
}
