/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class TrianguloRectangulo extends Triangulo{
    
    public TrianguloRectangulo(){
        super();
    }

    public TrianguloRectangulo(float lado1_, float lado2_,Punto coordenadas, String color, String nombre) {
        super(lado1_,lado2_,coordenadas,color,nombre);
        lado1=new Linea(lado1_,0f);
        lado2=new Linea(lado2_,90f);
    }
    
    public float calcularHipotenusa(){
        this.lado3.setTamaño((float)Math.sqrt((Math.pow(lado1.getTamaño(), 2))+(Math.pow(lado2.getTamaño(), 2))));
        return lado3.getTamaño();
    }
    
     @Override
    public float calcularArea() {
       return (getLado1().getTamaño()*getLado2().getTamaño())/2;
    }

    @Override
    public float calcularPerimetro() {
        return getLado1().getTamaño()+getLado2().getTamaño()+getLado3().getTamaño();
    }

    @Override
    public boolean cambiarTamaño(float factorEscala) {
        if(factorEscala>0){
            getLado1().setTamaño(getLado1().getTamaño()*factorEscala);
            getLado2().setTamaño(getLado2().getTamaño()*factorEscala);
            getLado3().setTamaño(getLado3().getTamaño()*factorEscala);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()
              +"\nColor: "+getColor()
              +"\nCoordenadas: "+getCoordenadas()
              +"\nLado 1: "+lado1.getTamaño()+"cm"
              +"\nLado 2: "+lado2.getTamaño()+"cm"
              +"\nHipotenusa: "+calcularHipotenusa();
    }
    
}
