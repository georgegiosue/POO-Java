/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Punto {
    private float coordenada_X;
    private float coordenada_Y;

    public Punto() {
        coordenada_X=0;
        coordenada_Y=0;
    }

    public Punto(float coordenada_X, float coordenada_Y) {
        this.coordenada_X = coordenada_X;
        this.coordenada_Y = coordenada_Y;
    }

    public float getCoordenada_X() {
        return coordenada_X;
    }

    public void setCoordenada_X(float coordenada_X) {
        this.coordenada_X = coordenada_X;
    }

    public float getCoordenada_Y() {
        return coordenada_Y;
    }

    public void setCoordenada_Y(float coordenada_Y) {
        this.coordenada_Y = coordenada_Y;
    }
    
    @Override
    public String toString(){
        return "Coordenada en X: "+getCoordenada_X()
          + "\n Coordenada en Y: "+getCoordenada_Y()+"\n";
    }
    
}
