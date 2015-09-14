/**
 * Clase PruebaPersona que es la que se va a encargar
 * de probar y ejecutar la clase Persona
 * 
 * @author Agustin N. R. Ramirez
 * @see Persona
 * @version 1.0
 */
public class PruebaPersona
{
    /**
     * Entrada al programa que se va a encargar de ejecutar
     * y probar la clase Persona
     * 
     */
    public static void main(String[] args)
    {  
        // Declaro los objetos
        Persona agustin = new Persona(12345678, "Agustin", "Ramirez", 1992);
        Persona claudio = new Persona(87654321, "Claudio", "Lescano", 1990);
        
        // Mando mensajes
        System.out.println("-------- Mensaje mostrar ---------");
        agustin.mostrar();
        claudio.mostrar();
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje edad ---------");
        System.out.println("Edad: "+ agustin.edad());
        System.out.println("Edad: "+ claudio.edad());
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje nomYApe ---------");
        System.out.println("Nombre y Apellido: "+ agustin.nomYApe());
        System.out.println("Nombre y Apellido: "+ claudio.nomYApe());
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje apeYNom ---------");
        System.out.println("Apellido y Nombre: "+ agustin.apeYNom());
        System.out.println("Apellido y Nombre: "+ claudio.apeYNom());
        System.out.println("----------------------------------");
    }
}
