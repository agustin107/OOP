
/**
 * Programa que calcula todos los numeros multiplos de 4
 * 
 * @author Agustin N. R. Ramirez
 */
public class Programa2
{
    /**
     * Metodo de entrada al programa
     * 
     * @return      Los numeros multiplos de 4 
     */
    public static void main(String[] args) {
        //Itero desde el 42 hasta 150
        for(int i=42; i <= 150; i++) {
            //Verifico si es multiplo de 4
            if(i%4 == 0) {
                //Imprimo los multiplos de 4
                System.out.println("El numero " + i + " es multiplo de 4");
            }
        }
    }
}
