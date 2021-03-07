/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Cuadrado extends Rectangulo{
    
    public Cuadrado() {
        super();
    }
    
    public Cuadrado(Linea lado,Punto coordenadas, String color, String nombre){
        super(lado, lado, coordenadas, color, nombre);   
        getLadoMenor().setAnguloRespectoAlEjeX(90f);
    }
    
    @Override
   public String toString(){
       return super.toString();
   }
    
}
