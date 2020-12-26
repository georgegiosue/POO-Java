/*
Crear una clase ListaAlumnos. De cada alumno se conoce su código, apellidos,
nombres y la lista de los cursos matriculados que lleva. De cada curso 
matriculado se conoce el nombre del curso, número de créditos y promedio final.
Hacer un programa con un menú que permita:.


a. Ingresar un alumno dado.
b. Agregar un curso determinado a un alumno.
c. Reportar la relación de alumnos con sus respectivos cursos.
d. Dado un código de alumno reportar su relación de cursos y el total de 
   créditos que lleva.
 */
package run;
import entidades.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GEORGE NAMOC
 */
public class RunApp {
    private static ListaAlumnos listaAlumnos=new ListaAlumnos();
    private static ListaAlumnos alumno;
    
    public static int menu(){
        int opc;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t     Menu\n"
                    + "1. Regitrar Alumno.\n"
                    + "2. Reportar la relación de alumnos con sus respectivos cursos.\n"
                    + "3. Buscar Alumno por codigo\n"
                    + "4. Salir\n"
                    + "             Seleccione una opcion"));
        }while(opc<1 || opc>3);
        return opc;
    }
    
    public static void ingresoDatosAlumno(ListaAlumnos alumno){
        alumno.setApellidos(JOptionPane.showInputDialog(null,"Ingrese los apellidos","REGISTRO DE ALUMNO",JOptionPane.QUESTION_MESSAGE));
        alumno.setNombres(JOptionPane.showInputDialog(null,"Ingrese los nombres","REGISTRO DE ALUMNO",JOptionPane.QUESTION_MESSAGE));
        alumno.setCodigo(JOptionPane.showInputDialog(null,"Digite el codigo","REGISTRO DE ALUMNO",JOptionPane.QUESTION_MESSAGE));
    }
    
    public static void registroCursos(ListaAlumnos alumno){
        int cantidadCursos=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de cursos a registrar","REGISTRO DE CURSOS",JOptionPane.INFORMATION_MESSAGE));
        
        for(int i=0;i<cantidadCursos;i++){
            JOptionPane.showMessageDialog(null,"CURSO N° "+(i+1));
            Cursos curso=new Cursos();
            alumno.setCursoToAlumno(curso);
            ingresoDatosCursos(alumno.getListaCursos()[i]);
            JOptionPane.showMessageDialog(null,"REGISTRO EXITOSO","REGISTRO CURSO",JOptionPane.INFORMATION_MESSAGE); 
        } 
    }
    public static String printReporteAlumnos(){
        String reporte="\t\t           REPORTE DE ALUMNOS\n";
        for (int i=0;i<=listaAlumnos.getPosicionAlumno();i++){
            reporte+=listaAlumnos.getListaAlumnos()[i].toString()+"\n";
        }
        return reporte;
    }
    
    public static void ingresoDatosCursos(Cursos curso){
        
        curso.setNombreCurso(JOptionPane.showInputDialog(null,"Ingrese el nombre del curso","REGISTRO DE CURSO",JOptionPane.QUESTION_MESSAGE));
        curso.setCreditos(JOptionPane.showInputDialog(null,"Ingrese los creditos del curso","REGISTRO CURSO",JOptionPane.QUESTION_MESSAGE));
        curso.setPromedioFinal(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el promedio final","REGISTRO CURSO",JOptionPane.QUESTION_MESSAGE)));
    }
    
    public static void main(String[] args) {
        int opc_;
        
        do{
            int opc=menu();
            opc_=opc;
            switch(opc_){
                case 1 -> {
                    alumno=new ListaAlumnos();
                    ingresoDatosAlumno(alumno);
                    listaAlumnos.setAlumoToLista(alumno);
                    JOptionPane.showMessageDialog(null,"Registrar Cursos del alumno","REGISTRO DE CURSOS",JOptionPane.INFORMATION_MESSAGE);
                    registroCursos(alumno);
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null,printReporteAlumnos(),"RELACION DE ALUMNOS",JOptionPane.INFORMATION_MESSAGE);
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null,listaAlumnos.getListaAlumnos()[listaAlumnos.searchCodigoInArray(JOptionPane.showInputDialog(null,"Digite el codigo del alumno a buscar","BUSQUEDA DE ALUMNO",JOptionPane.QUESTION_MESSAGE))].toString());
                }
            }
            
            
        }while(opc_!=4);
    }
    
    
    
}
