package Tareas;

/*
 * Minimo y maximo entero.
 */

/**
 *
 * @author luisr
 */

import javax.swing.*;

public class MinMaxEntero {
    static final int TAM = 20;
    static int numeros[] = new int[TAM];
    static int n;
    
    public static void ingresarDatos() {
        int valor;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número: \nPara terminar ingrese un valor <0",
                    "Ingreso de datos", 3));
            if(valor >=0){
                numeros[n] = valor;
                n = n+1;
            }        
        }while(valor >= 0);
    }
    
    public static int maximoValor() {
        int mayor = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }
    
    public static int minimoValor() {
        int menor = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }
    
    public static float promedio() {
        int suma = 0;
        float promedio;
        for(int i=0; i<n; i++) {
            suma = suma + numeros[i];
        }
        promedio = (float)suma / n;
        return promedio;
    }
    
    public static void listarDatos() {
        String mensaje = "Los datos ingresados son: \n";
        for(int i=0; i<n; i++) {
            mensaje = mensaje + numeros[i] + "\n";
        }
        mensaje = mensaje + "\nMínimo valor: " + minimoValor();
        mensaje = mensaje + "\nMáximo valor: " + maximoValor();
        mensaje = mensaje + "\nPromedio: " + promedio();
        JOptionPane.showMessageDialog(null, mensaje,  "Resultados", 1);
    }
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hallar el mínimo, máximo y el promedio \nde un conjunto de números enteros",
                "Ejercicio 1", 1);
        n = 0;
        ingresarDatos();
        listarDatos();
    }
}