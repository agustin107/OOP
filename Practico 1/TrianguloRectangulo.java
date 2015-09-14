
/**
 * Programa que calcula si un triangulo es rectangulo
 * 
 * @author Agustin N. R. Ramirez
 */
public class TrianguloRectangulo
{
    /**
     * Metodo de entrada al programa
     * 
     * @param   hipotenusa
     * @param   cateto1
     * @param   cateto2
     * @return     Mensaje que dice si triangulo rectangulo o no
     */
    public static void main(String[] args)
    {
        //Asigno a las variables los argumentoss
        int hipotenusa = Integer.parseInt(args[0]);
        int cateto1 = Integer.parseInt(args[1]);
        int cateto2 = Integer.parseInt(args[2]);
        //Calculo el cuadrado de la hipotenusa y el de catetos
        int cuadradoHipotenusa = hipotenusa * hipotenusa;
        int cuadradoDeCatetos = (cateto1 * cateto1) + (cateto2 * cateto2);
        
        //Verifico si son iguales los cuadrados de hipotenusa y catetos
        if(cuadradoHipotenusa == cuadradoDeCatetos) {
            //Imprimo que es rectangulo
            System.out.println("El triangulo es rectangulo");
        } else {
            //Imprimo que no es rectangulo
            System.out.println("El triangulo no es rectangulo");
        }
    }
}
