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
public class Cursos {
    private String nombreCurso,creditos;
    private float promedioFinal;

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombre) {
        this.nombreCurso = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public float getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(float promedioFinal) {
        this.promedioFinal = promedioFinal;
    }
    
    @Override
    
    public String toString(){
        return "Nombre del curso: "+getNombreCurso()+"\n"
                + "Numero de creditos: "+getCreditos()+"\n"
                + "Promedio final: "+getPromedioFinal()+"\n";
    }
    
}
