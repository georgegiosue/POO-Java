/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.ArrayList;
import java.util.Iterator;

public class Poligono extends Figura{
    
    // Se ah considerado Poligono Regular
    
    private float apotema;
    private float anguloCentral;
    private ArrayList<Linea> lados;

    public Poligono() {
        super();
        this.apotema=0f;
        this.anguloCentral=0f;
        lados=new ArrayList<>();
    }

    public Poligono(int numeroLados, Linea lado,Punto coordenadas, String color, String nombre) {
        super(coordenadas, color, nombre);
        lados=new ArrayList<>(numeroLados); //OJO
        for(int i=0;i<lados.size();i++){
            lados.add(lado);
        }
        //Iterator<Linea> lados_=lados.iterator(); 
        anguloCentral=360/numeroLados;
        this.apotema=(float)((lados.get(0).getTamaño())/(2)*(Math.tan(anguloCentral/2)));
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public float getAnguloCentral() {
        return anguloCentral;
    }

    public void setAnguloCentral(float anguloCentral) {
        this.anguloCentral = anguloCentral;
    }

    public ArrayList<Linea> getLados() {
        return lados;
    }

    public void setLados(ArrayList<Linea> lados) {
        this.lados = lados;
    }
    
    @Override
    public float calcularArea() {
        return (apotema*calcularPerimetro())/2;
    }

    @Override
    public boolean cambiarTamaño(float factorEscala) {
        if(factorEscala>0){
            Iterator<Linea> i= lados.iterator();
            while(i.hasNext()){
                i.next().setTamaño(i.next().getTamaño()*factorEscala);
            }
            return true;
        }
        return false;
    }

    @Override
    public float calcularPerimetro() {
        float perimetro=0f;
        Iterator<Linea> i=lados.iterator();
        while(i.hasNext()){
            perimetro+=i.next().getTamaño();
        }
        return perimetro;
    }
    
    @Override
    public String toString(){
        return super.toString()
                +"Numero de lados: "+getLados().size()
                +"\nAngulo central: "+getAnguloCentral()
                +"\nApotema: "+getApotema()
                +"\nPerimetro: "+calcularPerimetro()
                +"\nArea: "+calcularArea()+"\n";
    }
}
