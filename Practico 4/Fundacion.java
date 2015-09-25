import java.io.*;
import java.util.*;
/**
 * Write a description of class Fundacion here.
 * 
 * @author Agustin N. R. Ramirez
 * @version (a version number or a date)
 */
public class Fundacion
{
    private String nombre;
    
    public Fundacion(String p_nombre){
        this.setNombre(p_nombre);
    }
    
    private void setNombre(String p_nombre){this.nombre=p_nombre;}
    
    public String getNombre(){return this.nombre;}
    
    public void imprimirInvitacion(Evento p_evento,Persona p_persona){
        System.out.println("Estimado/a: " + p_persona.apeYNom());
        System.out.println();
        System.out.println("La fundacion "+this.getNombre());
        System.out.println("Invita a Ud. al proximo evento: "+p_evento.getNombre());
        System.out.println("Las inscrpciones se realizan con "+ p_evento.getDiasInscripcion()+" dias de anticipacion.");
        System.out.println("Las mismas se llevaran a cabo el dia: " + p_evento.fechaInscripcion().verNumero());
        System.out.println("El evento tendra lugar en: "+ p_evento.getLugar());
        System.out.println("Costo: " + p_evento.costoFinal(p_persona.edad()));
        System.out.println("Lo esperamos.");
    }
    
    public void grabarInvitacion(Evento p_evento,Persona p_persona,DataOutputStream unArchivo){
        
        try {
          unArchivo.writeInt(p_persona.getDNI());
          unArchivo.writeUTF(p_persona.apeYNom());
          unArchivo.writeUTF(p_evento.getNombre());
          unArchivo.writeUTF(p_evento.getLugar());
          unArchivo.writeDouble(p_evento.getCosto());
          unArchivo.writeInt(p_evento.getFechaEvento().getMes());
          unArchivo.writeInt(p_evento.getFechaEvento().getDia());
          
         
        }
        catch(FileNotFoundException fnfe){System.out.println("Archivo no encontrado");}
        catch(IOException ioe){System.out.println("Error al gravar");}
    }
}
