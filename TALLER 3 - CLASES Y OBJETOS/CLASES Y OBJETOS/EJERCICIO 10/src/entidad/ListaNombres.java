/*
De manera similar al problema anterior, genere una clase ListaNombres,
la cual tenga como atributo un arreglo que puede contener hasta 20 nombres.
En la clase se deben implementar los siguientes métodos:


a. Agregar un nombre.
b. Eliminar un nombre, si ingresa su posición.
c. Obtener un nombre dada su posición.
d. Dado un nombre cualquiera, verificar si se encuentra en el arreglo.
e. Insertar un nombre dada su posición.
f. Listar los nombres ordenados en forma ascendente.
 */
package entidad;

/**
 *
 * @author GEORGE NAMOC
 */
public class ListaNombres {
    public static final int TAM=20;
    private String nombre;
    private int posicion=-1;
    private ListaNombres listaN[]=new ListaNombres[TAM];
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaNombres[] getListaN() {
        return listaN;
    }
    
    public void setNombreToArray(ListaNombres nombre){
        posicion++;
        this.listaN[posicion]=nombre;
    }

    public int getPosicion() {
        return posicion;
    }
    
    public ListaNombres getNombreOfArray_posicion(int posicion){
        return getListaN()[posicion];
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public void deleteNombreOfArray_posicion(int posicion){
        for(int i=posicion;i<getPosicion();i++){
            getListaN()[i]=getListaN()[i+1];
        }
        setPosicion(getPosicion()-1);
    }
    
    public int searchNombreInArray(String nombre){
        int rpt=-1;
        for(int i=0;i<=getPosicion();i++){
            if(getListaN()[i].getNombre().compareToIgnoreCase(nombre)==0){
                rpt=i;
            }
        }
        return rpt;
    }
    
    public void insertNombreInArray_posicion(int posicion, ListaNombres nombre){
        setPosicion(getPosicion()+1);
        for(int i=posicion;i<=getPosicion();i++){
            getListaN()[i+1]=getListaN()[i];
        }
        getListaN()[posicion]=nombre;
    }
    public String printNombresAscendente(){
        String mensaje="\nLista de Nombres en orden Ascendente\n";ListaNombres nombre_aux;
        for(int i=0;i<=getPosicion();i++){
            for(int j=0;j<getPosicion()&&i!=j;j++){
                if(getListaN()[i].getNombre().compareToIgnoreCase(getListaN()[j].getNombre())<0){
                    nombre_aux=getListaN()[i];
                    getListaN()[i]=getListaN()[j];
                    getListaN()[j]=nombre_aux;
                }
            }
        }
        for(int i=0;i<=getPosicion();i++){
            mensaje+=(i+1)+". "+getListaN()[i].toString();
        }
        return mensaje;
    }
    
    public String printLista(){
        String mensaje="\t      Lista de nombres\n\n";
        for(int i=0;i<=getPosicion();i++){
            mensaje+=(i+1)+". "+this.listaN[i].toString()+"\n";
        }
        return mensaje;
    }
    
    @Override
    public String toString(){
        return " Nombre: "+getNombre()+"\n";
    }
            
}
