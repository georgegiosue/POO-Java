
package entidades;

/**
 *
 * @author GEORGE NAMOC
 */
public class Ventas {
    private int anioVenta;
    private String dniCliente;
  
    private float montoTotalCompra;
    public static final int TAM=112;

    private int posicion=-1;
    
    
    
    public int getAnioVenta() {
        return anioVenta;
    }

    public void setAnioVenta(int anioVenta) {
        this.anioVenta = anioVenta;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente=dniCliente;
    }


    public float getMontoTotalCompra() {
        return montoTotalCompra;
    }

    public void setMontoTotalCompra(float montoTotalCompra) {
        this.montoTotalCompra = montoTotalCompra;
    }
    
    
    
    @Override
    public String toString(){
        return "                                       VENTA"+"\n"
                + "DNI del Cliente: "+getDniCliente()+"\n"
                + "Año de venta del producto: "+getAnioVenta()+"\n"
                + "Monto Total de la compra: "+getMontoTotalCompra()+"\n";
                
    }
    
}
