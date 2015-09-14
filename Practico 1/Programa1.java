
/**
 * Programa que calcula la suma, resta, multiplicacion, division y resto de a y b
 * 
 * @author Agustin N. R. Ramirez
 */
public class Programa1
{
    /**
     * Metodo de entrada al programa
     * 
     * @return  La suma, resta, multiplicacion, division y resto de a y b
     */
    public static void main(String[] args) {
        //Declaro variables locales
        int a, b;
        
        //Asigno a las variables los valores fijos
        a = 8;
        b = 3;
        
        //Imprimo la suma de a y b
        System.out.println("Suma de a y b es: " + (a + b));
        
        //Imprimo la resta de a y b
        System.out.println("Resta de a y b es: " + (a - b));
        
        //Imprimo la multiplicacion de a y b
        System.out.println("Multiplicacion de a y b es: " + (a * b));
        
        //Imprimo la division de a y b
        System.out.println("Division de a y b es: " + (a / b));
        
        //Imprimo el resto de a y b
        System.out.println("Resto de a y b es: " + (a % b));
    }
}
