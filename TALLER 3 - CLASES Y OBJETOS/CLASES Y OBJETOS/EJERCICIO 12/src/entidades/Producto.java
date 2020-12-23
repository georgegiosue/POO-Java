/*
Implementar una clase Lista de Movimientos de Productos de un Almacén
que refleje entradas y salidas de productos de dicho almacén. De cada 
movimiento de producto se conoce el código del producto, la cantidad y
el tipo de movimiento (0: entradas, 1: salidas). La clase debe ser capaz de:


a. Ingresar un movimiento de un producto.
b. Devolver el stock actual de un producto dado.
c. Reportar la relación de productos con su respectivo stock.


 */
package entidades;



/**
 *
 * @author GEORGE
 */
public class Producto {
    private int codigo,cantidad;
    private int tipoMovimiento;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }
    
    public String getConvert_TipoMovimiento(int tipoMovimiento){
        String rtp;
        if(tipoMovimiento==1){
            rtp="SALIDAS";
        }else{
            rtp="ENTRADAS";
        }
        return rtp;
    }
    
    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    
   @Override
    public String toString(){
        return "Codigo: "+getCodigo()+"\nStock del Producto: "+getCantidad()+"\nTipo de movimiento: "
                +getConvert_TipoMovimiento(getTipoMovimiento());
    }
    
    
}
