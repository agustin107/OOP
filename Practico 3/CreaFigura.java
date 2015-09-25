import java.util.Random;

/**
 * Write a description of class CreaFigura here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class CreaFigura{
   public static void main(String []args){
       
       Punto punto1 = new Punto();
       
       Random unNumero = new Random();
       double radio = unNumero.nextDouble()*100.0;
       
       Circulo circulo1 = new Circulo(radio, punto1);
       circulo1.caracteristicas();
       System.out.println(" ");
       
       double dx = -240;
       double dy = -230;
       circulo1.desplazar(dx, dy);
       circulo1.caracteristicas();
       
       
       Punto punto2 = new Punto (5.2, 0.5);
       Random otroNumero = new Random();
       double radio2 = otroNumero.nextDouble()*100.0;
       Circulo circulo2 = new Circulo (radio2, punto2);
       circulo2.caracteristicas();
       
       System.out.println("Caracteristicas del circulo mayor");
       circulo1.elMayor(circulo2).caracteristicas();
       
       System.out.println ("La distancia entre los circulos es de: " + circulo1.distanciaA(circulo2));
       
    
       //ejercicio 4
       
       System.out.println();
       Punto punto3 = new Punto ();
       Random numero = new Random();
       double lado1 = numero.nextDouble()*100.0;
       double lado2 = numero.nextDouble()*100.0;
       Rectangulo rectangulo1 = new Rectangulo (punto3, lado1, lado2);
       rectangulo1.caracteristicas();
       
       double ladoan = 40;
       double ladoal = -20;
       rectangulo1.desplazar(ladoan, ladoal);
       rectangulo1.caracteristicas();
       
       System.out.println();
       double a = 7.4;
       double b = 4.5;
       Punto punto4 = new Punto (a, b);
       Random numero3 = new Random();
       double lado3 = numero3.nextDouble()*100.0;
       double lado4 = numero3.nextDouble()*100.0;
       Rectangulo rectangulo2 = new Rectangulo (punto4, lado3, lado4);
       rectangulo2.caracteristicas();
       System.out.println();
       System.out.println ("Rectangulo mayor");
       rectangulo1.elMayor(rectangulo2).caracteristicas();
       System.out.println ("La distancia entre los rectangulo es de: " + rectangulo1.distanciaA(rectangulo2));
    }
}
  