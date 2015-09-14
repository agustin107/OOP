//Importo la libreria Scanner para el ingreso de datos por teclado
import java.util.Scanner;

/**
 * Programa que calcula el perimetro de muchas circunferencias
 * 
 * @author Agustin N. R. Ramirez
 */
public class Programa7
{
    /**
     * Metodo de entrada al programa
     * 
     * @return     El perimetro de las circunferencias ingresadas
     */
    public static void main(String[] args) {
        //Declaro variables
        int radio;
        double pi = 3.14;
        double perimetro;
        boolean exit = true;
        Scanner teclado = new Scanner(System.in);
        
        //Bucle para calcular varios perimetros
        while(exit) {
            //Pido que ingrese el radio de la circunferencia
            System.out.println("Ingrese el radio de la circunferencia:");
            //Asigno lo ingresado a radio
            radio = teclado.nextInt();
            
            //Calculo el perimetro
            perimetro = pi * (radio * radio);
            //Imprimo el perimetro calculado
            System.out.println("El perimetro de la circunferencia es: " + perimetro);
            System.out.println("------------------------------------");
            //Pregunto si quiere calcular otro perimetro
            System.out.println("Desea calcular el perimetro de otra circunferencia? S/N");
            //Obtengo la respuesta
            String respuesta = teclado.next();
            //Verifico si quiere calcular o no otro perimetro
            if(respuesta.compareTo("N") == 0) {
                exit = false;
            }
        }
    }
}
