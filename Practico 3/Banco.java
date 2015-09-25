import java.util.*;
/**
 * Write a description of class Banco here.
 * 
 * @author Agustin N. R. Ramirez
 * @version Septiembre 2015
 */
public class Banco
{ 
    public static void main(String[] args){
        //      String resp = "si";
        //     String resp2 = "si"; 
        //     String resp3 = "si"; 
        //     String resp4 = "si"; 
        double importe = 0;
        Scanner teclado = new Scanner (System.in);
        //Se ingresan datos por teclado
        System.out.print("Ingrese DNI del titular: ");
        int dni = teclado.nextInt();
        System.out.print("Ingrese Nombre: ");
        String nombre = teclado.next();
        System.out.print("Ingrese Apellido: ");
        String apellido = teclado.next();
        System.out.print("Ingrese dia de nacimiento: ");
        int dia = teclado.nextInt();
        System.out.print("Ingrese mes de nacimiento: ");
        int mes = teclado.nextInt();
        System.out.print("Ingrese año de nacimiento: ");
        int anio = teclado.nextInt();
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(anio, mes, dia);
        Persona titular = new Persona (dni, nombre, apellido, fecha1);
        
        
        CuentaCorriente cuenta = new CuentaCorriente(1735, titular , 1500);
        CajaDeAhorro caja = new CajaDeAhorro(2135, titular , 155.25);
        System.out.println("Desea depositar en Cuenta Corrientes? si / no");
        String resp = teclado.next();
        if (resp.trim().equals("si")){
            System.out.println("Ingrese importe");
            importe = teclado.nextDouble();
            cuenta.depositar(importe);
        }
        System.out.println("Desea extraer de Cuenta Corrientes? si / no");
        String resp2 = teclado.next();
        if (resp2.trim().equals("si")){
            System.out.println("Ingrese importe");
            importe = teclado.nextDouble();
            cuenta.extraer(importe);
        }
        System.out.println("Desea depositar en Caja de Ahorro? si / no");
        String resp3 = teclado.next();
        if (resp3.trim().equals("si")){
            System.out.println("Ingrese importe");
            importe = teclado.nextDouble();
            caja.depositar(importe);
        }
        System.out.println("Desea extraer en Caja de Ahorro? si / no");
        String resp4 = teclado.next();
        if (resp4.trim().equals("si")){
            System.out.println("Ingrese importe");
            importe = teclado.nextDouble();
            caja.extraer(importe);
        }
        
        cuenta.mostrar();
        caja.mostrar();
        if (titular.esCumpleaños() == true){
            System.out.println("----------------------------------------");
            System.out.println("Es el cumpleaños del titular");
        }
    
    }
}
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       