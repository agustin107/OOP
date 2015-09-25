import java.util.Scanner;
/**
 *Clase de tipo ejecutable, se ingresa por teclas el dia,mes y año. Luego se realiza la instanciacion 
 *de los datos ingresados a la clase Fecha. Se muestra de manera numerica y por letra.
 *Se pide que ingrese la cantidad de dias que desea modificar a la fecha.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class EjecutableFecha
{
    public static void main(String [] args){
        
        Scanner teclado = new Scanner(System.in);
        char opcion = 's';
        
        System.out.print("Ingrese un dia: ");
        int dia = teclado.nextInt();
        System.out.print("Ingrese un mes: ");
        int mes = teclado.nextInt();
        System.out.print("Ingrese un año: ");
        int anio = teclado.nextInt();
        
        Fecha unaFecha = new Fecha(dia,mes,anio);
        
        System.out.println(" * * * * * *");
        System.out.println(unaFecha.verNumero());
        System.out.println(unaFecha.verLetra());
        System.out.println("* * * * * * * ");
        
        
        System.out.print("Ingrese cantidad de dias que desea modificar: ");
        dia = teclado.nextInt();
        unaFecha.incrementarFecha(dia);
           
        System.out.println();
        System.out.println("Fecha modificada: "+unaFecha.incrementarSinCambio(dia).verNumero()+" (no se modifica la fecha actual)");
        System.out.println("Fecha actual: "+unaFecha.verNumero());
        Fecha fechaHoy = new Fecha();
        System.out.println("Cantidad de dias entre la fecha ingresada y la fecha actual: "+unaFecha.diasCorridos(fechaHoy));
        
    }
}
