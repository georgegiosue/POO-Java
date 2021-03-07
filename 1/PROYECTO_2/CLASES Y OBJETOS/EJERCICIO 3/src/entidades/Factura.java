/*
Crear una clase Factura con los atributos: nombre del cliente, la cantidad vendida,
el precio de venta. La clase cuenta con métodos para calcular la venta bruta 
(cantidad vendida * precio de venta), el IGV (19% de la venta bruta) y la venta líquida (venta bruta – IGV).
 */
package entidades;
/**
 *
 * @author IRVIN
 */
public class Factura {
    private String nombre;
    private float cantidad;
    private float precioDeVenta;
    public final static float IGV = 0.19f;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(float precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }
    
    public float getVentaBruta() {
        return getCantidad() * getPrecioDeVenta();
    }
    
    public float getMontoDeDescuento() {
        return getVentaBruta() * IGV;
    }
    
    public float getVentaLiquida() {
        return getVentaBruta() - getMontoDeDescuento();
   }
    
    @Override
     public String toString() {
         return "";
   }
}
