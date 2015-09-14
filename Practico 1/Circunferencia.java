
/**
 * Programa que calcula el perimetro de una circunferencia
 * 
 * @author Agustin N. R. Ramirez
 */
public class Circunferencia
{
    /**
     * Metodo de entrada al programa
     * 
     * @param   radio   El parametro radio define el radio de la circunferencia
     * @return      El perimetro de la circunferencia
     */
    public static void main(String[] args) {
        //Asigno a radio lo ingresado como argumento del programa
        int radio = Integer.parseInt(args[0]);
        //Declaro pi con su valor correspondiente
        double pi = 3.14;
        //Calculo el perimetro
        double perimetro = pi * (radio * radio);
        
        //Imprimo el perimetro
        System.out.println("El perimetro de la circunferencia es: " + perimetro);
    }
}
