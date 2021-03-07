/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
/**

 */
public class Doc_Identidad {
    
    //Tipos de Documento de Identidad
    private final String tipos_doc[] = {"Carnet de Extranjeria","DNI","Pasaporte","RUC"};
    //
    
    private String doc;
    private String numero;

    public Doc_Identidad() {
        this.numero = "NN";
        this.doc="NN";
    }
    
    public Doc_Identidad(String numero,byte doc) {
        this.numero = numero;
        this.doc=(doc>=0 && doc<tipos_doc.length)?tipos_doc[doc]:"NN";
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        return "      Documento de Identidad"
                +"\nTipo deDocumento: "+getDoc()
                +"\nNumero: "+getNumero()+"\n";
    }
    
}
