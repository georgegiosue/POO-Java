/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Circulo extends Elipse{
    
    private float radio;
    
    public Circulo(){
        super();   
    }

    public Circulo(float radio, Punto coordenadas, String color, String nombre) {
        super(radio, radio, coordenadas, color, nombre);
        this.radio=radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    public float calcularArea() {
       return  (float) (Math.PI*(Math.pow(getRadioMayor(),2)));
    }

    @Override
    public float calcularPerimetro() {
       return (float) (2*Math.PI*getRadioMayor());
    }

    @Override
    public boolean cambiarTamaño(float factorEscala) {
        if(factorEscala>0.0f){
            setRadioMayor(getRadioMayor()*factorEscala);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return super.toString()
               +"Radio: "+getRadio();
    }
    
}
