import java.util.Scanner;

/**
 * Clase PruebaEmpleado que se encarga de probar y ejecutar la clase Empleado
 * 
 * @author Agustin N. R. Ramirez
 * @see Empleado
 * @version 1.0
 */
public class PruebaEmpleado
{
    /**
     * Entrada al programa para probar y ejecutar la clase Empleado
     *  
     */
    public static void main(String[] args)
    {
        // Declaro variables locales
        long cuil = 0;
        String apellido;
        String nombre;
        double sueldoBasico = 0;
        int anioIngreso = 0;
        boolean seguir = true;
        String respuesta;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese el CUIL del Empleado: ");
            cuil = teclado.nextLong();
            System.out.println("Ingrese el apellido del Empleado: ");
            apellido = teclado.next();
            System.out.println("Ingrese el nombre del Empleado: ");
            nombre = teclado.next();
            System.out.println("Intrese el sueldo basico del Empleado: ");
            sueldoBasico = teclado.nextDouble();
            System.out.println("Intrese el año de ingreso del Empleado: ");
            anioIngreso = teclado.nextInt();
            Empleado empleado = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
            System.out.println("-------- Mensaje mostrar ---------");
            empleado.mostrar();
            System.out.println("----------------------------------");
            System.out.println("-------- Mensaje antiguedad ---------");
            System.out.println("Antiguedad: " + empleado.antiguedad());
            System.out.println("----------------------------------");
            System.out.println("-------- Mensaje sueldoNeto ---------");
            System.out.println("Suelto neto: " + empleado.sueldoNeto());
            System.out.println("----------------------------------");
            System.out.println("-------- Mensaje nomYApe ---------");
            System.out.println("Nombre y Apellido: "+ empleado.nomYApe());
            System.out.println("----------------------------------");
            System.out.println("-------- Mensaje apeYNom ---------");
            System.out.println("Apellido y Nombre: "+ empleado.apeYNom());
            System.out.println("----------------------------------");
            System.out.println("-------- Mensaje mostrarLinea ---------");
            System.out.println(empleado.mostrarLinea());
            System.out.println("----------------------------------");
            System.out.println("Desea seguir ingresando otro Empleado? S/N");
            respuesta = teclado.next();
            if(respuesta.toUpperCase().compareTo("N") == 0) {
                seguir = false;
            }
        } while(seguir);
    }
}
