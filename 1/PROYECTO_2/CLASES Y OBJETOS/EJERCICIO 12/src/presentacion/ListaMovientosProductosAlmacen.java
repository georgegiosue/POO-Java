/*
Implementar una clase Lista de Movimientos de Productos de un Almacén
que refleje entradas y salidas de productos de dicho almacén. De cada 
movimiento de producto se conoce el código del producto, la cantidad y
el tipo de movimiento (0: entradas, 1: salidas). La clase debe ser capaz de:


a. Ingresar un movimiento de un producto.
b. Devolver el stock actual de un producto dado.
c. Reportar la relación de productos con su respectivo stock.


 */
package presentacion;
import entidades.*;
import javax.swing.JOptionPane;
/**
 *
 * @author GEORGE
 */
public class ListaMovientosProductosAlmacen {
    private static ListaProductos listaP=new ListaProductos();
    private static Producto producto;
    
    public static void ingresoDatos(Producto producto){
        producto.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el codigo del producto","INGRESO DE DATOS",JOptionPane.QUESTION_MESSAGE)));
        producto.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el stock del producto","INGRESO DE DATOS",JOptionPane.QUESTION_MESSAGE)));
        do{
        producto.setTipoMovimiento(Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de movimiento\n"
                + "1 -> SALIDAS\n"
                + "0 -> ENTRADAS\n"
                + "\n Seleccione escribiendo el digito correspondiente","INGRESO DE DATOS",JOptionPane.QUESTION_MESSAGE)));
        }while(producto.getTipoMovimiento()<0 || producto.getTipoMovimiento()>1);
    }
    
    public static void mostrarDatos(){
        String datos="       RELACION DE TODOS LOS PRODUCTOS\n";
        for(int i=0;i<=listaP.getPosicion();i++){
            datos+=listaP.getLista()[i].toString()+"\n\n";
        }
        JOptionPane.showMessageDialog(null,datos,"       DATOS DE TODOS LOS PRODUCTOS",JOptionPane.INFORMATION_MESSAGE);
                
    }
    
    public static int menu(){
        int opc;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"                          \t\t           MENU\n"
                    + "1. Registrar Producto\n"
                    + "2. Devolver el stock de un producto\n"
                    + "3. Reportar relacion de productos con sus respectivo stock\n\n"
                    + "            Seleccione una opcion"));
        }while(opc<1 || opc >3);return opc;
    }
    
    public static void getStockOfProduct(){
        int code=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el codigo del producto","BUSCAR PRODUCTO",JOptionPane.QUESTION_MESSAGE));
        JOptionPane.showMessageDialog(null,"      El Stock es\n"
                + listaP.getStockOfProduct_by_code(code),"STOCK DE UN PRODUCTO",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
         int rt;
        do{
            switch(menu()){
                case 1:producto=new Producto();
                        ingresoDatos(producto);
                        listaP.setProducto(producto);break;
                case 2: getStockOfProduct();break;
                case 3: mostrarDatos();break;
            }
            
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1);
        
    }
}
