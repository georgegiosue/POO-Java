/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Rectangulo extends Figura{
    private Linea ladoMenor,ladoMayor;

    public Rectangulo() {
        super();
        ladoMayor=new Linea();
        ladoMenor=new Linea();
    }

    public Rectangulo(Linea ladoMenor, Linea ladoMayor, Punto coordenadas, String color, String nombre) {
        super(coordenadas, color, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public Linea getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(Linea ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
    
    public void setLadoMenor(float ladoMenor){
        this.ladoMenor.setTamaño(ladoMenor);
    }
    
    public Linea getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(Linea ladoMayor) {
        this.ladoMayor = ladoMayor;
    }
    
    public void setLadoMayor(float ladoMayor){
        this.ladoMayor.setTamaño(ladoMayor);
    }
    
    @Override
    public float calcularArea(){
        return (ladoMayor.getTamaño())*(getLadoMenor().getTamaño());
    }

    @Override
    public float calcularPerimetro() {
        return (2*ladoMayor.getTamaño())+(2*getLadoMenor().getTamaño());
    }

    @Override
    public boolean cambiarTamaño(float factorEscala) {
        if(factorEscala>0.0f){
            ladoMayor.setTamaño((getLadoMayor().getTamaño())*factorEscala);
            ladoMenor.setTamaño((getLadoMenor().getTamaño())*factorEscala);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return super.toString()
               +"Lado Mayor: "+getLadoMayor().toString()+"\n"
               +"Lado Menor: "+getLadoMenor().toString()+"\n"
               +"Perimetro: "+calcularPerimetro()+"\n"
               +"Area: "+calcularArea()+"\n"; 
    }
    
}
