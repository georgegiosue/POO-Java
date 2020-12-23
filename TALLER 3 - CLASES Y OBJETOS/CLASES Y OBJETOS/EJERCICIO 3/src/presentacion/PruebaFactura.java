/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;
import entidades.Factura;
import javax.swing.JOptionPane;
/**
 *
 * @author IRVIN
 */
public class PruebaFactura {
    private static Factura oa;
    
    public static void ingresoDeDatos() {
        float cantidad, precioDeVenta;
        String nombre;
        nombre = JOptionPane.showInputDialog(null, "Nombre del cliente: ", "Datos del cliente", 3);
        
       do {
       cantidad = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la cantidad a comprar: ", "Datos del cliente", 3));
       if(cantidad < 1)
       JOptionPane.showMessageDialog(null, "La cantidad \ndebe ser mayor que cero", "Datos del cliente", 2);
       }while(cantidad < 1);
       
       do {
       precioDeVenta = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio del producto: ", "Datos del cliente", 3));    
       if(precioDeVenta<1)
       JOptionPane.showMessageDialog(null, "El precio \ndebe ser mayor que cero", "Datos del cliente", 2);
       }while(precioDeVenta < 1);
       oa.setNombre(nombre);
       oa.setCantidad(cantidad);
       oa.setPrecioDeVenta(precioDeVenta);
    }
    
    public static void mostrarResultados () {
        String mensaje = "Datos: \n";
        mensaje += oa.toString();
        mensaje += "\nNombre del cliente: " + oa.getNombre() +
               "\nCantidad comprada: " + oa.getCantidad() +
                "\nPrecio de venta: " + "s/." + oa.getPrecioDeVenta() +
                "\nVenta bruta: " + "s/."+ oa.getVentaBruta() +
                "\nMonto del descuento (IGV " + (Factura.IGV*100) + "%): " + "s/." + oa.getMontoDeDescuento() + 
                "\nVenta líquida: " + "s/." + oa.getVentaLiquida();
        JOptionPane.showMessageDialog(null, mensaje, "   ***Reporte de la factura de venta***", 1);
    }
    public static void main(String[] args) {
        oa = new Factura();
        JOptionPane.showMessageDialog(null, "Factura de venta", "Generador de facturas",1);
        ingresoDeDatos();
        mostrarResultados();
        
    }
}
