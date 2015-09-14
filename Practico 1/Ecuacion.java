
/**
 * Programa que calcula las raices reales de una ecuacion de segundo grado
 * 
 * @author Agustin N. R. Ramirez
 */
public class Ecuacion
{
    /**
     * Metodo de entrada al programa
     * 
     * @param   a   Coeficiente
     * @param   b   Coeficiente
     * @param   c   Coeficiente
     * @return     Las raices reales la ecuacion
     */
    public static void main(String[] args)
    {
        //Declaro variables locales
        double a, b, c, discriminante, x1, x2;
        
        
        //Asigno a las variables lo ingresado por teclado por argumento
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        
        //Obtengo la discriminante
        discriminante = b * b - 4 * a * c;
        
        if(discriminante > 0) {
            //Calculo x1 y x2
            x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
            x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
            
            //Imprimo x1 y x2
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if(discriminante == 0) {
            //Calculo x1
            x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
            
            //Imprimo que x1 es igual a x2 y el valor de x1
            System.out.println("x1 es igual a x2");
            System.out.println("x1 = " + x1);
        } else {
            //Imprimo que es un numero imaginario
            System.out.println("Es una solucion compleja (numero imaginario)");
        }
    }
}
