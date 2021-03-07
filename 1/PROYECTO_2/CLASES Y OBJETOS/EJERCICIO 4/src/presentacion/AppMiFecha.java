/*
Crear una clase MiFecha con las siguientes características:
a. Exhibir la fecha en múltiples formatos, como:
 MM/DD/AA
 DD/MM/AA
 Octubre 13, 2005
 Octubre 2005
b. Utilice constructores sobrecargados para crear 
objetos MiFecha inicializados con fechas en los formatos del punto a.
 */
package presentacion;
import entidades.MiFecha;
import javax.swing.JOptionPane;
/**
 *
 * @author GEORGE
 */
public class AppMiFecha {
    private static MiFecha fecha;
    private static int dia,mes,año;
    public static void ingresoDatos(){
        int ct=1;
        do{
        
            
            dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dia","     "
                    + "FECHA",JOptionPane.QUESTION_MESSAGE));
            mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el mes","     "
                    + "FECHA",JOptionPane.QUESTION_MESSAGE));
            año=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año","     "
                    + "FECHA",JOptionPane.QUESTION_MESSAGE));
            
            if(mes==2 && dia>28){
                ct=0;
            }
            if(dia>30 && mes==11 || mes==9 || mes==6 || mes==4 || mes==2) {
                ct=0;
            }  
            if(ct==0){
                JOptionPane.showMessageDialog(null,"La fecha ingresada es incorrepta","FECHA INCORREPTA",JOptionPane.ERROR_MESSAGE);
            }   
                
        }while(dia<1 || dia>31 && mes<1 || mes >12 && ct==0);   
    
    }
    
    public static String mesInt_to_String(int mes){
        String mes_=null;
        switch (mes) {
            case 1: mes_="Enero";break;
            case 2: mes_="Febrero";break;
            case 3: mes_="Marzo";break;
            case 4: mes_="Abril";break;
            case 5: mes_="Mayo";break;
            case 6: mes_="Junio";break;
            case 7: mes_="Julio";break;
            case 8: mes_="Agosto";break;
            case 9: mes_="Septiembre";break;
            case 10: mes_="Octubre";break;
            case 11: mes_="Noviembre";break;
            case 12: mes_="Diciembre";break;
        }
        return mes_;
    }
    
    public static void main(String[] args) {
         int rt;
         
        do{
            ingresoDatos();
            fecha=new MiFecha(dia, mes, año);
            JOptionPane.showMessageDialog(null,"      FECHA FORMATO\n"
                    + "     MM  //  DD  //AA\n\n"
                    +"    "+fecha.getMes()+"  //  "+fecha.getDia()+"  //  "+fecha.getAño(),"       MI FECHA",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"      FECHA FORMATO\n"
                    + "     DD  //  MM  //  AA\n\n"
                    +"    "+fecha.getDia()+"  //  "+fecha.getMes()+"  //  "+fecha.getAño(),"       MI FECHA",JOptionPane.INFORMATION_MESSAGE);
            fecha=new MiFecha(mesInt_to_String(mes), dia, año);
            JOptionPane.showMessageDialog(null,"      FECHA FORMATO\n"
                    + "     Mes Dia, Año\n\n"
                    +fecha.getMes_()+" "+fecha.getDia()+", "+fecha.getAño(),"       MI FECHA",JOptionPane.INFORMATION_MESSAGE);
            fecha= new MiFecha(mesInt_to_String(mes), año);
            JOptionPane.showMessageDialog(null,"      FECHA FORMATO\n"
                    + "     Mes, Año\n\n"
                    +"     "+fecha.getMes_()+", "+fecha.getAño(),"       MI FECHA",JOptionPane.INFORMATION_MESSAGE);
            
            rt=JOptionPane.showConfirmDialog(null,"¿Desea hacer otra operacion?\n   Si / NO");
        }while(rt!=1);
    }
}
