//Importo la libreria Scanner
import java.util.Scanner;

/**
 * Programa que ordena los elementos de un vector de menor a mayor
 * 
 * @author Agustin N. R. Ramirez
 */
public class OrdenVector
{
    /**
     * Metodo de entrada al programa
     * 
     * @return     Arreglo ordenado de menor a mayor
     */
    public static void main(String[] args) {
        //Defino las variables
        double[] arreglo = new double[4];
        double elemento, aux;
        double menor = 999999;
        Scanner teclado = new Scanner(System.in);
        
        //Bucle para el ingreso de datos
        for(int i=0; i < 4; i++) {
            System.out.println("Ingrese un elemento double al arreglo: ");
            elemento = Double.parseDouble(teclado.next());
            arreglo[i] = elemento;
            //Verifico si es el menor elemento
            if(elemento < menor) {
                menor = elemento;
            }
        }
        
        //Bucle para ordenar el vector por el metodo burbuja
        for(int i=0; i < arreglo.length - 1; i++) {
            for(int j=0; j < arreglo.length - i - 1; j++) {
               if(arreglo[j+1]< arreglo[j]){
                  aux = arreglo[j+1];
                  arreglo[j+1] = arreglo[j];
                  arreglo[j] = aux;
               }
            }
        }
        
        //Imprimo el menor elemento y los elementos del vector
        System.out.println("El elemento menor es: " + menor);
        System.out.println("Los elementos del vector son: ");
        for(int i=0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\t");
        }
    }
}
