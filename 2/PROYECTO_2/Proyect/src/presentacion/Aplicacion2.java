
package presentacion;

import entidades.*;
import javax.swing.JOptionPane;
import java.util.*;

public class Aplicacion2 {
    
    private static ArrayList<Figura> figuras =new ArrayList<>();
    private static Figura figura;
    private static Iterator<Figura> iterador;
    public static  int menu(){
        int opcion;
        
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t          "
                    + "                                                        \tMENU\n\n\n"
                + "1. Guardar en un ArrayList referencias a objetos de cualquier tipo derivado de Figura.\n\n"
                + "2. Asignar el mismo color a todos los objetos.\n\n"
                + "3. Asignar un mismo color a los objetos de un tipo determinado \n"
                + "   (por ejemplo, el mismo color a todos los rectángulos).\n\n"
                + "4. Mover todos los objetos a una determinada posición.\n\n"
                + "5. Mover los objetos de un tipo determinado a una misma posición\n"
                + "   (por ejemplo, todas las elipses a la misma posición).\n\n"
                + "6. Listar los datos de todos los objetos contenidos en el ArrayList.\n\n"
                + "7. Calcular el área de todas las figuras, determinar cuál de las figuras\n"
                + "   tiene el área máxima e imprima la información de dicha figura.\n\n\n"
                + "\t\t                                                   Sleccione una opcion","MENU - APP FIGURAS",JOptionPane.INFORMATION_MESSAGE));
        if(opcion<1 || opcion>7)
            JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto\n"
            + "\t     Intentelo nuevamente","VALOR INCORRECTO",JOptionPane.WARNING_MESSAGE);
        } while(opcion<1 || opcion>7);
        return opcion;
    }
     
    public static boolean ciclo(){
        boolean respuesta=true;
        if(JOptionPane.showConfirmDialog(null,"¿Desea realizar otra operación?")!=JOptionPane.YES_OPTION)
        {   
            respuesta=false;
        }
        return respuesta;
    }
    
    public static void crearFiguras(byte opcion){
        String color,nombre;
        float coordenada_X,coordenada_Y;
        Punto coordenadas;
        switch (opcion) {
            case 1:
                    JOptionPane.showMessageDialog(null,"Creador de Rectangulos","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                    do{
                        float ladoMenor,ladoMayor;
                        
                        nombre="RECTANGULO";
                        color=JOptionPane.showInputDialog(null,"Ingrese el color","Creando Rectangulo...",JOptionPane.QUESTION_MESSAGE);
                        coordenada_X=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en X","REGISTRO DE COORDENADAS-Creando Rectangulo...",JOptionPane.QUESTION_MESSAGE));
                        coordenada_Y=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en Y","REGISTRO DE COORDENADAS-Creando Rectangulo...",JOptionPane.QUESTION_MESSAGE));
                        do{
                            ladoMenor=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el valor del lado menor en cm","Creando Rectangulo...",JOptionPane.QUESTION_MESSAGE));
                            if(ladoMenor<=0)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(ladoMenor<=0);
                        do{
                            ladoMayor=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el valor del lado mayor cm","Creando Rectangulo...",JOptionPane.QUESTION_MESSAGE));
                            if(ladoMayor<=ladoMenor)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(ladoMayor<=ladoMenor);
                        coordenadas= new Punto(coordenada_X, coordenada_Y);
                        Linea lado_menor=new Linea(ladoMenor,90f);
                        Linea lado_mayor=new Linea(ladoMayor,0f);
                        figura = new Rectangulo(lado_menor, lado_mayor, coordenadas, color, nombre);
                        figuras.add(figura);
                        JOptionPane.showMessageDialog(null,"Rectangulo creado con exito","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                    }while(ciclo());
                    JOptionPane.showMessageDialog(null,"Usted esta saliendo del creador de Rectangulos","SALIDA",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                    JOptionPane.showMessageDialog(null,"Creador de Cuadrados","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                    do{
                        float ladoC;
                        nombre="CUADRADO";
                        color=JOptionPane.showInputDialog(null,"Ingrese el color","Creando Cuadrado...",JOptionPane.QUESTION_MESSAGE);
                        coordenada_X=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en X","REGISTRO DE COORDENADAS-Creando Cuadrado...",JOptionPane.QUESTION_MESSAGE));
                        coordenada_Y=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en Y","REGISTRO DE COORDENADAS-Creando Cuadrado...",JOptionPane.QUESTION_MESSAGE));
                        do{
                            ladoC=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el valor del lado en cm","Creando Cuadrado...",JOptionPane.QUESTION_MESSAGE));
                            if(ladoC<=0)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(ladoC<=0);
                        coordenadas=new Punto(coordenada_X, coordenada_Y);
                        Linea lado=new Linea(ladoC,0);
                        figura = new Cuadrado(lado, coordenadas, color, nombre);
                        figuras.add(figura);
                        JOptionPane.showMessageDialog(null,"Cuadrado creado con exito","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                    }while(ciclo());
                    JOptionPane.showMessageDialog(null,"Usted esta saliendo del creador de Cuadrados","SALIDA",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                    JOptionPane.showMessageDialog(null,"Creador de Triangulos","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                    do{
                        float lado1,lado2;
                        nombre="TRIANGULO";
                        color=JOptionPane.showInputDialog(null,"Ingrese el color","Creando Triangulo...",JOptionPane.QUESTION_MESSAGE);
                        coordenada_X=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en X","REGISTRO DE COORDENADAS-Creando Triangulo...",JOptionPane.QUESTION_MESSAGE));
                        coordenada_Y=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en Y","REGISTRO DE COORDENADAS-Creando Triangulo...",JOptionPane.QUESTION_MESSAGE));
                        coordenadas=new Punto(coordenada_X, coordenada_Y);
                        do{
                            lado1=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el tamaño del lado 1","Creando Triangulo...",JOptionPane.QUESTION_MESSAGE));
                            if(lado1<=0)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(lado1<=0);
                        do{
                            lado2=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el tamaño del lado 2","Creando Triangulo...",JOptionPane.QUESTION_MESSAGE));
                            if(lado2<=0)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(lado2<=0);
                        figura = new Triangulo(lado1, lado2,coordenadas, color, nombre);
                        figuras.add(figura);
                        JOptionPane.showMessageDialog(null,"Triangulo creado con exito","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                    }while(ciclo());
                    JOptionPane.showMessageDialog(null,"Usted esta saliendo del creador de Triangulos","SALIDA",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                    JOptionPane.showMessageDialog(null,"Creador de Triangulos Rectangulos","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                    do{
                        float lado1,lado2;
                        nombre="TRIANGULO RECTANGULO";
                        color=JOptionPane.showInputDialog(null,"Ingrese el color","Creando Triangulo Rectangulo...",JOptionPane.QUESTION_MESSAGE);
                        coordenada_X=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en X","REGISTRO DE COORDENADAS-Creando Triangulo Rectangulo...",JOptionPane.QUESTION_MESSAGE));
                        coordenada_Y=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en Y","REGISTRO DE COORDENADAS-Creando Triangulo Rectangulo...",JOptionPane.QUESTION_MESSAGE));
                        coordenadas=new Punto(coordenada_X, coordenada_Y);
                        do{
                            lado1=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el tamaño del lado 1","Creando Triangulo Rectangulo...",JOptionPane.QUESTION_MESSAGE));
                            if(lado1<=0)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(lado1<=0);
                        do{
                            lado2=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el tamaño del lado 2","Creando Triangulo Rectangulo...",JOptionPane.QUESTION_MESSAGE));
                            if(lado2<=0)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(lado2<=0);
                        figura = new TrianguloRectangulo(lado1, lado2, coordenadas, color, nombre);
                        figuras.add(figura);
                        JOptionPane.showMessageDialog(null,"Triangulo Rectangulo creado con exito","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                    }while(ciclo());
                    JOptionPane.showMessageDialog(null,"Usted esta saliendo del creador de Triangulos Rectangulos","SALIDA",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                    JOptionPane.showMessageDialog(null,"Creador de Poligonos","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                    do{
                        int numeroLados;
                        float tamañoLado;
                        nombre="POLIGONO";
                        color=JOptionPane.showInputDialog(null,"Ingrese el color","Creando Poligono...",JOptionPane.QUESTION_MESSAGE);
                        coordenada_X=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en X","REGISTRO DE COORDENADAS-Creando Poligono...",JOptionPane.QUESTION_MESSAGE));
                        coordenada_Y=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en Y","REGISTRO DE COORDENADAS-Creando Poligono...",JOptionPane.QUESTION_MESSAGE));
                        coordenadas=new Punto(coordenada_X, coordenada_Y);
                        do{
                            numeroLados=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de lados","Creando Poligono...",JOptionPane.INFORMATION_MESSAGE));
                            if(numeroLados<4)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(numeroLados<4);
                        do{
                            tamañoLado=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el tamaño a asignar para todos los lados","Creando Poligono...",JOptionPane.QUESTION_MESSAGE));
                        }while(tamañoLado<1f);
                        Linea ladosPoligono=new Linea(tamañoLado,0f);
                        figura = new Poligono(numeroLados, ladosPoligono, coordenadas, color, nombre);
                        figuras.add(figura);
                        JOptionPane.showMessageDialog(null,"Poligono creado con exito","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                    }while(ciclo());
                break;
            case 6:
                    JOptionPane.showMessageDialog(null,"Creador de Elipses","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                    do{
                        float radioMayor,radioMenor;
                        nombre="ELIPSE";
                        color=JOptionPane.showInputDialog(null,"Ingrese el color","Creando Elipse...",JOptionPane.QUESTION_MESSAGE);
                        coordenada_X=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en X","REGISTRO DE COORDENADAS-Creando Elipse...",JOptionPane.QUESTION_MESSAGE));
                        coordenada_Y=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en Y","REGISTRO DE COORDENADAS-Creando Elipse...",JOptionPane.QUESTION_MESSAGE));
                        coordenadas=new Punto(coordenada_X, coordenada_Y);
                        do{
                            radioMayor=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el tamaño del radio mayor en cm","Creando Elipse...",JOptionPane.QUESTION_MESSAGE));
                            if(radioMayor<1f)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(radioMayor<1f);
                        do{
                            radioMenor=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el tamaño del radio menor en cm","Creando Elipse...",JOptionPane.QUESTION_MESSAGE));
                            if(radioMenor>=radioMayor)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(radioMenor>=radioMayor);
                        figura=new Elipse(radioMayor, radioMenor, coordenadas, color, nombre);
                        figuras.add(figura);
                        JOptionPane.showMessageDialog(null,"Elipse creada con exito","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                    }while(ciclo());
                break;
            case 7:
                    JOptionPane.showMessageDialog(null,"Creador de Circulos","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                    float radio;
                    nombre="CIRCULO";
                    color=JOptionPane.showInputDialog(null,"Ingrese el color","Creando Circulo...",JOptionPane.QUESTION_MESSAGE);
                    coordenada_X=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en X","REGISTRO DE COORDENADAS-Creando Circulo...",JOptionPane.QUESTION_MESSAGE));
                    coordenada_Y=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la coordenada en Y","REGISTRO DE COORDENADAS-Creando Circulo...",JOptionPane.QUESTION_MESSAGE));
                    coordenadas=new Punto(coordenada_X, coordenada_Y);
                    do{
                        radio=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el tamaño del radio en cm","Creando Circulo",JOptionPane.QUESTION_MESSAGE));
                        if(radio<1f)
                        JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                    }while(radio<1f);
                    figura = new Circulo(radio, coordenadas, color, nombre);
                    figuras.add(figura);
                    JOptionPane.showMessageDialog(null,"Circulo creado con exito","Operacion Exitosa",JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    
    public static void asignarColor(int opcion,String nombre){
        String color = JOptionPane.showInputDialog(null,"Ingrese el color");  
        iterador = figuras.iterator();
        switch(opcion){
            case 1:
                    
                    while(iterador.hasNext()){
                        iterador.next().setColor(color);
                    }
                    JOptionPane.showMessageDialog(null,"El color a sido actualizado para todos los objetos","CAMBIAR COLOR",JOptionPane.INFORMATION_MESSAGE)
                    ;break;
            case 2: 
                    for(int i=0;iterador.hasNext();i++){
                        if(iterador.next().getNombre().equals(nombre)){
                            figuras.get(i).setColor(color);
                        }
                    }
                    JOptionPane.showMessageDialog(null,"El color a sido actualizado","CAMBIAR COLOR",JOptionPane.INFORMATION_MESSAGE)
                    ;break;
        }
    }
    
    public static void listarDatos(){
        String datos="";
        iterador = figuras.iterator();
        while(iterador.hasNext()){
          datos+=iterador.next().toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,datos,"DATOS DE LAS FIGURAS",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static String areaFiguras(){
        String datos = "Area de todas las figuras\n\n";
        iterador = figuras.iterator();
        while(iterador.hasNext()){
            figura=(Figura) iterador.next();
            datos+=figura.getNombre()+"\n"+figura.calcularArea()+"\n\n";
        }
        return datos;
    }
    
    public static int areaMaxima(){
        iterador = figuras.iterator();
        int posicion = 0;
        float areaMAX=0f;
        for(int i=0;iterador.hasNext();i++){
            if(iterador.next().calcularArea()>areaMAX){
               areaMAX = iterador.next().calcularArea();
               posicion=i;
            }
        }
        return posicion;
    }
    
    public static void moverFiguras(ArrayList<Figura> figuras,byte veces) {
        Figura aux = figuras.get(figuras.size() - 1);          
        for(int a=0;a<veces;a++){
            for (int i = figuras.size() - 1; i > 0; i--) { 
            figuras.set(i, figuras.get(i - 1));
            }
            figuras.set(0, aux); 
        }
        JOptionPane.showMessageDialog(null,"Las Figuras se han movido con exito","MOVER FIGURAS",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"                  INTEGRANTES\n\n"
                + "1. Cerna Alvarado, Jhon Segundo\n"
                + "2. Huacachi Garcia, Irvin Guillermo\n"
                + "3. Peraldo Namoc, George Giosue\n"
                + "4. Perez Vargas, Karen Priscilla\n"
                + "5. Romero Pretel, Luis Marco\n"
                + "6. Salazar Teran, Dalila Katherine\n\n","GRUPO-5",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,"           Aplicacion N°2","BIENVENIDO",JOptionPane.INFORMATION_MESSAGE);
        do{
            switch (menu()) {
                case 1:
                        byte opcion=Byte.parseByte(JOptionPane.showInputDialog(null,"Crear Figuras\n\n"
                                + "1. Rectangulo\n"
                                + "2. Cuadrado\n"
                                + "3. Triangulo\n"
                                + "4. Triangulo Rectangulo\n"
                                + "5. Poligono\n"
                                + "6. Elipse\n"
                                + "7. Circulo\n\n "
                                + "       Seleccione una opcion","CREAR FIGURA",JOptionPane.QUESTION_MESSAGE));
                        crearFiguras(opcion);
                        
                        break;
                case 2:
                        asignarColor(1,null)
                        ;break;
                case 3:
                        String nombre=null;
                        int opc;
                        do{
                            opc=Integer.parseInt(JOptionPane.showInputDialog(null,""
                                + "1. Rectangulo\n"
                                + "2. Cuadrado\n"
                                + "3. Triangulo\n"
                                + "4. Triangulo Rectangulo\n"
                                + "5. Poligono\n"
                                + "6. Elipse\n"
                                + "7. Circulo\n\n "
                                + "      Seleccione una opcion"));
                            if(opc>7 || opc<1)
                            JOptionPane.showMessageDialog(null,"El valor ingresado es incorrepto\nIntentelo nuevamente","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                        }while(opc>7 || opc<1);
                        switch(opc){
                            case 1: nombre="RECTANGULO";break;
                            case 2: nombre="CUADRADO";break; 
                            case 3: nombre="TRIANGULO";break; 
                            case 4: nombre="TRIANGULO RECTANGULO";break; 
                            case 5: nombre="POLIGONO";break; 
                            case 6: nombre="ELIPSE";break; 
                            case 7: nombre="CIRCULO";break; 
                        }
                        asignarColor(2, nombre);
                        ;break;
                case 4: 
                        byte opcion_;
                        opcion_=Byte.parseByte(JOptionPane.showInputDialog(null,"Digite la posicion","MOVER TODAS LAS FIGURAS",JOptionPane.INFORMATION_MESSAGE));
                        moverFiguras(figuras, opcion_)
                        ;break;
                case 5:
                        // No disponible :(
                        ;break;
                case 6:
                        listarDatos()
                        ;break;
                case 7:
                        JOptionPane.showMessageDialog(null,areaFiguras(),"AREAS",JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Area maxima\n"+figuras.get(areaMaxima()).toString(),"AREA MAXIMA DE TODAS LAS FIGURAS",JOptionPane.INFORMATION_MESSAGE)
                        ;break;
            }
        }while(ciclo());
        JOptionPane.showMessageDialog(null,"Gracias por utilizar la Aplicacion","SALIR",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,figuras.size());
    }
}
