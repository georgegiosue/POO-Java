/*
 * Clase Trabajador con los siguientes atributos: nombre, salario por hora y 
 * cantidad de horas laboradas. La clase cuenta con métodos que permiten calcular: 
 * el sueldo bruto (salario por hora * cantidad de horas laboradas), el descuento 
 * equivalente al 12% del sueldo bruto y el sueldo neto (sueldo bruto menos descuento).
 */
package entindades;

/**@author GEORGE**/
 
public class Trabajador {
    private String nombre;
    private float salarioHora;
    private float horasLaboradas;
    public final static float DSCT=0.12f;
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setSalarioHora(float salarioHora){
        this.salarioHora=salarioHora;
    }
    public float getSalarioHora(){
        return salarioHora;
    }
    public void setHorasLaboradas(float horasLaboradas){
        this.horasLaboradas=horasLaboradas;
    }
    public float getHorasLaboradas(){
        return horasLaboradas;
    }
    
    public float getSueldoBruto(){
        return getSalarioHora()*getHorasLaboradas();
    }

    public float getDescuento(){
        return getSueldoBruto()*DSCT;
    }
    
    public float getSueldoNeto(){
        return getSueldoBruto()-getDescuento();
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+
                "\nSalario por hora: "+getSalarioHora()+
                "\nHoras Laboradas: "+getHorasLaboradas();
    }
}
