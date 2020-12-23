/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author luisr
 */
public class Rectangulo {
    private float longitud;
    private float ancho;

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    public float getPerimetro() {
        return (2*getAncho() + 2*getLongitud());
    }
    
    public float getArea() {
        return getAncho()*getLongitud();
    }
    
    @Override 
    public String toString() {
        return "";
//        return "\nLongit \" + getPerimetro()+ \"\\nArea: \" + getArea();ud: " + getLongitud()+ "\nAncho: " + getAncho()+
//                "\nPerimetro: " + getPerimetro()+ "\nArea: " + getArea();
    }
}
