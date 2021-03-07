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
public class ListaProductos {
    public static final int TAM=16;
    Producto productos[]=new Producto[TAM];
    
    private int posicion=-1;
    
    public Producto[] getLista() {
        return productos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setLista(Producto[] productos) {
        this.productos = productos;
    }
    
    public int getTamaño(){
        return productos.length;
    }
    
    public int getNumeroProductos(){
        return getPosicion()+1;
    }
    
    public void setProducto(Producto producto){
        posicion++;
        getLista()[posicion]=producto;
    }
    
    public int getStockOfProduct_by_code(int codigo){
        int ps = 0;
        for (int i=0;i<=getPosicion();i++){
            if((codigo==getLista()[i].getCodigo())){
                ps=i;
            }
        }
        return getLista()[ps].getCantidad();
    }
    
}
