/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

public class Triangulo extends Figura{

    protected Linea lado1,lado2,lado3;
    private float angulo_alfa,angulo_beta,angulo_gamma;

    public Triangulo() {
        super();
        lado1=new Linea();
        lado2=new Linea();
        lado3=new Linea();
    }

    public Triangulo(float lado1, float lado2, float angulo_respecto_X,Punto coordenadas, String color, String nombre) {
        super(coordenadas, color, nombre);
        this.lado1=new Linea(lado1,0f);
        this.lado2 =new Linea(lado2,angulo_respecto_X);
    }

    public Triangulo(float lado1_, float lado2_,Punto coordenadas, String color, String nombre) {   // CAMBIO EN EL PARAMETROS DE PUNTO
        super(coordenadas, color, nombre);   
        final float maxAng=180.0f;
        
        this.lado1 = new Linea(lado1_, 0f);
        
         // Angulo Alfa = Angulo entre el lado 1 y lado 2.
         // Amgulo Beta = Angulo entre el lado 2 y lado 3.
         // Angulo Gamma = Angulo entre el lado 1 y lado 3.
         
        do{
            angulo_alfa=(float)((Math.random()*maxAng)+1); //genera un angulo aleatoria para el lado 1 con respecto al eje X.
                                                           // se ha considerado un angulo entre 1° y 179°
        }while(angulo_alfa==180);
        this.lado2 = new Linea(lado2_,angulo_alfa);

        float cateto1=(float) (Math.pow(lado1_,2));
        float cateto2=(float) (Math.pow(lado2_,2));
        float doblecatetoXcateto=(float)((2*lado1_*lado2_)*(Math.cos(Math.toRadians(angulo_alfa))));
        float lado3_=(float)(Math.sqrt((cateto1-doblecatetoXcateto+cateto2))); // Ley de cosenos
        float a=(float)(-0.5*Math.pow(lado1_,2));
        float b=(float)(0.5*Math.pow(lado2_,2));
        float c=(float)(0.5*Math.pow(lado3_,2));
        float aux= ((a+b+c)/(lado2_*lado3_)); //cambio
        angulo_beta=(float)((Math.toDegrees((Math.acos(aux))))+11.31);
        angulo_gamma=180-(angulo_alfa+angulo_beta);
        this.lado3=new Linea(lado3_,180-angulo_gamma);
    }

    public Linea getLado1() {
        return lado1;
    }

    public void setLado1(Linea lado1) {
        this.lado1 = lado1;
    }

    public Linea getLado2() {
        return lado2;
    }

    public void setLado2(Linea lado2) {
        this.lado2 = lado2;
    }

    public Linea getLado3() {
        return lado3;
    }

    public void setLado3(Linea lado3) {
        this.lado3 = lado3;
    }

    public float getAngulo_alfa() {
        return angulo_alfa;
    }

    public void setAngulo_alfa(float angulo_alfa) {
        this.angulo_alfa = angulo_alfa;
    }

    public float getAngulo_beta() {
        return angulo_beta;
    }

    public void setAngulo_beta(float angulo_beta) {
        this.angulo_beta = angulo_beta;
    }

    public float getAngulo_gamma() {
        return angulo_gamma;
    }

    public void setAngulo_gamma(float angulo_gamma) {
        this.angulo_gamma = angulo_gamma;
    }
    
    @Override
    public float calcularArea() {
        float semiperimetro=(lado1.getTamaño()+lado2.getTamaño()+lado3.getTamaño())/2;
       return (float)Math.sqrt(semiperimetro*(semiperimetro-lado1.getTamaño())*(semiperimetro-lado2.getTamaño())*(semiperimetro-lado3.getTamaño())); // Formula de Heron.
    }

    @Override
    public float calcularPerimetro() {
        return lado1.getTamaño()+lado2.getTamaño()+lado3.getTamaño();
    }

    @Override
    public boolean cambiarTamaño(float factorEscala) {
        if(factorEscala>0){
            lado1.setTamaño(lado1.getTamaño()*factorEscala);
            lado2.setTamaño(lado2.getTamaño()*factorEscala);
            lado3.setTamaño(lado3.getTamaño()*factorEscala);
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return super.toString()
               +"Lado 1: "+getLado1().toString()
               +"\nLado 2: "+getLado2().toString()
               +"\nLado 3: "+getLado3().toString()
               +"\n           Angulos Internos\n"
               + "\nAngulo Alfa [Lado 1 y Lado 2]: "+getAngulo_alfa()
               +"\nAngulo Beta [Lado 2 y Lado 3]: "+getAngulo_beta()
               +"\nAngulo Gamma [Lado 1 y Lado 3]: "+getAngulo_gamma()+"\n";
               
    }
}
