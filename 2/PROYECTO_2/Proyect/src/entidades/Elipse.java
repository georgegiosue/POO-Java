/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Elipse extends Figura{

    private float radioMayor,radioMenor;

    public Elipse() {
        super();
        this.radioMayor=0f;
        this.radioMenor=0f;
    }

    public Elipse(float radioMayor, float radioMenor, Punto coordenadas, String color, String nombre) {
        super(coordenadas, color, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public float getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(float radioMayor) {
        this.radioMayor = radioMayor;
    }

    public float getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(float radioMenor) {
        this.radioMenor = radioMenor;
    }
    
    @Override
    public float calcularArea() {
       return  (float) (getRadioMenor()*getRadioMayor()*Math.PI);
    }

    @Override
    public float calcularPerimetro() {
       return (float) (2*Math.PI*Math.sqrt((Math.pow(radioMayor,2))+(Math.pow(radioMenor,2))/2));
    }

    @Override
    public boolean cambiarTamaño(float factorEscala) {
        if(factorEscala>0.0f){
            setRadioMayor(getRadioMayor()*factorEscala);
            setRadioMenor(getRadioMenor()*factorEscala);
            return true;
        }
        return false;
    }
    
    public String toString(){
        return super.toString();
    }
}
