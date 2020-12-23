/*
 */
package entidades;

/**
 *
 * @author luisr
 */
public class CuentaAhorro {
    private String nombre;
    private float saldoDeAhorros;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldoDeAhorros() {
        return saldoDeAhorros;
    }

    public void setSaldoDeAhorros(float saldoDeAhorros) {
        this.saldoDeAhorros = saldoDeAhorros;
    }
    
    @Override 
    public String toString() {
        return "\nNombre: " + getNombre() + "\nSueldo en Ahorros: " + getSaldoDeAhorros()+" $";
    }
}
