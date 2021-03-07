
package entindades;

import javax.swing.JOptionPane;

/**
 *
 * @author GEORGE NAMOC
 */
public class ADestajo extends Personal implements Descuentos{
    private int numeroClientesCaptados;
    private float montoTotalVentas;
    private float porcentajeVentasClientes;
    private static final int TAM=112;
    private ADestajo[] listaADestajos=new ADestajo[TAM]; 
    private int indiceListaADestajo=-1;
    
    public ADestajo(){
        
    }
    
    public ADestajo(String nombre, String apellidos, String numeroDni, int fechaDeIngreso
                    ,int numeroClientesCaptados, float montoTotalVentas,float porcentajeVentasClientes) {
        super(nombre, apellidos, numeroDni, fechaDeIngreso);
        this.numeroClientesCaptados=numeroClientesCaptados;
        this.montoTotalVentas=montoTotalVentas;
        this.porcentajeVentasClientes=porcentajeVentasClientes;
    }

    public ADestajo[] getListaADestajos() {
        return listaADestajos;
    }

    public int getIndiceListaADestajo() {
        return indiceListaADestajo;
    }
    
    public void setADestajoToList(ADestajo adestajo){
        if(indiceListaADestajo!=getListaADestajos().length){
            indiceListaADestajo++;
            getListaADestajos()[indiceListaADestajo]=adestajo;
            JOptionPane.showMessageDialog(null,"Personal registrado con ¡EXITO!","REGISTRO COMPLETO",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"ESPACIO INSUFICIENTE EN EL ARREGLO","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public float getSueldoNeto() {
        return (getMontoTotalVentas()*getPorcentajeVentasClientes()/100)-getDct_diasFaltados()-getDct_minutosTardanza();
    }

    @Override
    public void descuentosFalta(int diasFaltados) {
        Dct_diasFaltados=(SUELDO_BASICO/30f)*diasFaltados;
    }

    @Override
    public void descuentosTardanza(float minutosDeTardanza) {
         // politica de descuento considerando 8 horas laboradas al dia.
        Dct_minutosTardanza=(SUELDO_BASICO/14400f)*minutosDeTardanza;
    }

    public void setNumeroClientesCaptados(int numeroClientesCaptados) {
        this.numeroClientesCaptados = numeroClientesCaptados;
    }

    public void setMontoTotalVentas(float montoTotalVentas) {
        this.montoTotalVentas = montoTotalVentas;
    }

    public void setPorcentajeVentasClientes(float porcentajeVentasClientes) {
        this.porcentajeVentasClientes = porcentajeVentasClientes;
    }
    
    public float getMontoTotalVentas() {
        return montoTotalVentas;
    }

    public int getNumeroClientesCaptados() {
        return numeroClientesCaptados;
    }
    
    public float getPorcentajeVentasClientes() {
        return porcentajeVentasClientes;
    }
     
    @Override
    public String toString(){
        return super.toString()+
                "Numero de Clientes captados: "+getNumeroClientesCaptados()+"\n"
                + "Monto Total de las ventas realizadas: "+getMontoTotalVentas()+"\n"
                + "Porcentaje de las ventas realizadas a los clientes captados: "+getPorcentajeVentasClientes()+"%\n"
                + "Sueldo Neto: "+getSueldoNeto()+"\n";
    }
}
