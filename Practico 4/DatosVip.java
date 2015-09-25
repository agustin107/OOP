import java.io.*;
import java.util.*;

/**
 * Write a description of class DatosVip here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class DatosVip
{
    public static void main(String [] args){
        
        long cuil=0;
        String apellido="";
        String nombre="";
        double sueldoBasico=0;
        double sueldoNeto=0;
        int dia=0;
        int mes=0;
        int anio=0;
        
        try{
            FileInputStream archiFIS = new FileInputStream ("D:\\Empleado.dat");
            DataInputStream archiDIS = new DataInputStream (archiFIS);
            
            try{
                FileOutputStream archiFOS = new FileOutputStream("D:\\EmpleadoVip.dat",true);
                DataOutputStream archiDOS = new DataOutputStream(archiFOS);
        
      
                System.out.println("** Empelado VIP (10 o mas anios dentro de la empresa) **");
                while(archiFIS.available() > 0){
                    cuil = archiDIS.readLong();
                    apellido = archiDIS.readUTF();
                    nombre = archiDIS.readUTF();
                    sueldoBasico = archiDIS.readDouble();
                    sueldoNeto = archiDIS.readDouble();
                    dia = archiDIS.readInt();
                    mes = archiDIS.readInt();
                    anio = archiDIS.readInt();
            
                    Calendar fecha = Calendar.getInstance();
                    fecha.set(anio,mes,dia);
            
                    Empleado unEmpleado = new Empleado(cuil,apellido,nombre,sueldoBasico,fecha);
            
                    //System.out.println(apellido+" "+nombre+" "+sueldoBasico+" "+sueldoNeto+" "+dia+" "+mes+" "+anio);
                    if(unEmpleado.antiguedad() >= 10){
            
                        archiDOS.writeLong(unEmpleado.getCuil());
                        archiDOS.writeUTF(unEmpleado.getApellido());
                        archiDOS.writeUTF(unEmpleado.getNombre());
                        archiDOS.writeDouble(unEmpleado.getSueldoBasico());
                        archiDOS.writeDouble(unEmpleado.sueldoNeto());
                        archiDOS.writeInt(unEmpleado.getFechaIngreso().get(Calendar.DATE));
                        archiDOS.writeInt(unEmpleado.getFechaIngreso().get(Calendar.MONTH));
                        archiDOS.writeInt(unEmpleado.getFechaIngreso().get(Calendar.YEAR));
        
                        unEmpleado.mostrar();
                        System.out.println();
        
        
                        
                    }
                    
                    
                }
                archiDOS.close();
                System.out.println("Archivo generado: EmpleadoVip.dat");
            }
            catch(FileNotFoundException fnfe){System.out.println("Archivo no encontrado.");}
            catch(IOException ioe){System.out.println("Error al grabar.");}
            
            System.out.println("Archivo cerrado: Empleado.dat");
            archiDIS.close();
        }
        catch(FileNotFoundException fnfe){System.out.println("Archivo no encontrado.");}
        catch(IOException ioe){System.out.println("Error al leer.");}
    }
}
