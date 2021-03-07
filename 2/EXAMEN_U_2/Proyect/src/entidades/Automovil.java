/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author GEORGE
 */
public class Automovil {
    private String matricula,marca,modelo;
    
    public Automovil(){
        this.matricula="NA";
        this.marca="NA";
        this.modelo="NA";
    }

    public Automovil(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String toString(){
        return "Matricula: "+getMatricula()+"\n"
                + "Marca: "+getMarca()+"\n"
                + "Modelo: "+getModelo()+"\n";
    }
}
