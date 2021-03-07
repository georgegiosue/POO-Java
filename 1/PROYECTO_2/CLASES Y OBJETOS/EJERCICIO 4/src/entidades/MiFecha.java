/*
Crear una clase MiFecha con las siguientes características:
a. Exhibir la fecha en múltiples formatos, como:
 MM/DD/AA
 DD/MM/AA
 Octubre 13, 2005
 Octubre 2005
b. Utilice constructores sobrecargados para crear 
objetos MiFecha inicializados con fechas en los formatos del punto a.
 */
package entidades;

/**
 *
 * @author GEORGE NAMOC
 */
public class MiFecha {
    private int dia;
    private int mes;String mes_;
    private int año;
    
    public MiFecha(){
        
    }
    
    public MiFecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    
    public MiFecha(String mes_, int dia, int año ){
        this.mes_=mes_;
        this.dia=dia;
        this.año=año;
    }
    
    public MiFecha(String mes_, int año){
        this.mes_=mes_;
        this.año=año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMes_() {
        return mes_;
    }

    public int getAño() {
        return año;
    }
    
    
    
}
