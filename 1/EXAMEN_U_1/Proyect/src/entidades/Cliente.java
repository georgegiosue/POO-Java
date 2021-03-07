
package entidades;

/**
 *
 * @author GEORGE
 */
public class Cliente {
    private int anioRegistroCliente;
    private String numeroDNICliente;
    private String apellidosCliente;
    private String nombresCliente;
    private String direccionCliente;
    private String telefonoCliente;
    
    public static final int TAM=112;
    private int posicionListaCliente=-1;
    
    private Cliente listaClientes[]=new Cliente[TAM];

    public int getAnioRegistroCliente() {
        return anioRegistroCliente;
    }

    public void setAnioRegistroCliente(int anioRegistroCliente) {
        this.anioRegistroCliente = anioRegistroCliente;
    }

    public String getNumeroDNICliente() {
        return numeroDNICliente;
    }

    public void setNumeroDNICliente(String numeroDNICliente) {
        this.numeroDNICliente = numeroDNICliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public int getPosicionListaCliente() {
        return posicionListaCliente;
    }

    public void setPosicionListaCliente(int posicionListaCliente) {
        this.posicionListaCliente = posicionListaCliente;
    }

    public Cliente[] getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Cliente[] listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    
    public void setClienteToList(Cliente cliente){
        posicionListaCliente++;
        getListaClientes()[posicionListaCliente]=cliente;
    }
    
    public String printListClients(){
        String listaPrint="        \t LISTA DE CLIENTES DE LA EMPRESA\n";
        for(int i=0;i<=getPosicionListaCliente();i++){
            listaPrint+=getListaClientes()[i].toString()+"\n";
        }
        return listaPrint;
    }
    
    public String printApellidosDescendienteClientes(){
        String mensaje="\nLista de Nombres en orden Descendiente de los clientes\n";Cliente apellido_aux;
        for(int i=0;i<=getPosicionListaCliente();i++){
            for(int j=0;j<getPosicionListaCliente()&&i!=j;j++){
                if(getListaClientes()[i].getApellidosCliente().compareToIgnoreCase(getListaClientes()[j].getApellidosCliente())>0){
                    apellido_aux=getListaClientes()[i];
                    getListaClientes()[i]=getListaClientes()[j];
                    getListaClientes()[j]=apellido_aux;
                }
            }
        }
        for(int i=0;i<=getPosicionListaCliente();i++){
            mensaje+=(i+1)+". "+getListaClientes()[i].toString()+"\n";
        }
        return mensaje;
    }
    
    @Override
    public String toString(){
        return "Apellidos del Cliente: "+getApellidosCliente()+"\n"
                + "Nombres del Cliente: "+getNombresCliente()+"\n"
                + "DNI: "+getNumeroDNICliente()+"\n"
                + "Año de Registro: "+getAnioRegistroCliente()+"\n"
                + "Direccion: "+getDireccionCliente()+"\n"
                + "Telefono: "+getTelefonoCliente()+"\n";
    }
    
    
    
}
