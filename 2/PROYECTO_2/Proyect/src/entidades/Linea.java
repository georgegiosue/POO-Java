/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Linea {
        private float tamaño;
        private float anguloRespectoAlEjeX; // Grados Sexagesimales

        public Linea() {
            tamaño=0f;
            anguloRespectoAlEjeX=0f;
        }

        public Linea(float tamaño, float anguloRespectoAlEjeX) {
            this.tamaño = tamaño;
            this.anguloRespectoAlEjeX = anguloRespectoAlEjeX;
        }

        public float getTamaño() {
            return tamaño;
        }

        public void setTamaño(float tamaño) {
            this.tamaño = tamaño;
        }

        public float getAnguloRespectoAlEjeX() {
            return anguloRespectoAlEjeX;
        }

        public void setAnguloRespectoAlEjeX(float anguloRespectoAlEjeX) {
            this.anguloRespectoAlEjeX = anguloRespectoAlEjeX;
        }

        @Override
        public String toString(){
            return "Tamaño: "+getTamaño()+"\n"
                    +"Angulo Respecto al Eje X: "+getAnguloRespectoAlEjeX()+"°\n";
        }
    }
    
