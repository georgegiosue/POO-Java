/*
Modificar la clase MiFecha de modo que detecte errores en los valores
de los inicializadores para las variables de ejemplar (atributos) día, 
mes y año. También debe proporcionarse un método SiguienteDía para 
incrementar un día a la fecha guardada. Deben probarse los siguientes casos:



a. Incrementar un día pasando al siguiente mes.
b. Incrementar un mes pasando al siguiente año.
 */
package entiidad;
import javax.swing.JOptionPane;
/**
 *
 * @author GEORGE NAMOC
 */
public class MiFechaModificado {
    private int dia;
    private int mes;String mes_;
    private int año;
    
    public MiFechaModificado(){
        
    }
    
    public MiFechaModificado(int dia, int mes, int año){
        String mes_letras="";
        int dia_=dia,mes_=mes,año_=año;
        this.dia=dia_;
        this.mes=mes_;
        this.año=año_;
        if(this.mes<1||this.mes>12){
            do{
                this.mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Se ah comentido un error en el mes_\n\n      Digite nuevamente","ERROR",JOptionPane.ERROR_MESSAGE));
            }while(this.mes<1||this.mes>12);
        }
        if(this.dia<1||this.dia>31){
            do{
            this.dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Se ah comentido un error en el dia\n\n       Digite nuevamente","ERROR",JOptionPane.ERROR_MESSAGE));
            }while(this.dia<1||this.dia>31);
        }
        if(this.dia>30 && (this.mes==11 || this.mes==9 || this.mes==6 || this.mes==4 || this.mes==2) || this.dia>28 && this.mes==2 && this.año%4!=0){
            do{
            this.dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Se ah comentido un error en el dia_\n\n       Digite nuevamente","ERROR",JOptionPane.ERROR_MESSAGE));
            }while(this.dia>30 && (this.mes==11 || this.mes==9 || this.mes==6 || this.mes==4 || this.mes==2) || this.dia>28 && this.mes==2 && this.año%4!=0);
        }
        if(this.dia>29 && this.año%4==0 && this.mes==2){
            do{
            this.dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Se ah comentido un error en el dia_\n\n       Digite nuevamente","ERROR",JOptionPane.ERROR_MESSAGE));
            }while(this.dia>29 && this.año%4==0 && this.mes==2);
        }
        switch (mes_) {
            case 1: mes_letras="Enero";break;
            case 2: mes_letras="Febrero";break;
            case 3: mes_letras="Marzo";break;
            case 4: mes_letras="Abril";break;
            case 5: mes_letras="Mayo";break;
            case 6: mes_letras="Junio";break;
            case 7: mes_letras="Julio";break;
            case 8: mes_letras="Agosto";break;
            case 9: mes_letras="Septiembre";break;
            case 10: mes_letras="Octubre";break;
            case 11: mes_letras="Noviembre";break;
            case 12: mes_letras="Diciembre";break;
        }
        
        this.mes_=mes_letras;
    }

    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMes_String() {
        return mes_;
    }

    public int getAño() {
        return año;
    }
    
    
   //  Incrementar un día pasando al siguiente mes  
    public MiFechaModificado unDiaIncrementadoPasadoMes(MiFechaModificado fecha){
         
       int dia1=fecha.getDia();
       int mes1=fecha.getMes();
       int año1=fecha.getAño();
       if(dia1==31 && (mes1==1 || mes1==3 || mes1==5 || mes1==7 || mes1==8 || mes1==10 || mes1==12)){
           dia1=0;
       }
       if(dia1==28 && mes1==2 && año1%4!=0){
           dia1=0;
       }
       if(dia1==29 && mes1==2 && año1%4==0){
           dia1=0;
       }
       if(dia1==30 && mes1==4 || mes1==6 || mes1==9 || mes1==11){
           dia1=0;
       }
       if(mes1==12){
           mes1=0;
       }
        
        MiFechaModificado fechaDiaIncrementadoMes=new MiFechaModificado(dia1+1,mes1+1,año1); 
        return fechaDiaIncrementadoMes;
    }
    
    //  Incrementar un mes pasando al siguiente año
    
    public MiFechaModificado unMesPasadoSiguienteAnio(MiFechaModificado fecha){ 
       int dia2=fecha.getDia();
       int mes2=fecha.getMes();
       int año2=fecha.getAño();
       
       if(mes2==12){
           mes2=0;
       }
        
        MiFechaModificado fechaIncrementarMesPasadoAnio=new MiFechaModificado(dia2, mes2+1, año2+1);
        return fechaIncrementarMesPasadoAnio;
    }
    
    
    @Override
    public String toString(){
        return "      \n\n                       La Fecha es\n\n"
                + "FORMATO: MM//DD//AA ->    "+getMes()+"  //  "+getDia()+"  //  "+getAño()+"\n"
                + "FORMATO: DD//MM//AA ->    "+getDia()+"  //  "+getMes()+"  //  "+getAño()+"\n"
                + "FORMATO: MES DIA, AÑO ->    "+getMes_String()+" "+getDia()+", "+getAño()+"\n"
                + "FORMATO: MES AÑO ->    "+getMes_String()+" "+getAño()+"\n";
    }
    
}
