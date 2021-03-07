/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public abstract class Figura {
    private Punto coordenadas;
    private String color,nombre;

    public Figura() {
        color="No definido";
        nombre="No definido";
        coordenadas.setCoordenada_X(0f);
        coordenadas.setCoordenada_Y(0f);
    }

    public Figura(Punto coordenadas, String color, String nombre) {
        this.coordenadas = coordenadas;
        this.color = color;
        this.nombre = nombre;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Punto getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Punto coordenadas) {
        this.coordenadas = coordenadas;
    }
    
    public void moverFigura(float coordenada_X, float coordenada_Y){
        coordenadas.setCoordenada_X(coordenada_X);
        coordenadas.setCoordenada_Y(coordenada_Y);
    }
    
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
    public abstract boolean cambiarTamaño(float factorEscala);

    @Override
    public String toString(){
        return "Nombre: "+getNombre()+"\n"
               +"Color: "+getColor()+"\n"
               +coordenadas.toString()+"\n";
    }

}
