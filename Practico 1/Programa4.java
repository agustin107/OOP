
/**
 * Programa que calcula el semiperimetro y el area del triangulo
 * 
 * @author Agustin N. R. Ramirez
 */
public class Programa4
{
    /**
     * Metodo de entrada al programa
     * 
     * @param   a   El parametro a es un lado del triangulo
     * @param   b   El parametro b es un lado del triangulo
     * @param   c   El parametro c es un lado del triangulo
     * @return      Devuelve el semiperimetro y area del triangulo
     */
    public static void main(String[] args)
    {
        //Defino las variables locales
        double a, b, c, semiperimetro, area;
        
        //Asigno a las variables, los datos ingresado en el argumento del programa
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        
        //Calculo el semiperimetro y area
        semiperimetro = (a + b + c) / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
        
        //Imprimo el semiperimetro y el area
        System.out.println("Semiperimetro: " + semiperimetro);
        System.out.println("Area: " + area);
    }
}
