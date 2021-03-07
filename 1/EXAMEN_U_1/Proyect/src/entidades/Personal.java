
package entidades;

/**
 *
 * @author GEORGE NAMOC
 */
public class Personal {
    private String numeroDNIPersonal;
    private String apellidosPersonal;
    private String nombresPersonal;
    private int anioNacimientoPersonal;
    private int anioDeIngresoPersonal;
    private float sueldoBasicoPersonal;
    private float porcentajeAdicionalPersonal;
    private static int ANIO_ACTUAL=2020;
    private Ventas listaVentas[]=new Ventas[TAM];
    private int posicionListaVentas=-1;

    public int getPosicionListaVentas() {
        return posicionListaVentas;
    }
    
    
    public static final int TAM=112;
    private int posicionListaPersonal=-1;
    
    private Personal listaDePersonal[]=new Personal[TAM];

    public Ventas[] getListaVentas() {
        return listaVentas;
    }

    public void setVentaToPersonal(Ventas venta){
        posicionListaVentas++;
        getListaVentas()[posicionListaVentas]=venta;
    }
    
    
    public String getNumeroDNIPersonal() {
        return numeroDNIPersonal;
    }

    public void setNumeroDNIPersonal(String numeroDNIPersonal) {
        this.numeroDNIPersonal = numeroDNIPersonal;
    }

    public String getApellidosPersonal() {
        return apellidosPersonal;
    }

    public void setApellidosPersonal(String apellidosPersonal) {
        this.apellidosPersonal = apellidosPersonal;
    }

    public String getNombresPersonal() {
        return nombresPersonal;
    }

    public void setNombresPersonal(String nombresPersonal) {
        this.nombresPersonal = nombresPersonal;
    }

    public int getAnioNacimientoPersonal() {
        return anioNacimientoPersonal;
    }

    public void setAnioNacimientoPersonal(int anioNacimientoPersonal) {
        this.anioNacimientoPersonal = anioNacimientoPersonal;
    }

    public int getAnioDeIngresoPersonal() {
        return anioDeIngresoPersonal;
    }

    public void setAnioDeIngresoPersonal(int anioDeIngresoPersonal) {
        this.anioDeIngresoPersonal = anioDeIngresoPersonal;
        int tiempoLaborado=ANIO_ACTUAL-anioDeIngresoPersonal;
        float sueldo=getSueldoBasicoPersonal();
        if(tiempoLaborado<=3){
            setPorcentajeAdicionalPersonal(0.05f*sueldo);
            
        }
        if(tiempoLaborado>=4 && tiempoLaborado<=7){
            setPorcentajeAdicionalPersonal(0.10f*sueldo);
            
        }
        if(tiempoLaborado>=8 && tiempoLaborado<=15){
            setPorcentajeAdicionalPersonal(0.15f*sueldo);
            
        }
        if(tiempoLaborado>15){
            setPorcentajeAdicionalPersonal(0.20f*sueldo);
            
        }
        
        
    }

    public float getSueldoBasicoPersonal() {
        return sueldoBasicoPersonal;
    }

    public void setSueldoBasicoPersonal(float sueldoBasicoPersonal) {
        this.sueldoBasicoPersonal = sueldoBasicoPersonal;
    }

    public float getPorcentajeAdicionalPersonal() {
        return porcentajeAdicionalPersonal;
    }

    public void setPorcentajeAdicionalPersonal(float porcentajeAdicionalPersonal) {
        this.porcentajeAdicionalPersonal = porcentajeAdicionalPersonal;
    }
    
    public int getPosicionListaPersonal() {
        return posicionListaPersonal;
    }

    public void setPosicionListaPersonal(int posicionListaPersonal) {
        this.posicionListaPersonal = posicionListaPersonal;
    }

    public Personal[] getListaDePersonal() {
        return listaDePersonal;
    }

    public void setListaDePersonal(Personal[] listaDePersonal) {
        this.listaDePersonal = listaDePersonal;
    }
    
    public void setPersonalToList(Personal personal){
        posicionListaPersonal++;
        getListaDePersonal()[posicionListaPersonal]=personal;
    }
    
    public String printListPersonal(){
        String listaPrint="       \t LISTA DE PERSONAL DE LA EMPRESA\n";
        for(int i=0;i<=getPosicionListaPersonal();i++){
            listaPrint+=getListaDePersonal()[i].toString()+"\n";
        }
        
        return listaPrint;
    }
    
    public int searchDNIinArray(String dniSearchPersonal){
        
        int rpt=-1;
        for(int i=0;i<=getPosicionListaPersonal();i++){
            if(getListaDePersonal()[i].getNumeroDNIPersonal().compareToIgnoreCase(dniSearchPersonal)==0){
                rpt=i;
            }
        }
        // Devuelve la posicion del alumno en el arreglo
        return rpt;
    }
    
    public String printVentas(){
        String print="          \t                       LISTA DE VENTAS\n";
        for(int i=0;i<=getPosicionListaVentas();i++){
            print+=getListaVentas()[i].toString()+"\n";
        }
        
        return print;
    }
    
    public String printDNIAscendentePersonal(){
        String mensaje="\nLista de Personal en orden Ascendente por numero de DNI\n";Personal dni_aux;
        for(int i=0;i<=getPosicionListaPersonal();i++){
            for(int j=0;j<getPosicionListaPersonal()&&i!=j;j++){
                if(getListaDePersonal()[i].getNumeroDNIPersonal().compareToIgnoreCase(getListaDePersonal()[j].getNumeroDNIPersonal())<0){
                    dni_aux=getListaDePersonal()[i];
                    getListaDePersonal()[i]=getListaDePersonal()[j];
                    getListaDePersonal()[j]=dni_aux;
                }
            }
        }
        for(int i=0;i<=getPosicionListaPersonal();i++){
            mensaje+=(i+1)+". "+getListaDePersonal()[i].toString()+"\n";
        }
        return mensaje;
    }
    
    @Override
    public String toString(){
        return "Apellidos del Personal: "+getApellidosPersonal()+"\n"
                + "Nombres del Personal: "+getNombresPersonal()+"\n"
                + "DNI: "+getNumeroDNIPersonal()+"\n"
                + "Año de Nacimiento: "+getAnioNacimientoPersonal()+"\n"
                + "Año de Ingreso: "+getAnioDeIngresoPersonal()+"\n"
                + "Sueldo Basico: S/."+getSueldoBasicoPersonal()+"\n"
                + "Porcentaje Adicional al Sueldo Basico por el tiempo laborado durante "+(ANIO_ACTUAL-getAnioDeIngresoPersonal())+" años \n"
                + " S/. "+getPorcentajeAdicionalPersonal()+"\n"
                + "\n"+printVentas()+"\n";
    }
    
    
    
}
