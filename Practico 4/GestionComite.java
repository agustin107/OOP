import java.util.*;
import java.io.*;       
/**
 * Write a description of class GestionComite here.
 * 
 * @author Agustin N. R. Ramirez
 * @version 1.0
 */
public class GestionComite
{
   public static void main(String [] args){
       Scanner teclado = new Scanner(System.in);
        char seguir= 's';
        
        
       try {
            FileOutputStream archiFOS = new FileOutputStream("D:\\Polizas.txt", true);
            DataOutputStream archiDOS = new DataOutputStream(archiFOS);
            while(seguir != 'n') {
                System.out.println("********UNIDAD DE RIESGO*********");
                System.out.print("Nombre del agricultor: ");
                String agricultor = teclado.nextLine();
                System.out.print("Cultivo: ");
                String cultivo = teclado.next();
                System.out.println("-------Fecha de la cosecha-----");
                System.out.print("dia: ");
                int dia = teclado.nextInt();
                System.out.print("mes: ");
                int mes = teclado.nextInt();
                System.out.print("anio: ");
                int anio = teclado.nextInt();
               
                Calendar fechaCosecha = new GregorianCalendar();
                fechaCosecha.set(anio,mes,dia);
                
                UnidadDeRiesgo unidad = new UnidadDeRiesgo(agricultor,cultivo,fechaCosecha);
                System.out.println("");
                
                System.out.println("****FORMULARIO DE CONTRATO DE POLIZA*****");
                System.out.print("Tipo de cobertura(granizo/incendio/resiembra): ");
                String cobertura = teclado.next();
                System.out.println("Fecha del contrato");
                System.out.print("dia: ");
                dia = teclado.nextInt();
                System.out.print("mes: ");
                mes = teclado.nextInt();
                System.out.print("anio: ");
                anio = teclado.nextInt();
                System.out.print("Valor de la poliza: ");
                double valorPoliza = teclado.nextDouble();
                System.out.print("Valor asegurado: ");
                double valorAsegurado = teclado.nextDouble();
                System.out.print("Momento de Cancelacion?(inicial/final): ");
                String cancelacion = teclado.next();
                Calendar fechaContrato = new GregorianCalendar();
                fechaContrato.set(anio,mes,dia);
                
                System.out.print("Se produjo un siniestro? (s/n): ");
                char produjo = teclado.next().charAt(0);
                if(produjo == 's') {
                   
                    System.out.println("Ingrese fecha del siniestro");
                    System.out.print("Dia: ");
                    dia = teclado.nextInt();
                    System.out.print("Mes: ");
                    mes = teclado.nextInt();
                    System.out.print("Anio: ");
                    anio = teclado.nextInt();
                    System.out.print("Ingrese porcentaje de daño: ");
                    double porcentajeDaño = teclado.nextDouble();
                    
                    Calendar fecha = new GregorianCalendar();
                    fecha.set(anio,mes,dia);
                    
                    Siniestro siniestro1 = new Siniestro(fecha,porcentajeDaño);
                    
                    Poliza poliza1 = new Poliza(cobertura,fechaContrato,valorPoliza,valorAsegurado,
                    cancelacion,unidad,siniestro1);
                    poliza1.resumenIndemnizacion();
                    System.out.print("Se llevara a cabo una indemnizacion de $"+poliza1.indemnizacion());
                    archiDOS.writeUTF(poliza1.getCobertura());
                    archiDOS.writeUTF(unidad.getCultivo());
                    archiDOS.writeDouble(siniestro1.getPorcentajeDanio());
                    archiDOS.writeDouble(poliza1.indemnizacion());
                } else {
                    Poliza poliza1 = new Poliza(cobertura,fechaContrato,valorPoliza,valorAsegurado,
                    cancelacion,unidad);
                    poliza1.resumenIndemnizacion();
                    archiDOS.writeUTF(poliza1.getCobertura());
                    archiDOS.writeUTF(unidad.getCultivo());
                    archiDOS.writeDouble(0);
                    archiDOS.writeDouble(0);
                }
                System.out.println("");
                System.out.print("Desea crear mas polizas de seguro?(s/n): ");
                seguir = teclado.next().charAt(0);
            }//cierre del while
            archiDOS.close();
        }//cierre del try
        catch(FileNotFoundException fnfe) {
            System.out.println("ARCHIVO NO ENCONTRADO");
        }
        catch(IOException ioe) {
            System.out.println("error al grabar");
        }
   }
}
