/*
Crear una clase ListaAlumnos. De cada alumno se conoce su código, apellidos,
nombres y la lista de los cursos matriculados que lleva. De cada curso 
matriculado se conoce el nombre del curso, número de créditos y promedio final.
Hacer un programa con un menú que permita:.


a. Ingresar un alumno dado.
b. Agregar un curso determinado a un alumno.
c. Reportar la relación de alumnos con sus respectivos cursos.
d. Dado un código de alumno reportar su relación de cursos y el total de créditos que lleva.
 */
package entidades;

/**
 *
 * @author GEORGE NAMOC
 */
public class ListaAlumnos {
    private String codigo,nombres,apellidos;
    
    public static final int TAM=16;
    
    private Cursos listaCursos[] = new Cursos[TAM];
    
    private ListaAlumnos listaAlumnos[] = new ListaAlumnos[TAM];
    
    
    private int posicionAlumno=-1;
    private int posicionCurso=-1;

    public int getPosicionAlumno() {
        return posicionAlumno;
    }

    public int getPosicionCurso() {
        return posicionCurso;
    }
    
    public void setCursoToAlumno(Cursos curso){
        posicionCurso++;
        listaCursos[posicionCurso]=curso;
    }
    
    public void setAlumoToLista(ListaAlumnos alumno){
        posicionAlumno++;
        getListaAlumnos()[posicionAlumno]=alumno;
    }

    public ListaAlumnos[] getListaAlumnos() {
        return listaAlumnos;
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Cursos[] getListaCursos() {
        return listaCursos;
    }

//    public void setListaCursos(Cursos[] listaCursos) {
//        this.listaCursos = listaCursos;
//    }
    
    
    public String printCursos(){
        String cursos="\n      Lista de Cursos       \n";
        
        for(int i=0;i<=getPosicionCurso();i++){
            cursos+=getListaCursos()[i].toString()+"\n";
        }
        return cursos;
    }
    
    public int searchCodigoInArray(String codigo){
        int rpt=-1;
        for(int i=0;i<=getPosicionAlumno();i++){
            if(getListaAlumnos()[i].getCodigo().compareToIgnoreCase(codigo)==0){
                rpt=i;
            }
        }
        // Devuelve la posicion del alumno en el arreglo
        return rpt;
    }
    
    
    @Override
    public String toString(){
        return "Nombre del alumno: "+getNombres()+"\n"
                + "Apellidos del alumno: "+getApellidos()+"\n"
                +printCursos()+"\n";
    }
    
    
}
