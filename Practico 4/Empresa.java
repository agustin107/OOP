import java.io.*;
import java.util.Scanner;
import java.util.Calendar;

/**
 * Write a description of class Empresa here.
 * 
 * @author Agustin N. R. Ramirez 
 * @version 1.0
 */
public class Empresa
{
   public static void main (String [] args){
       
       long cuil = 0;
       String apellido = "";
       String nombre = "";
       double sueldo = 0;
       int dia = 0;
       int mes = 0;
       int anio = 0;
       char opcion = 's';
       
       Scanner teclado = new Scanner(System.in);
       
       try {
        
          FileOutputStream archiFOS = new FileOutputStream ("D:\\Empleado.dat",true);
          DataOutputStream archiDOS = new DataOutputStream(archiFOS);
          
          while(opcion != 'n' && opcion != 'N'){
              System.out.println("** DATOS DEL EMPLEADO **");
              System.out.print("CUIL: ");
              cuil = teclado.nextLong();
              System.out.print("Apellido: ");
              apellido = teclado.next();
              System.out.print("Nombre: ");
              nombre = teclado.next();
              System.out.print("Sueldo Basico: ");
              sueldo = teclado.nextDouble();
              System.out.println("Fecha de ingreso a la Empresa");
              System.out.print("Dia: ");
              dia = teclado.nextInt();
              System.out.print("Mes: ");
               mes = teclado.nextInt();
              System.out.print("Anio: ");
              anio = teclado.nextInt();
              
              Calendar fecha = Calendar.getInstance();
              fecha.set(anio,mes,dia);
              
              Empleado empleado = new Empleado(cuil,apellido,nombre,sueldo,fecha);
              
              archiDOS.writeLong(empleado.getCuil());
              archiDOS.writeUTF(empleado.getApellido());
              archiDOS.writeUTF(empleado.getNombre());
              archiDOS.writeDouble(empleado.getSueldoBasico());
              archiDOS.writeDouble(empleado.sueldoNeto());
              archiDOS.writeInt(empleado.getFechaIngreso().get(Calendar.DATE));
              archiDOS.writeInt(empleado.getFechaIngreso().get(Calendar.MONTH));
              archiDOS.writeInt(empleado.getFechaIngreso().get(Calendar.YEAR));
              
              System.out.println();
              empleado.mostrar();
              System.out.println();
              
              System.out.print("Desea ingresar mas Empleados? (S/N) ---> ");
              opcion = teclado.next().charAt(0);
          }
          //cierre del archivo logico
          archiDOS.close();
       }
       catch(FileNotFoundException fnfe){
           System.out.println("Archivo no encontrado...");
       }
       catch(IOException ioe){
           System.out.println("Error al grabar...");
       }
       
       System.out.println("Archivo generado: EMPLEADO.DAT");
   }
}
