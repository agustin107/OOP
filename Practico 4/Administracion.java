import java.util.*;
import java.io.*;
/**
 * Write a description of class Administracion here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class Administracion
{
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        
        System.out.print("Nombre de la Fundacion: ");
        String nombreFundacion = teclado.next();
        
        System.out.println("Datos para crear un Evento");
        System.out.print("Nombre: ");
        String nombreEvento = teclado.next();
        
        System.out.print("Lugar :");
        String lugarEvento = teclado.next();
        
        System.out.print("Costo :");
        double costo = teclado.nextDouble();
        
        System.out.print("Dia: ");
        int diaEvento = teclado.nextInt();
        
        System.out.print("Mes: ");
        int mesEvento = teclado.nextInt();
        
        System.out.print("Anio: ");
        int anioEvento = teclado.nextInt();
        
        System.out.print("Cuantos dias antes de la fecha del evento se realizara la inscipcion? ");
        int diasInscripcion = teclado.nextInt();
        
        Fundacion unaFundacion = new Fundacion(nombreFundacion);
        
        Fecha fechaEvento = new Fecha(diaEvento,mesEvento,anioEvento);
        
        Evento unEvento = new Evento(nombreEvento,lugarEvento,fechaEvento,diasInscripcion,costo);
        
        try{
           FileInputStream archiFIS = new FileInputStream("D:\\invitados.dat");
           DataInputStream archiDIS = new DataInputStream(archiFIS);
            
           while(archiFIS.available() > 0){
        
            
                
                int dni = archiDIS.readInt();
                String nombre = archiDIS.readUTF();
                String apellido = archiDIS.readUTF();
                int dia = archiDIS.readInt();
                int mes = archiDIS.readInt();
                int anio = archiDIS.readInt();
        
                Calendar fechaNacimiento = Calendar.getInstance();
                fechaNacimiento.set(anio,mes,dia);
        
                Persona unaPersona = new Persona(dni,nombre,apellido,fechaNacimiento);
        
                unaFundacion.imprimirInvitacion(unEvento,unaPersona);
               
                FileOutputStream archiFOS = new FileOutputStream("D:\\Administracion.dat",true);
                DataOutputStream archiDOS = new DataOutputStream(archiFOS);
                
                unaFundacion.grabarInvitacion(unEvento,unaPersona,archiDOS);
                
                archiDOS.close();
               
            } 
           
           archiDIS.close();
        }
        catch(FileNotFoundException fnfe){System.out.println("No se encontro el archivo");}
        catch(IOException ioe){System.out.println("Error al leer");}
    }
}
