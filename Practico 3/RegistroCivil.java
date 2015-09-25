import java.util.Scanner;
/**
 * Write a description of class RegistroCivil here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class RegistroCivil
{ 
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Nombre de la mujer");
        nombre = teclado.next();
        System.out.println("Ingrese Apellido de la mujer");
        apellido = teclado.next();
        System.out.println("Ingrese Edad de la mujer");
        edad = teclado.nextInt();
        Mujer mujer = new Mujer(nombre, apellido, edad);
        System.out.println("Ingrese Nombre del hombre");
        nombre = teclado.next();
        System.out.println("Ingrese Apellido del hombre");
        apellido = teclado.next();
        System.out.println("Ingrese Edad del hombre");
        edad = teclado.nextInt();
        Hombre hombre = new Hombre(nombre, apellido, edad);
        if(mujer.getEstadoCivil().trim().equals("Soltera")){
            mujer.casarseCon(hombre);
            mujer.casadaCon();
        }
        if(hombre.getEstadoCivil().trim().equals("Soltero")){
            hombre.casarseCon(mujer);
            hombre.casadoCon();
        }
        System.out.println("Certificado de Matrimonio");
        System.out.println("Esposa: " + mujer.datos());
        System.out.println("Esposo: " + hombre.datos());
    }
}

