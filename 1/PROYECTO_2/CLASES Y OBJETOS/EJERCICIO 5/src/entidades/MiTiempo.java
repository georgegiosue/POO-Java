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
public class MiTiempo {
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public float getIncrementarSegundo() {
        return getSegundo() +1;    
    }
    
    public float getIncrementarMinuto() {
        return getMinuto() +1;
    }
    
    public float getIncrementarHora() {
        return getHora() +1;
    }
    
    @Override
    public String toString() {
        return "";
//            "Horas: " + getHora()+ "   Minutos: " + getMinuto()+
//            "   Segundos: " + getSegundo();
    }
}
