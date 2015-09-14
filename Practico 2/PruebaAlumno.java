import java.util.Scanner;

/**
 * Clase PruebaAlumno que se encarga de probar y ejecutar la clase Alumno
 * 
 * @author Agustin N. R. Ramirez
 * @see Alumno
 * @version 1.0
 */
public class PruebaAlumno
{
    /**
     * Entrada al programa para probar y ejecutar la clase Alumno
     * 
     * @param  args arreglo de string que contiene LU, nombre y apellido
     */
    public static void main(String[] args)
    {
        // Declaro variables locales
        int lu = Integer.parseInt(args[0]);
        String nombre = args[1];
        String apellido = args[2];
        
        // Declaro los objetos
        Alumno alumno = new Alumno(lu, nombre, apellido);
        Alumno agustin = new Alumno(45564, "Agustin", "Ramirez");
        System.out.println("-------- Mensaje setNota1 ---------");
        alumno.setNota1(8);
        agustin.setNota1(7);
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje setNota2 ---------");
        alumno.setNota2(10);
        agustin.setNota2(9);
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje promedio ---------");
        System.out.println("Promedio: " + alumno.promedio());
        System.out.println("Promedio: " + agustin.promedio());
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje nomYApe ---------");
        System.out.println("Nombre y Apellido: "+ alumno.nomYApe());
        System.out.println("Nombre y Apellido: "+ agustin.nomYApe());
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje apeYNom ---------");
        System.out.println("Apellido y Nombre: "+ alumno.apeYNom());
        System.out.println("Apellido y Nombre: "+ agustin.apeYNom());
        System.out.println("----------------------------------");
        System.out.println("-------- Mensaje mostrar ---------");
        alumno.mostrar();
        agustin.mostrar();
        System.out.println("----------------------------------");
    }
}
