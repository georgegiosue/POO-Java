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
public interface Impuesto {
    
    public float UIT = 3.600f;
    public float zonaRural = UIT*0.05f;
    public float zonaUrbana = UIT*0.08f;
    
    public float impuestoPagar(float m2Construido);
    
}
