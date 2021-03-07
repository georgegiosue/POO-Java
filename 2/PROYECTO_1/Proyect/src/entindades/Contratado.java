
package entindades;

import javax.swing.JOptionPane;

/**
 *
 * @author GEORGE NAMOC
 */
public class Contratado extends Personal implements Adicionales,Descuentos{
    
    private static float sueldoBasico;
    private float porcentaje;
    private static final int TAM=112;
    private Contratado[] listaContratados=new Contratado[TAM];
    private int indiceListaContratados=-1;
    
    public Contratado(String nombre, String apellidos, String numeroDni, int fechaDeIngreso) {
        super(nombre, apellidos, numeroDni, fechaDeIngreso);
    }
    public Contratado(){
        
    }
    public Contratado[] getListaContratados() {
        return listaContratados;
    }

    public void setIndiceListaContratados(int indiceListaContratados) {
        this.indiceListaContratados = indiceListaContratados;
    }

    public int getIndiceListaContratados() {
        return indiceListaContratados;
    }
    
    public void setContratadoToList(Contratado contratado){
        if(indiceListaContratados!=listaContratados.length){
            indiceListaContratados++;
            getListaContratados()[indiceListaContratados]=contratado;
            JOptionPane.showMessageDialog(null,"Personal registrado con ¡EXITO!","REGISTRO COMPLETO",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"ESPACIO INSUFICIENTE EN EL ARREGLO","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void setSueldoBasico(float sueldoBasico){
        Contratado.sueldoBasico=sueldoBasico;
    }

    public static float getSueldoBasico() {
        return sueldoBasico;
    } 
    
    @Override
    public float getSueldoNeto() {
        return getSueldoBasico()+(getSueldoBasico()*porcentaje)-getDct_diasFaltados()-getDct_minutosTardanza();
    }

    @Override
    public void tiempoLaborado(int aniosLaborados) {
       float pct=0f;
        if(aniosLaborados<=3){
           pct=PCT_0_3_ANIOS;
       }
        if(aniosLaborados>=4 && aniosLaborados<=7){
            pct=PCT_4_7_ANIOS;
        }
        if(aniosLaborados>=8 && aniosLaborados<=15){
            pct=PCT_8_15_ANIOS;
        }
        if(aniosLaborados>15){
            pct=PCT_15_ANIOS;
        }
      porcentaje=pct;
    }

    @Override
    public void descuentosFalta(int diasFaltados) {
        Dct_diasFaltados=(SUELDO_BASICO/30)*diasFaltados;
    }

    @Override
    public void descuentosTardanza(float minutosDeTardanza) {
        // politica de descuento considerando 8 horas laboradas al dia.
        Dct_minutosTardanza=(SUELDO_BASICO/14400)*minutosDeTardanza;
    }
    
    @Override
    public String toString(){
        return super.toString()+
                "Sueldo Basico: "+getSueldoBasico()+"\n"
                + "Sueldo Neto: "+getSueldoNeto()+"\n";
    }
    
}
