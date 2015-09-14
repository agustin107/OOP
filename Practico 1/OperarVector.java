//Importo la libreria Scanner para ingresar datos por teclado
import java.util.Scanner;

/**
 * Programa que calcula promedio y determina la mayor nota
 * 
 * @author Agustin N. R. Ramirez
 */
public class OperarVector
{
    /**
     * Metodo de entrada al programa
     * 
     * @return     El promedio de las notas y la mayor nota
     */
    public static void main(String[] args)
    {
        //Declaro variables
        int cantidadDeAlumnos = 5;
        int contador = 0;
        int[] arreglo = new int[cantidadDeAlumnos];
        int mayorNota = 0;
        double total = 0;
        double promedio;
        Scanner teclado = new Scanner(System.in);
        
        //Bucle para calcular todas las notas
        while(contador < cantidadDeAlumnos) {
            System.out.println("Ingrese la nota del alumno " + contador + ":");
            arreglo[contador] = teclado.nextInt();
            //Verifico si es la mayor nota, de ser verdadero lo guardo
            if(mayorNota < arreglo[contador]) {
                mayorNota = arreglo[contador];
            }
            //Guardo todas las notas
            total += arreglo[contador];
            //Aumento el contador
            contador++;
        }
        
        promedio = total / cantidadDeAlumnos;
        
        contador = 0;
        System.out.println("Los elementos ingresados son: ");
        
        while(contador < cantidadDeAlumnos) {
            System.out.print(arreglo[contador] + "\t");
            contador++;
        }
        
        System.out.println("El promedio es: " + promedio);
        System.out.println("La mayor nota es: " + mayorNota);
    }
}
