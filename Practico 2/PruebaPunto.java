import java.util.Scanner;

/**
 * Clase PruebaPunto que prueba y ejecuta la clase Punto.
 * 
 * @author Agustin N. R. Ramirez
 * @see Punto
 * @version 1.0
 */
public class PruebaPunto
{
    /**
     * Entrada al programa para probar y ejecturar la clase Punto
     * 
     */
    public static void main(String[] args)
    {
        // Defino variables locales
        double x;
        double y;
        boolean seguir = true;
        String respuesta;
        Scanner teclado = new Scanner(System.in);
        
        teclado.useDelimiter("\n");
        do {
            System.out.println("Ingrese el valor x del Punto: ");
            x = teclado.nextDouble();
            System.out.println("Ingrese el valor y del Punto: ");
            y = teclado.nextDouble();
            Punto punto;
            System.out.println("Ingrese un numero para invocar a la sobrecarga: 1 o 2");
            respuesta = teclado.next();
            if(respuesta.compareTo("1") == 0) {
                punto = new Punto();
            } else {
                punto = new Punto(x, y);
            }
            System.out.println("-------- Mensaje mostrar ---------");
            punto.mostrar();
            System.out.println("----------------------------------");
            System.out.println("-------- Mensaje desplazar ---------");
            System.out.println("Ingrese el valor a desplazar a X: ");
            int desp_x = teclado.nextInt();
            System.out.println("Ingrese el valor a desplazar a Y: ");
            int desp_y = teclado.nextInt();
            punto.desplazar(desp_x, desp_y);
            System.out.println("----------------------------------");
            System.out.println("-------- Mensaje coordenadas ---------");
            System.out.println("Coordenadas: " + punto.coordenadas());
            System.out.println("----------------------------------");
            System.out.println("-------- Mensaje mostrar ---------");
            punto.mostrar();
            System.out.println("----------------------------------");
            System.out.println("Desea seguir ingresando otro Laboratorio? S/N");
            respuesta = teclado.next();
            if(respuesta.compareTo("N") == 0) {
                seguir = false;
            }
        } while(seguir);
    }
}
